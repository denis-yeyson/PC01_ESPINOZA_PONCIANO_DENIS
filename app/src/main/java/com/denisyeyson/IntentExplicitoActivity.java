package com.denisyeyson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentExplicitoActivity extends AppCompatActivity {

    EditText nombres, apellidos;
    Button atras, ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicito_manifest);

        nombres = findViewById(R.id.txtNombres);
        apellidos = findViewById(R.id.txtApellidos);
        atras = findViewById(R.id.btnAtras);
        ingresar = findViewById(R.id.btnEnviar);

        ingresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String nom = nombres.getText().toString();
                String ape = apellidos.getText().toString();

                Intent intent_explicito = new Intent(IntentExplicitoActivity.this, BienvenidoActivity.class);
                intent_explicito.putExtra("NOMBRES",nom);
                intent_explicito.putExtra("APELLIDOS",ape);
                startActivity(intent_explicito);
            }
        });

        atras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}