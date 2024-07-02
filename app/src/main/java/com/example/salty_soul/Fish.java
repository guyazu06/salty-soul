package com.example.salty_soul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Fish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fish);
    }

    public void OnFish1(View view) {
        Intent t1=new Intent(Fish.this, Fish1.class);
        startActivity(t1);
    }

    public void OnFish3(View view) {
        Intent t1=new Intent(Fish.this, Fish2.class);
        startActivity(t1);
    }

    public void OnBack(View view) {
        Intent t1=new Intent(Fish.this, MainPage.class);
        startActivity(t1);
    }
}