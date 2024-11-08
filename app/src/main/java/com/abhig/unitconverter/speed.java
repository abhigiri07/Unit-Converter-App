package com.abhig.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class speed extends AppCompatActivity {
    EditText fromtext,toext;
    TextView textView1,textView2;
    Button mstokm, mstomph, kmtoms, kmtomph, mphtoms, mphtokm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        fromtext =findViewById(R.id.fromEtxt);
        toext = findViewById(R.id.toEtxt);
        textView1 = findViewById(R.id.fromtxt);
        textView2 = findViewById(R.id.totxt);
        mstokm =findViewById(R.id.ms_kmph);
        mstomph = findViewById(R.id.ms_mph);
        kmtoms = findViewById(R.id.kmph_ms);
        kmtomph = findViewById(R.id.kmph_mph);
        mphtoms = findViewById(R.id.mph_ms);
        mphtokm = findViewById(R.id.mph_kmph);

        mstokm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double ms = Double.parseDouble(s1);
                    double resKm = (ms*3.6);
                    toext.setText(""+resKm);
                    textView1.setText("Meter per Sec");
                    textView2.setText("Kilometer per hrs");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        mstomph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double ms = Double.parseDouble(s1);
                    double resMph = (ms*2.237);
                    toext.setText(""+resMph);
                    textView1.setText("Meter per Sec");
                    textView2.setText("Miles per hrs");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        kmtoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double km = Double.parseDouble(s1);
                    double resMs = (km/3.6);
                    toext.setText(""+resMs);
                    textView1.setText("Kilometer per hrs");
                    textView2.setText("Meter per Sec");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        kmtomph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double km = Double.parseDouble(s1);
                    double resMph = (km/1.609);
                    toext.setText(""+resMph);
                    textView1.setText("Kilometer per hrs");
                    textView2.setText("Miles per hrs");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        mphtoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double mph = Double.parseDouble(s1);
                    double resMs = (mph/2.237);
                    toext.setText(""+resMs);
                    textView1.setText("Miles per hrs");
                    textView2.setText("Meter per Sec");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        mphtokm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double mph = Double.parseDouble(s1);
                    double resKm = (mph*1.609);
                    toext.setText(""+resKm);
                    textView1.setText("Miles per hrs");
                    textView2.setText("Kilometer per hrs");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
    }
}