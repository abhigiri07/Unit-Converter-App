package com.abhig.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class volume extends AppCompatActivity {
    EditText fromtext,toext;
    TextView textView1,textView2;
    Button ltoml, ltocm, mltol, mltocm, cmtol, cmtoml;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        fromtext =findViewById(R.id.fromEtxt);
        toext = findViewById(R.id.toEtxt);
        textView1 = findViewById(R.id.fromtxt);
        textView2 = findViewById(R.id.totxt);
        ltoml =findViewById(R.id.l_ml);
        ltocm = findViewById(R.id.l_cm);
        mltol = findViewById(R.id.ml_l);
        mltocm = findViewById(R.id.ml_cm);
        cmtol = findViewById(R.id.cm_l);
        cmtoml = findViewById(R.id.cm_ml);

        ltoml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double l = Double.parseDouble(s1);
                    double resMl = (l*1000);
                    toext.setText(""+resMl);
                    textView1.setText("Liter");
                    textView2.setText("Milliliter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        ltocm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double l = Double.parseDouble(s1);
                    double resCm = (l/1000);
                    toext.setText(""+resCm);
                    textView1.setText("Liter");
                    textView2.setText("Cubic Meter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });

        mltol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double ml = Double.parseDouble(s1);
                    double resL = (ml/1000);
                    toext.setText(""+resL);
                    textView1.setText("Milliliter");
                    textView2.setText("Liter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        mltocm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String s1 = fromtext.getText().toString();
                    double ml = Double.parseDouble(s1);
                    double resCm = (ml/1000000);
                    toext.setText(""+resCm);
                    textView1.setText("Milliliter");
                    textView2.setText("Cubic Meter");
                }   catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        cmtol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double cm = Double.parseDouble(s1);
                    double resL = (cm*1000);
                    toext.setText(""+resL);
                    textView1.setText("Cubic Meter");
                    textView2.setText("Liter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        cmtoml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double cm = Double.parseDouble(s1);
                    double resMl = (cm*1000000);
                    toext.setText(""+resMl);
                    textView1.setText("Cubic Meter");
                    textView2.setText("Milliliter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
    }
}