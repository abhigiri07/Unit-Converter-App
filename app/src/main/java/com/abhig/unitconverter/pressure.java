package com.abhig.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pressure extends AppCompatActivity {
    EditText fromtext,toext;
    TextView textView1,textView2;
    Button btop,btot,ptob,ptot,ttob,ttop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        fromtext =findViewById(R.id.fromEtxt);
        toext = findViewById(R.id.toEtxt);
        textView1 = findViewById(R.id.fromtxt);
        textView2 = findViewById(R.id.totxt);
        btop =findViewById(R.id.b_p);
        btot = findViewById(R.id.b_t);
        ptob = findViewById(R.id.p_b);
        ptot = findViewById(R.id.p_t);
        ttob = findViewById(R.id.t_b);
        ttop = findViewById(R.id.t_p);

        btop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double b = Double.parseDouble(s1);
                    double resp =(b*100000) ;
                    toext.setText(""+resp);
                    textView1.setText("Bar");
                    textView2.setText("Pascal");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        btot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double b = Double.parseDouble(s1);
                    double rest =(b*750.1) ;
                    toext.setText(""+rest);
                    textView1.setText("Bar");
                    textView2.setText("Torr");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        ptob.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double p = Double.parseDouble(s1);
                    double resb =(p/100000) ;
                    toext.setText(""+resb);
                    textView1.setText("Pascal");
                    textView2.setText("Bar");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        ptot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double p = Double.parseDouble(s1);
                    double rest =(p/133.3) ;
                    toext.setText(""+rest);
                    textView1.setText("Pascal");
                    textView2.setText("Torr");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        ttob.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double t = Double.parseDouble(s1);
                    double resb =(t/750.1) ;
                    toext.setText(""+resb);
                    textView1.setText("Torr");
                    textView2.setText("Bar");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        ttop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double t = Double.parseDouble(s1);
                    double resp =(t*133.3) ;
                    toext.setText(""+resp);
                    textView1.setText("Torr");
                    textView2.setText("Pascal");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
    }
}