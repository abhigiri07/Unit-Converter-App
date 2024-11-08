package com.abhig.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class time extends AppCompatActivity {
    EditText fromtext,toext;
    TextView textView1,textView2;
    Button stom, stoh, mtos,mtoh,htos,htom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        fromtext =findViewById(R.id.fromEtxt);
        toext = findViewById(R.id.toEtxt);
        textView1 = findViewById(R.id.fromtxt);
        textView2 = findViewById(R.id.totxt);
        stom =findViewById(R.id.s_m);
        stoh = findViewById(R.id.s_h);
        mtos = findViewById(R.id.m_s);
        mtoh = findViewById(R.id.m_h);
        htos = findViewById(R.id.h_s);
        htom = findViewById(R.id.h_m);

        stom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double s = Double.parseDouble(s1);
                    double resM = (s/60);
                    toext.setText(""+resM);
                    textView1.setText("Second");
                    textView2.setText("Minute");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        stoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double s = Double.parseDouble(s1);
                    double resH = (s/3600);
                    toext.setText(""+resH);
                    textView1.setText("Second");
                    textView2.setText("Hour");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        mtos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double m = Double.parseDouble(s1);
                    double resS = (m*60);
                    toext.setText(""+resS);
                    textView1.setText("Minute");
                    textView2.setText("Second");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        mtoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double m = Double.parseDouble(s1);
                    double resH = (m/60);
                    toext.setText(""+resH);
                    textView1.setText("Minute");
                    textView2.setText("Hour");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        htos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double h = Double.parseDouble(s1);
                    double resS = (h*3600);
                    toext.setText(""+resS);
                    textView1.setText("Hour");
                    textView2.setText("Second");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        htom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double h = Double.parseDouble(s1);
                    double resM = (h*60);
                    toext.setText(""+resM);
                    textView1.setText("Hour");
                    textView2.setText("Minute");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
    }
}