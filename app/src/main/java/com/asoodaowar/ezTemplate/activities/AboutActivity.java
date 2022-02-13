package com.asoodaowar.ezTemplate.activities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.asoodaowar.ezTemplate.R;

import mehdi.sakout.aboutpage.Element;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        simulateDayNight(/* DAY */ 0);
        Element adsElement = new Element();
        adsElement.setTitle(getString(R.string.advertise_us));

        View aboutPage = new mehdi.sakout.aboutpage.AboutPage(this)
                .isRTL(false)
                .setDescription(getString(R.string.about_page))
                .setImage(R.drawable.icon_about)
                .addItem(new Element().setTitle(getString(R.string.version)))
                .addItem(adsElement)
                .addGroup(getString(R.string.connect_us))
                .addEmail("info@asoodaowar.com")
                .addWebsite("http://www.asoodaowar.com")
                .addFacebook("asoodaowar/?modal=admin_todo_tour/")
                .addTwitter("AsoodaO")
                .addYoutube("UCcwSE_PRBnYrHm5UTaswUyw/?guided_help_flow=5")
//                .addPlayStore("com.ideashower.readitlater.pro")
//                .addInstagram("medyo80")
//                .addGitHub("medyo")
                .create();

        setContentView(aboutPage);
    }


    void simulateDayNight(int currentSetting) {
        final int DAY = 0;
        final int NIGHT = 1;
        final int FOLLOW_SYSTEM = 3;

        int currentNightMode = getResources().getConfiguration().uiMode
                & Configuration.UI_MODE_NIGHT_MASK;
        if (currentSetting == DAY && currentNightMode != Configuration.UI_MODE_NIGHT_NO) {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_NO);
        } else if (currentSetting == NIGHT && currentNightMode != Configuration.UI_MODE_NIGHT_YES) {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_YES);
        } else if (currentSetting == FOLLOW_SYSTEM) {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        }
    }

}



