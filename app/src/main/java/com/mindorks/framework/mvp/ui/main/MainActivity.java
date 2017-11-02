package com.mindorks.framework.mvp.ui.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.TextViewCompat;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.OkHttpResponseAndParsedRequestListener;
import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.data.db.model.SteamGameCard;
import com.mindorks.framework.mvp.data.network.model.App;
import com.mindorks.framework.mvp.data.network.model.CombineCollection;
import com.mindorks.framework.mvp.data.network.model.Platforms;
import com.mindorks.framework.mvp.data.network.model.Profile;
import com.mindorks.framework.mvp.data.network.model.Tag;
import com.mindorks.framework.mvp.ui.base.BaseActivity;
import com.mindorks.framework.mvp.ui.steamcard.CustomSwipePlaceHolderView;
import com.mindorks.framework.mvp.ui.steamcard.SteamCard;
import com.mindorks.framework.mvp.ui.steamcard.SteamCardInterface;
import com.mindorks.framework.mvp.utils.cards.CardUtils;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.mindorks.placeholderview.annotations.infinite.LoadMore;
import com.mindorks.placeholderview.annotations.swipe.SwipeView;
import com.mindorks.placeholderview.listeners.ItemRemovedListener;
import com.stfalcon.frescoimageviewer.ImageViewer;

import java.util.List;

import okhttp3.Response;

public class MainActivity extends BaseActivity implements SteamCardInterface {

    private CustomSwipePlaceHolderView mSwipeView;
    private Context mContext;
    private CustomScrollView scrollView;
    private LinearLayout cardHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primary);
        mContext = MainActivity.this;

        scrollView = (CustomScrollView)findViewById(R.id.custom_scroll_view);
        mSwipeView = (CustomSwipePlaceHolderView)findViewById(R.id.cards_container);
        mSwipeView.setScrollView(scrollView);
        cardHolder = (LinearLayout)findViewById(R.id.steam_card_details_container);

        mContext = getApplicationContext();

        mSwipeView.getBuilder()
                .setDisplayViewCount(1)
                .setSwipeType(SwipePlaceHolderView.SWIPE_TYPE_HORIZONTAL)
                .setSwipeDecor(new SwipeDecor()
                        .setPaddingTop(0)
                        .setRelativeScale(0.00f)
                        .setSwipeMaxChangeAngle(0.0f)
                        .setSwipeInMsgLayoutId(R.layout.swipe_in_msg)
                        .setSwipeOutMsgLayoutId(R.layout.swipe_out_msg));

        mSwipeView.addItemRemoveListener(new ItemRemovedListener() {
            @Override
            public void onItemRemoved(int count) {
                if (count < 3) {
                    loadCards(true);
                }
            }
        });

        loadCards(false);
    }

    private void slowFadeIn(View view) {
        Animation animation1;
        animation1 = new AlphaAnimation(0.0f, 1.0f);
        animation1.setDuration(600);
        animation1.setStartOffset(100);

        view.startAnimation(animation1);
    }

    private void slowFadeOut(View view) {
        Animation animation1;
        animation1 = new AlphaAnimation(1.0f, 0.0f);
        animation1.setDuration(400);
        animation1.setStartOffset(100);

        mSwipeView.startAnimation(animation1);
    }

    @Override
    protected void setUp() {

    }

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    private void loadCards(boolean refresh) {
        if (!refresh)
            showLoading();
        AndroidNetworking.get("https://young-reef-56885.herokuapp.com/queue")
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsOkHttpResponseAndObject(CombineCollection.class, new OkHttpResponseAndParsedRequestListener() {
                    @Override
                    public void onResponse(Response okHttpResponse, Object response) {
                        hideLoading();
                        for(App app : ((CombineCollection)response).getApps()){
                            SteamCard card = new SteamCard(mContext, app, mSwipeView);
                            card.setDelegate(MainActivity.this);
                            mSwipeView.addView(card);
                        }
                    }

                    @Override
                    public void onError(ANError anError) {
                        hideLoading();
                    }
                });
    }


    public void loadMoreCards() {
        loadCards(true);
    }

    @Override
    public void onSteamCardShown(final App app) {
        Log.i("SHOWN", app.getDetails().getName());
        findViewById(R.id.app_image_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ImageViewer.Builder(MainActivity.this, app.getDetails().getScreenshots())
                        .setStartPosition(0)
                        .show();
            }
        });
        addTagCardToLayout(app.getOwners().getTags());
        configureOsSupportCard(app.getDetails().getPlatforms());
        slowFadeIn(scrollView);
    }

    public void addTagCardToLayout(List<Tag> tags) {

        cardHolder.removeView(cardHolder.findViewWithTag("tag_card"));

        FrameLayout view = (FrameLayout)getLayoutInflater().inflate(R.layout.steam_card_tag_layout, null);
        view.setTag("tag_card");
        String tagString = new String();
        for(Tag t : tags) {
            if (tagString.equals("")) {
                tagString = t.getTag();
            } else {
                tagString = tagString + " | " + t.getTag();
            }
        }
        ((TextView)view.findViewById(R.id.tag_text)).setText(tagString);
        cardHolder.addView(view);

    }

    public void configureOsSupportCard(Platforms platforms) {
        ImageView w = (ImageView) findViewById(R.id.windows_compat_img);

        if (!platforms.getWindows()) {
            w.setAlpha(0.1f);
        }

        ImageView o = (ImageView) findViewById(R.id.osx_compat_img);

        if (!platforms.getMac()) {
            o.setAlpha(0.1f);
        }

        ImageView l = (ImageView) findViewById(R.id.linux_compat_img);

        if (!platforms.getLinux()) {
            l.setAlpha(0.1f);
        }

    }

}