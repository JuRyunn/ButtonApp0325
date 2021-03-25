package com.example.buttonapp0325;

import android.view.View;

public class MyonClickListener implements View.OnClickListener {
        MainActivity mainActivity;
    public MyonClickListener(MainActivity mainActivity) {
       this.mainActivity = mainActivity;

    }

    @Override
    public void onClick(View v) {
        mainActivity.mTextView1.setText ("You Clicked JuRyun's Button");


    }
}
