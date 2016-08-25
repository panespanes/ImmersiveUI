package com.panes.immersiveui.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.panes.immersiveui.ImmersiveUI;

/**
 * Created by panes on 2016/8/25.
 */
public class PreviewActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fg_preview);
        int action = getIntent().getIntExtra("action", -1);
        init(action);
    }

    private void init(int action) {
        switch (action) {
            case 0:
                ImmersiveUI.hideHead(this);
                break;
            case 1:
                ImmersiveUI.setHead(this);
                break;
            case 2:
                ImmersiveUI.setFoot(this);
                break;
            case 3:
                ImmersiveUI.immersive(this);
                break;
            case 4:
                ImmersiveUI.fullScreen(this);
                break;
            default:
                Log.d("ImmersiveUI", "action is null.");
                break;
        }
    }
}
