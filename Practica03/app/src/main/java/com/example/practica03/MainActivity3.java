package com.example.practica03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "OnStart 3", Toast.LENGTH_SHORT).show();
        // La actividad esta a punto de hacerse visible
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "OnResume 3", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visibld (ahora se "reanuda"
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "OnPause 3", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad (esta actividad esta a punto de ser "detenida")
        finish(); // termina el activity
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "OnStop 3", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "OnDestroy 3", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "OnRestart 3", Toast.LENGTH_SHORT).show();
    }

    // Metodo para el boton anterior
    public void Anterior (View view){
        Intent Anterior  = new Intent(this, MainActivity2.class);
        startActivity(Anterior);

    }

}