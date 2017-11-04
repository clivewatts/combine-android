package com.mindorks.framework.mvp.utils.cards;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
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
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.data.network.model.App;
import com.mindorks.framework.mvp.data.network.model.CombineCollection;
import com.mindorks.framework.mvp.data.network.model.Owners;
import com.mindorks.framework.mvp.data.network.model.Platforms;
import com.mindorks.framework.mvp.data.network.model.Profile;
import com.mindorks.framework.mvp.data.network.model.Tag;

import org.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Response;

/**
 * Created by clivewatts on 2017/11/01.
 */

public class CardUtils {

    private static final String TAG = "Utils";

    public static FrameLayout getTagCard(List<Tag> tags, Activity activity) {

        FrameLayout view = (FrameLayout)activity.getLayoutInflater().inflate(R.layout.steam_card_tag_layout, null);
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
        return view;

    }

    public static LinearLayout getOsSupportCard(Platforms platforms, Activity activity) {

        LinearLayout view = (LinearLayout)activity.getLayoutInflater().inflate(R.layout.os_support_layout, null);

        ImageView w = (ImageView) view.findViewById(R.id.windows_compat_img);

        if (!platforms.getWindows()) {
            w.setVisibility(View.GONE);
        }

        ImageView o = (ImageView) view.findViewById(R.id.osx_compat_img);

        if (!platforms.getMac()) {
            o.setVisibility(View.GONE);
        }

        ImageView l = (ImageView) view.findViewById(R.id.linux_compat_img);

        if (!platforms.getLinux()) {
            l.setVisibility(View.GONE);
        }

        return view;
    }

    public static FrameLayout getSentimentCard(Owners owner, Activity activity) {
        FrameLayout view = (FrameLayout)activity.getLayoutInflater().inflate(R.layout.sentiment_card_layout, null);
        //TODO complete
        return null;
    }

    public static FrameLayout getPlayStatsCard(Owners owner, Activity activity) {
        //TODO COMPLETE
        return null;
    }

    public static void slowFadeIn(View view) {
        Animation animation1;
        animation1 = new AlphaAnimation(0.0f, 1.0f);
        animation1.setDuration(600);
        animation1.setStartOffset(100);
        view.startAnimation(animation1);
    }

    public static  void slowFadeOut(View view) {
        Animation animation1;
        animation1 = new AlphaAnimation(1.0f, 0.0f);
        animation1.setDuration(400);
        animation1.setStartOffset(100);
        view.startAnimation(animation1);
    }

}
