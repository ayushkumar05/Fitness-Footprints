package com.example.fitnessfootprints;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.atomic.AtomicInteger;

public class AddNewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);

        Intent i = getIntent();
        String prevCalories = i.getStringExtra("prevCalories");
        int prevCaloriesNum = Integer.parseInt(prevCalories);


        CheckBox rice = findViewById(R.id.rice);
        CheckBox chapati = findViewById(R.id.chapati);
        CheckBox dal = findViewById(R.id.dal);
        CheckBox milk = findViewById(R.id.milk);
        CheckBox bread = findViewById(R.id.bread);
        CheckBox egg = findViewById(R.id.egg);
        CheckBox choc = findViewById(R.id.choco);

        CheckBox apple = findViewById(R.id.apple);
        CheckBox banana = findViewById(R.id.banana);
        CheckBox grapes = findViewById(R.id.grapes);
        CheckBox orange = findViewById(R.id.orange);
        CheckBox pineapple = findViewById(R.id.pineapple);
        CheckBox strawberry = findViewById(R.id.strawberry);

        CheckBox beans = findViewById(R.id.beans);
        CheckBox beer = findViewById(R.id.beer);
        CheckBox biryani = findViewById(R.id.biryani);
        CheckBox butter = findViewById(R.id.butter);
        CheckBox cheese = findViewById(R.id.cheese);
        CheckBox chicken = findViewById(R.id.chicken);
        CheckBox mocha = findViewById(R.id.mocha);
        CheckBox cola = findViewById(R.id.cola);
        CheckBox corn = findViewById(R.id.corn);
        CheckBox curd = findViewById(R.id.curd);
        CheckBox fishcurry = findViewById(R.id.fishcurry);
        CheckBox kebab = findViewById(R.id.kebab);
        CheckBox juice = findViewById(R.id.juice);
        CheckBox paneer = findViewById(R.id.paneer);
        CheckBox pizza = findViewById(R.id.pizza);


        CheckBox gulabJamun = findViewById(R.id.gulabJamun);
        CheckBox icecream = findViewById(R.id.iceCream);
        CheckBox jalebi = findViewById(R.id.jalebi);
        CheckBox rasmalai = findViewById(R.id.rasmalai);


        RadioButton light = findViewById(R.id.lightRadio);
        RadioButton moderate = findViewById(R.id.moderateRadio);
        RadioButton heavy = findViewById(R.id.heavyRadio);



        AtomicInteger calories = new AtomicInteger();


        rice.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 206); }
            else { calories.set(calories.get() - 206); }
        });


        chapati.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 297); }
            else { calories.set(calories.get() - 297); }
        });


        dal.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 105); }
            else { calories.set(calories.get() - 105); }
        });


        milk.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 103); }
            else { calories.set(calories.get() - 103); }
        });


        egg.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 155); }
            else { calories.set(calories.get() - 155); }
        });


        bread.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 198); }
            else { calories.set(calories.get() - 198); }
        });


        choc.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 1170); }
            else { calories.set(calories.get() - 1170); }
        });



        apple.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 72); }
            else { calories.set(calories.get() - 72); }
        });


        banana.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 105); }
            else { calories.set(calories.get() - 105); }
        });


        grapes.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 114); }
            else { calories.set(calories.get() - 114); }
        });

        orange.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 62); }
            else { calories.set(calories.get() - 62); }
        });

        pineapple.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 82); }
            else { calories.set(calories.get() - 82); }
        });

        strawberry.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 47); }
            else { calories.set(calories.get() - 47); }
        });




        beans.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 40); }
            else { calories.set(calories.get() - 40); }
        });


        beer.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 153); }
            else { calories.set(calories.get() - 153); }
        });


        biryani.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 240); }
            else { calories.set(calories.get() - 240); }
        });


        butter.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 102); }
            else { calories.set(calories.get() - 102); }
        });


        cheese.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 113); }
            else { calories.set(calories.get() - 113); }
        });


        chicken.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 425); }
            else { calories.set(calories.get() - 425); }
        });


        mocha.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 460); }
            else { calories.set(calories.get() - 460); }
        });


        cola.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 136); }
            else { calories.set(calories.get() - 136); }
        });


        corn.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 180); }
            else { calories.set(calories.get() - 180); }
        });


        curd.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 222); }
            else { calories.set(calories.get() - 222); }
        });


        fishcurry.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 217); }
            else { calories.set(calories.get() - 217); }
        });


        kebab.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 2000); }
            else { calories.set(calories.get() - 2000); }
        });


        juice.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 112); }
            else { calories.set(calories.get() - 112); }
        });


        paneer.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 1055); }
            else { calories.set(calories.get() - 1055); }
        });


        pizza.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 850); }
            else { calories.set(calories.get() - 850); }
        });




        gulabJamun.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 112); }
            else { calories.set(calories.get() - 112); }
        });


        icecream.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 140); }
            else { calories.set(calories.get() - 140); }
        });


        jalebi.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 250); }
            else { calories.set(calories.get() - 250); }
        });


        rasmalai.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() + 331); }
            else { calories.set(calories.get() - 331); }
        });


        /////////////////////////////////////////////////////////////////////////////////////


        light.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() - 20); }
            else { calories.set(calories.get() + 20); }
        });

        moderate.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() - 120); }
            else { calories.set(calories.get() + 120); }
        });

        heavy.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) { calories.set(calories.get() - 200); }
            else { calories.set(calories.get() + 200); }
        });



        /////////////////////////////////////////////////////////////////////////////////////



        Button addNew = findViewById(R.id.addnew);

        addNew.setOnClickListener(view -> {
            int cal = calories.get();
            Intent returnIntent = new Intent();
            int finalCalories = prevCaloriesNum + cal;
            String calString = String.valueOf(finalCalories);
            returnIntent.putExtra("calories", calString);
            setResult(Activity.RESULT_OK, returnIntent);
            finish();
        });



    } //onCreate

}