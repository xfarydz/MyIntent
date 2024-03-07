package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button btnGo , btnSubmit;
    EditText etUrl , etUrl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo = findViewById(R.id.btnGo);

        etUrl = findViewById(R.id.etUrl);

        btnSubmit = findViewById(R.id.btnSubmit);

        etUrl2 = findViewById(R.id.etUrl2);


     btnGo.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String url =etUrl.getText().toString().trim();

             if (!url.isEmpty()){

                 Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                 startActivity(i);
             }
         }
     });

     btnSubmit.setOnClickListener(new View.OnClickListener() {
         @Override

         public void onClick(View view){

             String name = etUrl2.getText().toString();

             Intent i = new Intent(getApplicationContext(),SecondActivity.class);
             i.putExtra("key_name",name);

             startActivity(i);
         }
     });
    }
}