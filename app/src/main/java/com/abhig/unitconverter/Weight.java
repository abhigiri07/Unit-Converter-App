package com.abhig.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Weight extends AppCompatActivity {
    EditText fromtext,toext;
    TextView textView1,textView2;
    Button ktog,ktot,gtok,gtot,ttok,ttog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        fromtext =findViewById(R.id.fromEtxt);
        toext = findViewById(R.id.toEtxt);
        textView1 = findViewById(R.id.fromtxt);
        textView2 = findViewById(R.id.totxt);
        ktog = findViewById(R.id.k_g);
        ktot = findViewById(R.id.k_t);
        gtok = findViewById(R.id.g_k);
        gtot = findViewById(R.id.g_t);
        ttok = findViewById(R.id.t_k);
        ttog = findViewById(R.id.t_g);


        ktog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double kg  = Double.parseDouble(s1);
                    double resG = (Double) ( kg*0.001);
                    toext.setText("" + resG);
                    textView1.setText("Kilogram");
                    textView2.setText("Gram");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        ktot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double Kg  = Integer.parseInt(s1);
                    double resKG = (Kg/1000);
                    toext.setText("" + resKG);
                    textView1.setText("Kilogram");
                    textView2.setText("Tonne");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        gtok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double kg  = Double.parseDouble(s1);
                    double KG = (kg/1000);
                    toext.setText("" + KG);
                    textView1.setText("Gram");
                    textView2.setText("Kilogram");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        gtot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    double g  = Double.parseDouble(s1);
                    double reston = (g/1000000);
                    toext.setText("" + reston);
                    textView2.setText("Tonne");
                    textView1.setText("Gram");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        ttok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    int Kg  = Integer.parseInt(s1);
                    Double resKG = Double.valueOf(( Kg*1000));
                    toext.setText("" + resKG);
                    textView1.setText("Tonne");
                    textView2.setText("Kilogram");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        ttog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    int ton  = Integer.parseInt(s1);
                    Double resg = Double.valueOf(( ton*1000000));
                    toext.setText("" + resg);
                    textView1.setText("Tonne");
                    textView2.setText("Gram");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
    }
}