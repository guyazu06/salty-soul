package com.example.salty_soul;

import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_page);
        ImageButton Battery  = findViewById(R.id.Battery);

        Battery.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                BatteryManager bm = (BatteryManager) getApplicationContext().getSystemService(Context.BATTERY_SERVICE);
                int batLevel = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
                Toast.makeText(MainPage.this, "You Have " + batLevel + "%", Toast.LENGTH_LONG).show();
            }


        });


    }


    public void OnShort(View v) {
        Intent t1=new Intent(MainPage.this, ShortBoard.class);
        startActivity(t1);

    }
    public void OnLong(View v) {
        Intent t1=new Intent(MainPage.this, LongBoard.class);
        startActivity(t1);

    }
    public void OnFish(View v) {
        Intent t1=new Intent(MainPage.this, Fish.class);
        startActivity(t1);

    }

    public void Onmap(View view) {
        Intent t1=new Intent(MainPage.this, Googlemap.class);
        startActivity(t1);
    }
}