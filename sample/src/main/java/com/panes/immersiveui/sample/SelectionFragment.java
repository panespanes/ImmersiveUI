package com.panes.immersiveui.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by panes on 2016/8/25.
 */
public class SelectionFragment extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_selection, null);
        init(view);
        return view;
    }

    private void init(View view) {
        view.findViewById(R.id.hide).setOnClickListener(this);
        view.findViewById(R.id.immersiveTop).setOnClickListener(this);
        view.findViewById(R.id.immersiveBottom).setOnClickListener(this);
        view.findViewById(R.id.immersive).setOnClickListener(this);
        view.findViewById(R.id.fullScreen).setOnClickListener(this);
        view.findViewById(R.id.quit).setOnClickListener(this);
    }

    private void startAct(int action) {
        Intent intent = new Intent(getActivity(), PreviewActivity.class);
        intent.putExtra("action", action);
        startActivity(intent);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.hide:
                startAct(0);
                break;
            case R.id.immersiveTop:
                startAct(1);
                break;
            case R.id.immersiveBottom:
                startAct(2);
                break;
            case R.id.immersive:
                startAct(3);
                break;
            case R.id.fullScreen:
                startAct(4);
                break;
            case R.id.quit:
                startAct(5);
                break;
        }
    }
}
