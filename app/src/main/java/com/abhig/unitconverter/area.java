package com.abhig.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class area extends AppCompatActivity {
    EditText fromtext,toext;
    TextView textView1,textView2;
    Button sctosm, sctosf, smtosc,smtosf,sftosc,sftosm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        fromtext =findViewById(R.id.fromEtxt);
        toext = findViewById(R.id.toEtxt);
        textView1 = findViewById(R.id.fromtxt);
        textView2 = findViewById(R.id.totxt);
        sctosm =findViewById(R.id.sc_sm);
        sctosf = findViewById(R.id.sc_sf);
        smtosc = findViewById(R.id.sm_sc);
        smtosf = findViewById(R.id.sm_sf);
        sftosc = findViewById(R.id.sf_sc);
        sftosm = findViewById(R.id.sf_sm);

        sctosm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double sc = Double.parseDouble(s1);
                    double resSm =(sc/10000) ;
                    toext.setText(""+resSm);
                    textView1.setText("Square Centimeter");
                    textView2.setText("Square Meter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        sctosf.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double sc = Double.parseDouble(s1);
                    double resSf =(sc/929) ;
                    toext.setText(""+resSf);
                    textView1.setText("Square Centimeter");
                    textView2.setText("Square Foot");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        smtosc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double sm = Double.parseDouble(s1);
                    double resSc =(sm*10000) ;
                    toext.setText(""+resSc);
                    textView1.setText("Square Meter");
                    textView2.setText("Square Centimeter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        smtosf.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double sm = Double.parseDouble(s1);
                    double resSf =(sm*10.764) ;
                    toext.setText(""+resSf);
                    textView1.setText("Square Meter");
                    textView2.setText("Square Foot");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        sftosc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double sf = Double.parseDouble(s1);
                    double resSc =(sf*929) ;
                    toext.setText(""+resSc);
                    textView1.setText("Square Foot");
                    textView2.setText("Square Centimeter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        sftosm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double sf = Double.parseDouble(s1);
                    double resSm =(sf/10.764) ;
                    toext.setText(""+resSm);
                    textView1.setText("Square Foot");
                    textView2.setText("Square Meter");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
    }
}