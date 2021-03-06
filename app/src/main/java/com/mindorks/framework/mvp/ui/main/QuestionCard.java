/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.mindorks.framework.mvp.ui.main;

import android.content.Context;
import android.util.Log;

import com.androidnetworking.widget.ANImageView;
import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.data.db.model.SteamGameCard;
import com.mindorks.framework.mvp.utils.OnSwipeTouchListener;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.NonReusable;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;

/**
 * Created by janisharali on 28/01/17.
 */

@NonReusable
@Layout(R.layout.card_layout)
public class QuestionCard {

//    private static final String TAG = "QuestionCard";
//
//    @View(R.id.steam_image_view)
//    private ANImageView steamImageView;
//
//    private SteamGameCard mSteamGameCard;
//
//
//    public QuestionCard(SteamGameCard card) {
//        mSteamGameCard = card;
//    }
//
//    @Resolve
//    private void onResolved() {
//        if (mSteamGameCard.getImgUrl() != null) {
//            steamImageView.setImageUrl(mSteamGameCard.getImgUrl());
//        }
//    }

    private void showCorrectOptions() {
//        for (int i = 0; i < 3; i++) {
//            Option option = mSteamGameCard.getOptionList().get(i);
//            Button button = null;
//            switch (i) {
//                case 0:
//                    button = mOption1Button;
//                    break;
//                case 1:
//                    button = mOption2Button;
//                    break;
//                case 2:
//                    button = mOption3Button;
//                    break;
//            }
//            if (button != null) {
//                if (option.isCorrect()) {
//                    button.setBackgroundColor(Color.GREEN);
//                } else {
//                    button.setBackgroundColor(Color.RED);
//                }
//            }
//        }
    }

//    @Click(R.id.btn_option_1)
//    public void onOption1Click() {
//        showCorrectOptions();
//    }
//
//    @Click(R.id.btn_option_2)
//    public void onOption2Click() {
//        showCorrectOptions();
//    }
//
//    @Click(R.id.btn_option_3)
//    public void onOption3Click() {
//        showCorrectOptions();
//    }

}
