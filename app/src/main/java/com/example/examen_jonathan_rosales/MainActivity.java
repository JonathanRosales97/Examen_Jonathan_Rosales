package com.example.examen_jonathan_rosales;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etPrimerParcial, etSegundoParcial, etPromedio;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrimerParcial = findViewById(R.id.etPrimerParcial);
        etSegundoParcial = findViewById(R.id.etSegundoParcial);
        etPromedio = findViewById(R.id.etPromedio);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularPromedio();
            }
        });
    }

    private void calcularPromedio() {
        try {
            double primerParcial = Double.parseDouble(etPrimerParcial.getText().toString());
            double segundoParcial = Double.parseDouble(etSegundoParcial.getText().toString());

            double promedio = (primerParcial + segundoParcial) / 2;

            etPromedio.setText(String.valueOf(promedio));
        } catch (NumberFormatException e) {
            etPromedio.setText("Error");
        }
    }
}


