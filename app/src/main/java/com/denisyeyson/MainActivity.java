package com.denisyeyson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btnPage1);
        btn2 = findViewById(R.id.btnPage2);
        btn3 = findViewById(R.id.btnPage3);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, EcuacionSegundoGradoActivity.class);
                startActivity(intent1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent irpage = new Intent(MainActivity.this, IntentExplicitoActivity.class);
                startActivity(irpage);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent_implicito = new Intent(Intent.ACTION_VIEW);
                intent_implicito.setData(Uri.parse("https://www.google.com.pe"));
                startActivity(intent_implicito);
            }
        });
    }
}