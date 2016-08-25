package com.panes.immersiveui;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by panes on 2016/8/25.
 */
public class ImmersiveUI {
    private static String TAG = "ImmersiveUI";
    public static void hideActionBar(Activity activity) {
        if (activity instanceof AppCompatActivity) {
            ActionBar actionBar = ((AppCompatActivity)activity).getSupportActionBar();
            if (actionBar == null) {
                Log.d(TAG, "action bar is null.");
            } else {
                actionBar.hide();
            }
        } else {
            Log.d(TAG, "not an AppCompatActivity");
        }
    }
    public static void showActionBar(Activity activity) {
        if (activity instanceof AppCompatActivity) {
            ActionBar actionBar = ((AppCompatActivity)activity).getSupportActionBar();
            if (actionBar == null) {
                Log.d(TAG, "action bar is null.");
            } else {
                actionBar.show();
            }
        } else {
            Log.d(TAG, "not an AppCompatActivity");
        }
    }

    public static void hideHead(Activity activity) {
        setFlag(activity, View.SYSTEM_UI_FLAG_FULLSCREEN);
        hideActionBar(activity);
    }

    private static void setFlag(Activity activity, int flag) {
        activity.getWindow().getDecorView().setSystemUiVisibility(flag);
    }


    public static void setHead(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            setFlag(activity, View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            activity.getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        hideActionBar(activity);
    }
    public static void immersive(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            setFlag(activity, View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            activity.getWindow().setStatusBarColor(Color.TRANSPARENT);
            activity.getWindow().setNavigationBarColor(Color.TRANSPARENT);
        }
        hideActionBar(activity);
    }
    public static void setFoot(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            setFlag(activity, View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION );
            activity.getWindow().setNavigationBarColor(Color.TRANSPARENT);
        }
        hideActionBar(activity);
    }

    public static void quit(Activity activity){
        setFlag(activity, View.SYSTEM_UI_FLAG_VISIBLE);
        showActionBar(activity);
    }

    public static void fullScreen(Activity activity) {
        if (Build.VERSION.SDK_INT >= 19){
            setFlag(activity,  View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }
}
