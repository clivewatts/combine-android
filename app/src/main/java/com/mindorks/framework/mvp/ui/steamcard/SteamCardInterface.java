package com.mindorks.framework.mvp.ui.steamcard;

import com.mindorks.framework.mvp.data.network.model.App;
import com.mindorks.placeholderview.SwipePlaceHolderView;

/**
 * Created by clivewatts on 2017/11/01.
 */

public interface SteamCardInterface {

    void onSteamCardShown(App app, SwipePlaceHolderView view);
    void loadMoreCards();

}
