package com.abhig.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class current extends AppCompatActivity {
    EditText fromtext,toext;
    TextView textView1,textView2;
    Button jtow,jtokc,wtoj,wtokc,kctoj,kctow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current);

        fromtext =findViewById(R.id.fromEtxt);
        toext = findViewById(R.id.toEtxt);
        textView1 = findViewById(R.id.fromtxt);
        textView2 = findViewById(R.id.totxt);
        jtow =findViewById(R.id.j_w);
        jtokc = findViewById(R.id.j_kc);
        wtoj = findViewById(R.id.w_j);
        wtokc = findViewById(R.id.w_kc);
        kctoj = findViewById(R.id.kc_j);
        kctow = findViewById(R.id.kc_w);

        jtow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double j = Double.parseDouble(s1);
                    double resw =(j/3600) ;
                    toext.setText(""+resw);
                    textView1.setText("Joule");
                    textView2.setText("Watt-hour");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        jtokc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double w = Double.parseDouble(s1);
                    double reskc =(w/4184) ;
                    toext.setText(""+reskc);
                    textView1.setText("joule");
                    textView2.setText("Kilocalorie");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        wtoj.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double w = Double.parseDouble(s1);
                    double resj =(w*3600) ;
                    toext.setText(""+resj);
                    textView1.setText("Watt-hour");
                    textView2.setText("joule");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        wtokc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double w = Double.parseDouble(s1);
                    double reskc =(w/1.162) ;
                    toext.setText(""+reskc);
                    textView1.setText("Watt-hour");
                    textView2.setText("Kilocalorie");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        kctoj.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double kc = Double.parseDouble(s1);
                    double resj =(kc*4184) ;
                    toext.setText(""+resj);
                    textView1.setText("Kilocalorie");
                    textView2.setText("Joule");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        kctow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double kc = Double.parseDouble(s1);
                    double resw =(kc*1.162) ;
                    toext.setText(""+resw);
                    textView1.setText("Kilocalorie");
                    textView2.setText("Watt-hour");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
    }
}