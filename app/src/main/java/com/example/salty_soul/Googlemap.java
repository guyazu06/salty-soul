package com.example.salty_soul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Googlemap extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap myMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_googlemap);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) Googlemap.this);
    }
    public void onMapReady( GoogleMap googleMap) {

        myMap = googleMap;

        LatLng Ultrawave = new LatLng(32.16466686309683, 34.810321364189086);
        myMap.addMarker(new MarkerOptions().position(Ultrawave).title("Ultrawave"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(Ultrawave));
        LatLng A_Frame = new LatLng(32.01461772800096, 34.8086939408164);
        myMap.addMarker(new MarkerOptions().position(A_Frame).title("A Frame"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(A_Frame));
    }


    public void OnBack(View view) {
        Intent t1=new Intent(Googlemap.this, MainPage.class);
        startActivity(t1);
    }
}