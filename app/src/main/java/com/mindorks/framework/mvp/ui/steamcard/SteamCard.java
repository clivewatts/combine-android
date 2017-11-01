package com.mindorks.framework.mvp.ui.steamcard;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.data.network.model.App;
import com.mindorks.framework.mvp.data.network.model.Profile;
import com.mindorks.framework.mvp.ui.main.MainActivity;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.infinite.LoadMore;
import com.mindorks.placeholderview.annotations.swipe.SwipeCancelState;
import com.mindorks.placeholderview.annotations.swipe.SwipeIn;
import com.mindorks.placeholderview.annotations.swipe.SwipeInState;
import com.mindorks.placeholderview.annotations.swipe.SwipeOut;
import com.mindorks.placeholderview.annotations.swipe.SwipeOutState;

/**
 * Created by clivewatts on 2017/11/01.
 */

@Layout(R.layout.card_layout)
public class SteamCard {

    @View(R.id.profileImageView)
    private ImageView profileImageView;

    @View(R.id.nameAgeTxt)
    private TextView nameAgeTxt;

    @View(R.id.locationNameTxt)
    private TextView locationNameTxt;

    private App mApp;
    private Context mContext;
    private SwipePlaceHolderView mSwipeView;
    private SteamCardInterface delegate;

    public SteamCard(Context context, App app, SwipePlaceHolderView swipeView) {
        mContext = context;
        mApp = app;
        mSwipeView = swipeView;
    }

    @Resolve
    private void onResolved(){
        Glide.with(mContext).load(mApp.getDetails().getScreenshots().get(0)).into(profileImageView);
        nameAgeTxt.setText(mApp.getDetails().getName());
        locationNameTxt.setText(mApp.getDetails().getShortDescription());
        delegate.onSteamCardShown(mApp);
    }

    @SwipeOut
    private void onSwipedOut(){
        Log.d("EVENT", "onSwipedOut");
       // mSwipeView.addView(this);
    }

    @SwipeCancelState
    private void onSwipeCancelState(){
        Log.d("EVENT", "onSwipeCancelState");
    }

    @SwipeIn
    private void onSwipeIn(){
        Log.d("EVENT", "onSwipedIn");
    }

    @SwipeInState
    private void onSwipeInState(){
        Log.d("EVENT", "onSwipeInState");
    }

    @SwipeOutState
    private void onSwipeOutState(){
        Log.d("EVENT", "onSwipeOutState");
    }

    @LoadMore
    private void onLoadMore() {
        delegate.loadMoreCards();
    }

    public void setDelegate(SteamCardInterface steamCardinterface) {
        this.delegate = steamCardinterface;
    }


}