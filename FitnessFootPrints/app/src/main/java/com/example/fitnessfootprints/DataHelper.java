package com.example.fitnessfootprints;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class DataHelper {
    public static ArrayList<com.example.fitnessfootprints.Workout>loadWorkout(Context context){
        ArrayList<com.example.fitnessfootprints.Workout>workouts=new ArrayList<>();
        String json = "";
        try {
            InputStream is = context.getAssets().open("WorkoutData.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer,Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        try {
            JSONObject obj = new JSONObject(json);
            JSONArray jsonArray = obj.getJSONArray("Benchmark") ;
            for(int i=0;i<jsonArray.length();i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                com.example.fitnessfootprints.Workout workout = new com.example.fitnessfootprints.Workout();
                workout.setTitle(jsonObject.getString("title"));
                workout.setWod(jsonObject.getString("wod"));
                workouts.add(workout);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return  workouts;
    }
}
