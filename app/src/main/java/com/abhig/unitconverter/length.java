package com.abhig.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class length extends AppCompatActivity {

    EditText fromtext,toext;
    TextView textView1,textView2;
    Button cmtom,cmtokm,cmtoin,mtocm,mtokm,mtoin,kmtocm,kmtom,kmtoin,intocm,intom,intokm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        fromtext =findViewById(R.id.fromEtxt);
        toext = findViewById(R.id.toEtxt);
        textView1 = findViewById(R.id.fromtxt);
        textView2 = findViewById(R.id.totxt);
        cmtom = findViewById(R.id.cm_m);
        cmtokm = findViewById(R.id.cm_km);
        cmtoin = findViewById(R.id.cm_in);
        mtocm = findViewById(R.id.m_cm);
        mtokm = findViewById(R.id.m_km);
        mtoin = findViewById(R.id.m_in);
        kmtocm = findViewById(R.id.km_cm);
        kmtom = findViewById(R.id.km_m);
        kmtoin = findViewById(R.id.km_in);
        intocm = findViewById(R.id.in_cm);
        intom = findViewById(R.id.in_m);
        intokm = findViewById(R.id.in_km);

        cmtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double cm = Double.parseDouble(s1);
                    double resM = (cm/100);
                    toext.setText(""+resM);
                    textView1.setText("Centimeter");
                    textView2.setText("Meter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        cmtokm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double cm = Double.parseDouble(s1);
                    double resKm = (cm/100000);
                    toext.setText(""+resKm);
                    textView1.setText("Centimeter");
                    textView2.setText("Kilometer");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        cmtoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double cm = Double.parseDouble(s1);
                    double resIn = (cm/2.54);
                    toext.setText(""+resIn);
                    textView1.setText("Centimeter");
                    textView2.setText("Inch");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        mtocm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double m = Double.parseDouble(s1);
                    double resCm = (m*100);
                    toext.setText(""+resCm);
                    textView1.setText("Meter");
                    textView2.setText("Centimeter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        mtokm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double m = Double.parseDouble(s1);
                    double resKm = (m/1000);
                    toext.setText(""+resKm);
                    textView1.setText("Meter");
                    textView2.setText("Kilometer");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        mtoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double m = Double.parseDouble(s1);
                    double resIn = (m*39.37);
                    toext.setText(""+resIn);
                    textView1.setText("Meter");
                    textView2.setText("Inch");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        kmtocm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double km = Double.parseDouble(s1);
                    double resCm = (km*100000);
                    toext.setText(""+resCm);
                    textView1.setText("Kilometer");
                    textView2.setText("Centimeter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        kmtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double km = Double.parseDouble(s1);
                    double resM = (km*1000);
                    toext.setText(""+resM);
                    textView1.setText("Kilometer");
                    textView2.setText("Meter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        kmtoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double km = Double.parseDouble(s1);
                    double resIn = (km*39370.1);
                    toext.setText(""+resIn);
                    textView1.setText("Kilometer");
                    textView2.setText("Inch");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        intocm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double in = Double.parseDouble(s1);
                    double resCm = (in*2.54);
                    toext.setText(""+resCm);
                    textView1.setText("Inch");
                    textView2.setText("Centimeter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        intom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double in = Double.parseDouble(s1);
                    double resM = (in/39.37);
                    toext.setText(""+resM);
                    textView1.setText("Inch");
                    textView2.setText("Meter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        intokm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double in = Double.parseDouble(s1);
                    double reskm = (in/39370.1);
                    toext.setText(""+reskm);
                    textView1.setText("Inch");
                    textView2.setText("Kilometer");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
    }
}