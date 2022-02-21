package com.example.anahuaccarebymn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Pregunta2 extends AppCompatActivity {

    RadioButton ninguno;
    RadioButton temp37;
    RadioButton dolorMuscular;
    RadioButton dolorCabeza;
    RadioButton tos;
    RadioButton dolorGarganta;
    RadioButton escNasal;
    RadioButton ojosRojos;
    RadioButton comezon;
    RadioButton ardor;
    RadioButton dolorOjos;
    Button boton;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2);
        Intent intent = getIntent();
        contador = intent.getIntExtra("contador", 0);
        ninguno = (RadioButton) findViewById(R.id.Preg2Ninguno);
        temp37 = (RadioButton) findViewById(R.id.Preg2Temp37);
        dolorMuscular = (RadioButton) findViewById(R.id.Preg2DolorMusc);
        dolorCabeza = (RadioButton) findViewById(R.id.Preg2DolorCabeza);
        tos = (RadioButton) findViewById(R.id.Preg2Tos);
        dolorGarganta = (RadioButton) findViewById(R.id.Preg2DolorGarg);
        escNasal = (RadioButton) findViewById(R.id.Preg2EscNasal);
        ojosRojos = (RadioButton) findViewById(R.id.Preg2OjosRojos);
        comezon = (RadioButton) findViewById(R.id.Preg2Comezon);
        ardor = (RadioButton) findViewById(R.id.Preg2Ardor);
        dolorOjos = (RadioButton) findViewById(R.id.Preg2DolorOjos);
        boton = (Button) findViewById(R.id.Preg2SiguienteButton);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                contador+=(ninguno.isChecked() ? 0 : 0) +
                        (temp37.isChecked() ? 2 : 0) +
                        (dolorMuscular.isChecked() ? 2 : 0) +
                        (dolorCabeza.isChecked() ? 1 : 0) +
                        (tos.isChecked() ? 2 : 0) +
                        (dolorGarganta.isChecked() ? 2 : 0) +
                        (escNasal.isChecked() ? 2 : 0) +
                        (ojosRojos.isChecked() ? 1 : 0) +
                        (comezon.isChecked() ? 1 : 0) +
                        (ardor.isChecked() ? 1 : 0) +
                        (dolorOjos.isChecked() ? 1 : 0);
                IrActivity(MainActivity.class);
            }
        });
    }
    private void IrActivity(Class<?> activity){
        Intent intent = new Intent(this, activity);
        intent.putExtra("contador", contador);
        startActivity(intent);
    }
}