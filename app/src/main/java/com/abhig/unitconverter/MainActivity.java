package com.abhig.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView temp_cardView, weight_cardView, length_cardView, speed_cardView, volume_cardView, time_cardView,area_cardView,pressure_cardView,current_cardView,force_cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp_cardView = findViewById(R.id.temp_card);
        weight_cardView = findViewById(R.id.weight_card);
        length_cardView = findViewById(R.id.length_card);
        speed_cardView = findViewById(R.id.speed_card);
        volume_cardView = findViewById(R.id.volume_card);
        time_cardView = findViewById(R.id.time_card);
        area_cardView = findViewById(R.id.area_card);
        pressure_cardView = findViewById(R.id.pressure_card);
        current_cardView =findViewById(R.id.current_card);
        force_cardView = findViewById(R.id.force_card);


        temp_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, temperature.class);
                startActivity(intent);
            }
        });
        weight_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Weight.class);
                startActivity(intent);
            }
        });
        length_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, length.class);
                startActivity(intent);
            }
        });
        speed_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, speed.class);
                startActivity(intent);
            }
        });
        volume_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, volume.class);
                startActivity(intent);
            }
        });
        time_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, time.class);
                startActivity(intent);
            }
        });
        area_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, area.class);
                startActivity(intent);
            }
        });
        pressure_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, pressure.class);
                startActivity(intent);
            }
        });
        current_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, current.class);
                startActivity(intent);
            }
        });
        force_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, force.class);
                startActivity(intent);
            }
        });
    }
}