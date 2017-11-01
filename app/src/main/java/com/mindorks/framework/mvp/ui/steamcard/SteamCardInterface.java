package com.mindorks.framework.mvp.ui.steamcard;

import com.mindorks.framework.mvp.data.network.model.App;

/**
 * Created by clivewatts on 2017/11/01.
 */

public interface SteamCardInterface {

    void onSteamCardShown(App app);
    void loadMoreCards();

}
