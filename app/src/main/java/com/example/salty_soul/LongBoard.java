package com.example.salty_soul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LongBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_long_board);


    }

    public void OnLong1(View view) {
        Intent t1=new Intent(LongBoard.this, Long1.class);
        startActivity(t1);
    }

    public void OnLong2(View view) {
        Intent t1=new Intent(LongBoard.this, Long2.class);
        startActivity(t1);
    }

    public void OnBack(View view) {
        Intent t1=new Intent(LongBoard.this, MainPage.class);
        startActivity(t1);
    }
}
