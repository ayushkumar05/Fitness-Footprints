package com.example.fitnessfootprints;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private TextView title;
    private TextView wod;
    Chronometer chronometer;
    private long pauseOffset;
    ImageButton bt_start,bt_pause, bt_stop;
    private boolean running;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        title = findViewById(R.id.title_tv);
        wod = findViewById(R.id.wod_tv);
        chronometer = findViewById(R.id.chronometer);
        chronometer.setFormat("%s");
        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {

            }
        });
        Bundle extra = getIntent().getExtras();
        if(extra!=null){
            String t = extra.getString("EXTRA_TITLE");
            String w = extra.getString("EXTRA_WOD");
            title.setText(t);
            wod.setText(w);
        }
    }
    public void startChronometer(View v){
        if(!running){
            chronometer.start();
            chronometer.setBase(SystemClock.elapsedRealtime()-pauseOffset);
            running=true;
        }
    }
    public void pauseChronometer(View v){
        if(running){
            chronometer.stop();
            pauseOffset=SystemClock.elapsedRealtime()-chronometer.getBase();
            running=false;
        }
    }
    public void resetChronometer(View v){
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffset = 0;
    }
}