package com.lqr;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lqr.recordprogress.LQRRecordProgress;

public class MainActivity extends AppCompatActivity {

    private LQRRecordProgress mRp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRp = (LQRRecordProgress) findViewById(R.id.rp);
    }

    public void start(View view) {
        mRp.start();
    }

    public void stop(View view) {
        mRp.stop();
    }

    public void change(View view) {
        mRp.setProgressColor(Color.parseColor("#FF1493"));
    }
}
