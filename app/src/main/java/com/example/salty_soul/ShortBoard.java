package com.example.salty_soul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShortBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_short_board);


    }

    public void OnShort1(View view) {

        Intent t1=new Intent(ShortBoard.this,Short1.class);
        startActivity(t1);
    }

    public void OnShort2(View view) {
        Intent t1=new Intent(ShortBoard.this,Short2.class);
        startActivity(t1);
    }

    public void OnBack(View view) {
        Intent t1=new Intent(ShortBoard.this, MainPage.class);
        startActivity(t1);
    }
}