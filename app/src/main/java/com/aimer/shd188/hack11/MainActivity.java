package com.aimer.shd188.hack11;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.util.Date;


public class MainActivity extends Activity {

    public static final String DATE_FORMAT="%02d:%02d:%02d";
    public static final int REFRSH_DELAY=500;
    private TextView mTextView;
    private final Handler mHandler= new Handler();
    private final Runnable mTimeRefresh=new Runnable() {
        @Override
        public void run() {
            Date d=new Date();
            mTextView.setText(String.format(DATE_FORMAT,d.getHours(),d.getMinutes(),d.getSeconds()));
            mHandler.postDelayed(this,REFRSH_DELAY);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView= (TextView) findViewById(R.id.main_clock_time);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mHandler.post(mTimeRefresh);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mHandler.removeCallbacks(mTimeRefresh);
    }
}
