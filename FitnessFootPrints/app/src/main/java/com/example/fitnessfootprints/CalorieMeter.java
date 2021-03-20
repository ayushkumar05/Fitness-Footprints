package com.example.fitnessfootprints;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalorieMeter extends AppCompatActivity {

    int LAUNCH_SECOND_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_meter);

        TextView numCal = findViewById(R.id.numcal);

        Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(v -> {
            numCal.setText("0");
        });


        Button calc = findViewById(R.id.calculate);
        calc.setOnClickListener(v -> {
            String prevCalories = numCal.getText().toString();
            Intent i = new Intent(this, AddNewActivity.class);
            i.putExtra("prevCalories", prevCalories);
            startActivityForResult(i, LAUNCH_SECOND_ACTIVITY);
        });



    } //onCreate




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == LAUNCH_SECOND_ACTIVITY) {
            if(resultCode == Activity.RESULT_OK){
                String result = data.getStringExtra("calories");
                TextView numCal = findViewById(R.id.numcal);
                numCal.setText(result);
            }
        }
    }//onActivityResult


}

