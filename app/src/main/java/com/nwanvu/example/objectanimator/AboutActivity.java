package com.nwanvu.example.objectanimator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class AboutActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        try {
            AdView adView = (AdView) findViewById(R.id.adViewAbout);
            AdRequest adRequest = new AdRequest.Builder()
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .addTestDevice("B6C0F8A598FF5913279921F8D99221AB") // LG G3
                    .addTestDevice("3F5FD39C8451BA21C3E3100EE39AB5CA") // Geny Nexus 4
                    .build();
            adView.loadAd(adRequest);
        } catch (Exception ignored) {
        }
    }
}
