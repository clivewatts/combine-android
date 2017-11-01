package com.mindorks.framework.mvp.utils.cards;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.OkHttpResponseAndParsedRequestListener;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mindorks.framework.mvp.data.network.model.App;
import com.mindorks.framework.mvp.data.network.model.CombineCollection;
import com.mindorks.framework.mvp.data.network.model.Profile;

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

    public static List<App> loadProfiles(Context context){
        try{


            return null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    private static String loadJSONFromAsset(Context context, String jsonFileName) {
        String json = null;
        InputStream is=null;
        try {
            AssetManager manager = context.getAssets();
            Log.d(TAG,"path "+jsonFileName);
            is = manager.open(jsonFileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
