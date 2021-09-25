package com.denisyeyson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EcuacionSegundoGradoActivity extends AppCompatActivity {

    TextView resultado;
    EditText varA,varB,varC;
    Button limpiar, calcular,atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion_segundo_grado_manifest);

        resultado = findViewById(R.id.lblResultado1);
        varA = findViewById(R.id.txtNum1);
        varB = findViewById(R.id.txtNum2);
        varC = findViewById(R.id.txtNum3);
        limpiar = findViewById(R.id.btnLimpiarEjercicio1);
        calcular = findViewById(R.id.btnCalcularEjercicio1);
        atras = findViewById(R.id.btnAtras1);

        calcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String rpta = "";
                double A = Double.parseDouble(varA.getText().toString());
                double B = Double.parseDouble(varA.getText().toString());
                double C = Double.parseDouble(varA.getText().toString());

                if ((A == 0) && (B == 0) && (C == 0)) {
                    rpta = "La ecuación tiene infinitas soluciones.";
                }

                // 0x^2 + 0x + c = 0  con c distinto de 0

                if ((A == 0) && (B == 0) && (C != 0)) {
                    rpta = "La ecuación no tiene solución.";
                }

                // ax^2 + bx + 0 = 0  con a y b distintos de 0

                if ((A != 0) && (B != 0) && (C == 0)) {
                    rpta = "x1 = 0; \n"+("x2 = " + (-B / A));
                }


                // 0x^2 + bx + c = 0  con b y c distintos de 0

                if ((A == 0) && (B != 0) && (C != 0)) {
                    rpta = ("x1 = x2 = " + (-C / B));
                }

                // ax^2 + bx + c = 0  con a, b y c distintos de 0

                if ((A != 0) && (B != 0) && (C != 0)) {

                    double discriminante = B*B - (4 * A * C);

                    if (discriminante < 0) {
                        rpta = "La ecuación no tiene soluciones reales";
                    }  else {
                        String rpta1 = ("x1 = " + (-B + Math.sqrt(discriminante))/(2 * A));
                        String rpta2 = ("x2 = " + (-B - Math.sqrt(discriminante))/(2 * A));
                        rpta = "{"+rpta1+";"+rpta2+"}";
                    }
                }if ((A == 0) && (B == 0) && (C == 0)) {
                    rpta = "La ecuación tiene infinitas soluciones.";
                }

                // 0x^2 + 0x + c = 0  con c distinto de 0

                if ((A == 0) && (B == 0) && (C != 0)) {
                    rpta = "La ecuación no tiene solución.";
                }

                // ax^2 + bx + 0 = 0  con a y b distintos de 0

                if ((A != 0) && (B != 0) && (C == 0)) {
                    String rpta1 =("x1 = 0");
                    String rpta2 =("x2 = " + (-B / A));
                    rpta = "{"+rpta1+";"+rpta2+"}";
                }


                // 0x^2 + bx + c = 0  con b y c distintos de 0

                if ((A == 0) && (B != 0) && (C != 0)) {
                    rpta = ("x1 = x2 = " + (-C / B));
                }

                // ax^2 + bx + c = 0  con a, b y c distintos de 0

                if ((A != 0) && (B != 0) && (C != 0)) {

                    double discriminante = B*B - (4 * A * C);

                    if (discriminante < 0) {
                        rpta = "La ecuación no tiene soluciones reales";
                    }  else {
                        String rpta1 =("x1 = " + (-B + Math.sqrt(discriminante))/(2 * A));
                        String rpta2 =("x2 = " + (-B - Math.sqrt(discriminante))/(2 * A));
                        rpta = "{"+rpta1+";"+rpta2+"}";
                    }
                }
                limpiarEjercicios1();
                resultado.setText(rpta);
            }
        });

        limpiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                limpiarEjercicios1();
            }
        });

        atras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }

    public void limpiarEjercicios1() {
        varA.setText("");
        varB.setText("");
        varC.setText("");
        resultado.setText("Resultado ?");
    }
}