package com.example.fitnessfootprints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   


    public void bmiscreen(View view) {
        Intent in1 = new Intent(MainActivity.this, BmiCalculator.class);
        startActivity(in1);

    }

    public void waterReminderScreen(View view) {
        Intent in2 = new Intent(MainActivity.this, WaterReminder.class);
        startActivity(in2);
    }

    public void stepCounterScreen(View view) {
        Intent in3 = new Intent(MainActivity.this, StepCounter.class);
        startActivity(in3);
    }

    public void calorieMeterScreen(View view) {
        Intent in4 = new Intent(MainActivity.this, CalorieMeter.class);
        startActivity(in4);
    }

    public void workoutAppScreen(View view) {
        Intent in5 = new Intent(MainActivity.this, WorkoutMain.class);
        startActivity(in5);
    }
}