package com.example.phoneGapTutorial;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.DroidGap;

public class MyActivity extends DroidGap
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
//        super.loadUrl("file:///android_asset/www/Tutorial.html");
        super.loadUrl("file:///android_asset/www/iui-0.4/web-app/samples/music/music.html");
    }
}
