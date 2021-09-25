package com.denisyeyson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BienvenidoActivity extends AppCompatActivity {

    TextView nombres, apellidos;
    Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        nombres = findViewById(R.id.lblNombres);
        apellidos = findViewById(R.id.lblApellidos);
        atras = findViewById(R.id.btnAtras3);

        Bundle receptor = getIntent().getExtras();
        String nombre = receptor.getString("NOMBRES");
        String apellido = receptor.getString("APELLIDOS");

        nombres.setText("Nombre: "+nombre);
        apellidos.setText("Apellido: "+apellido);

        atras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}