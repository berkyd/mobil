package com.example.oraimunka;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout layout;
    private EditText szoveg;
    private Button NBgomb;
    private Button KBgomb;
    private Button VSZgomb;
    private TextView textView;
    private Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        VSZgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int red = rnd.nextInt(256);
                int green = rnd.nextInt(256);
                int blue = rnd.nextInt(256);
                textView.setBackgroundColor(Color.rgb(red,green,blue));
                if ((red+green+blue)>450){
                    textView.setTextColor(Color.BLACK);
                }
                else{
                    textView.setTextColor(Color.WHITE);
                }
            }
        });
        KBgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(szoveg.getText().toString().toLowerCase());
            }
        });
        NBgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(szoveg.getText().toString().toUpperCase());
            }
        });
    }

    private  void  init(){
        layout = findViewById(R.id.layout);
        szoveg=findViewById(R.id.szoveg);
        NBgomb=findViewById(R.id.NBgomb);
        KBgomb=findViewById(R.id.KBgomb);
        VSZgomb=findViewById(R.id.VSZGomb);
        //textView=findViewById(R.id.textview);
        rnd=new Random();
    }
}