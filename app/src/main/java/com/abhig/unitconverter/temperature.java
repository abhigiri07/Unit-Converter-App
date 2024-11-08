package com.abhig.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class temperature extends AppCompatActivity {
    //String items[] = {"Celcius","Fehrenheit","Kelvin"};
    //AutoCompleteTextView autoCompleteTextView;
    //AutoCompleteTextView autoCompleteTextView2;
    EditText fromtext,toext;
    Button ctof,ctok,ftoc,ftok,ktoc,ktof;
    TextView textView1,textView2;

    ArrayAdapter<String> adapterItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

//        autoCompleteTextView =findViewById(R.id.auto_complete_txt);
//        autoCompleteTextView2 =findViewById(R.id.auto_complete_txt2);
        fromtext =findViewById(R.id.fromEtxt);
        toext = findViewById(R.id.toEtxt);
        ctof = findViewById(R.id.c_f);
        ctok = findViewById(R.id.c_k);
        ftoc = findViewById(R.id.f_c);
        ftok = findViewById(R.id.f_k);
        ktoc = findViewById(R.id.k_c);
        ktof = findViewById(R.id.k_f);

        textView1 = findViewById(R.id.fromtxt);
        textView2 = findViewById(R.id.totxt);
       // convtbtn = findViewById(R.id.convert);

//        adapterItems = new ArrayAdapter<String>(this,R.layout.list_item,items);
//        adapterItems.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        autoCompleteTextView.setAdapter(adapterItems);
//        autoCompleteTextView2.setAdapter(adapterItems);
//        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String item = parent.getItemAtPosition(position).toString();
//                textView1.setText(item);
//            }
//        });
//        autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String item = parent.getItemAtPosition(position).toString();
//                textView2.setText(item);
//            }
//        });

        ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = fromtext.getText().toString();
                    int celc = Integer.parseInt(s1);
                    float resfern = (float) (1.8 * celc + 32);
                    toext.setText("" + resfern);
                    textView1.setText("Celcius");
                    textView2.setText("Fehrenheit");
                }catch (Exception e){
                    fromtext.setError("Enter the Value");
                }
            }
        });

               ctok.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       try {
                       String s1 = fromtext.getText().toString();
                       int celc = Integer.parseInt(s1);
                       float reskel = (float) ( celc + 273.15);
                       toext.setText("" + reskel);
                       textView1.setText("Celcius");
                       textView2.setText("Kelvin");
                   }catch (Exception e){
                       fromtext.setError("Enter the Value");
                   }
                   }
               });

                ftoc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            String s1 = fromtext.getText().toString();
                            int feh = Integer.parseInt(s1);
                            float rescel = (float) (feh-32 *1.8);
                            toext.setText("" + rescel);
                            textView2.setText("Celcius");
                            textView1.setText("Fehrenheit");
                        }catch (Exception e){
                            fromtext.setError("Enter the Value");
                        }
                    }
                });

               ftok.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       try {
                           String s1 = fromtext.getText().toString();
                           int feh = Integer.parseInt(s1);
                           float reskel = (float) (feh-32 *1.8+273.15);
                           toext.setText("" + reskel);
                           textView2.setText("Kelvin");
                           textView1.setText("Fehrenheit");
                       }catch (Exception e){
                           fromtext.setError("Enter the Value");
                       }
                   }
               });


              ktoc.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      try {
                          String s1 = fromtext.getText().toString();
                          int kelvi = Integer.parseInt(s1);
                          float rescel = (float) (kelvi-273.15);
                          toext.setText("" + rescel);
                          textView2.setText("Celcius");
                          textView1.setText("Kelvin");
                      }catch (Exception e){
                          fromtext.setError("Enter the Value");
                      }
                  }
              });


               ktof.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       try {
                           String s1 = fromtext.getText().toString();
                           int kelvi = Integer.parseInt(s1);
                           float resfeh = (float) (kelvi-273.15*1.8+32);
                           toext.setText("" + resfeh);
                           textView1.setText("Kelvin");
                           textView2.setText("Fehrenheit");
                       }catch (Exception e){
                           fromtext.setError("Enter the Value");
                       }
                   }
               });


    }
}