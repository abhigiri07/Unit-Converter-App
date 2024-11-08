package com.abhig.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class force extends AppCompatActivity {
    EditText fromtext,toext;
    TextView textView1,textView2;
    Button dton, ntod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force);
        fromtext =findViewById(R.id.fromEtxt);
        toext = findViewById(R.id.toEtxt);
        textView1 = findViewById(R.id.fromtxt);
        textView2 = findViewById(R.id.totxt);
        dton =findViewById(R.id.d_n);
        ntod = findViewById(R.id.n_d);

        dton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String s1 = fromtext.getText().toString();
                try {
                    double d = Double.parseDouble(s1);
                    double resn =(d/100000) ;
                    toext.setText(""+resn);
                    textView1.setText("Dyne");
                    textView2.setText("Newton");
                }
                catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });
        ntod.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String s1 = fromtext.getText().toString();
                    double n = Double.parseDouble(s1);
                    double resd =(n*100000) ;
                    toext.setText(""+resd);
                    textView1.setText("Newton");
                    textView2.setText("Dyne");
                }catch (Exception e){
                    fromtext.setError("Enter The Value");
                }
            }
        });
    }
}