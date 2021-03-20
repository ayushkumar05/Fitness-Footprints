package com.example.fitnessfootprints;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

import java.io.IOException;

public class BmiCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);
    }

    public void calculate(View view) {
        EditText height = (EditText) findViewById(R.id.Height);
        EditText weight = (EditText) findViewById(R.id.Weight);
        TextView value = (TextView) findViewById(R.id.bmi_value);
        TextView msg = (TextView) findViewById(R.id.message_id);

        String message = "You are ";

        float w;
        float h;

        try

        {
            h = Float.parseFloat(height.getText().toString());
            w = Float.parseFloat(weight.getText().toString());
            float bmi = w / (h*h);
            DecimalFormat df = new DecimalFormat("#.00");
            float number = Float.valueOf(df.format(bmi));

            if (number <18.5){
                message+= "Underweight";
            }

            if (number >=18.5 && number<=24.9){
                message+= "Healthy";
            }

            if (number >24.9 && number<=29.9){
                message+= "OverWeight";
            }

            if (number >29.9){
                message+= "Obese";
            }



            value.setText(String.valueOf(number));
            msg.setText(message);
            height.setText("");
            weight.setText("");
        }

        catch(Throwable e)

        {
            Toast.makeText(BmiCalculator.this, " Enter valid values", Toast.LENGTH_SHORT).show();
            height.setText("");
            weight.setText("");
            value.setText("");
        }







    }

}