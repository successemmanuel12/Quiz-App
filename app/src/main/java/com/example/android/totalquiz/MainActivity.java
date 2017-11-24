package com.example.android.totalquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openSportQuestions(View view){
        Intent sport = new Intent(getApplicationContext(), Sports.class);
        startActivity(sport);
    }
    public  void openBibleQuestions(View view){
        startActivity(new Intent (getApplicationContext(),Bible.class));
    }
    public  void openFoodQuestions(View view){
        startActivity(new Intent (getApplicationContext(),FoodActivity.class));
    }
    public  void openGeneralQuestions(View view){
        startActivity(new Intent (getApplicationContext(),General.class));
    }


}
