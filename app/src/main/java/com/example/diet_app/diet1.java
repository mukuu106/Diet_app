package com.example.diet_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class diet1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet2);
    }
    public void PregnancyDiet(View view) {
        Intent intent = new Intent(this, diet2.class);
        startActivity(intent);
    }

    public void PCOSDiet(View view) {
        Intent intentt = new Intent(this, diet3.class);
        startActivity(intentt);
    }
}