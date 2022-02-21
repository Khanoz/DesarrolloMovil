package com.example.anahuaccarebymn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

public class LoginIn_Activity extends AppCompatActivity {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    TextView loginError;
    Button entrar;
    Button cancelar;
    Button registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_in);
        InitElements();
        entrar = (Button) findViewById(R.id.LoginEntrarBtn);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login();
            }
        });
        cancelar = (Button) findViewById(R.id.LoginCancelarBtn);
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cancelar();
            }
        });
        registrar = (Button) findViewById(R.id.LoginRegistrarBtn);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Registrar();
            }
        });
    }

    private void InitElements(){
        preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    private void Login(){
        String email = ((TextView) findViewById(R.id.LoginEmail)).getText().toString();
        String password = ((TextView) findViewById(R.id.LoginPassword)).getText().toString();
        Set<String> datos = preferences.getStringSet(email, null);
        if(datos == null){
            loginError.setText("Error al inicio de sesion. Datos incorrectos.");
            return;
        }
        if(datos.toArray()[0].toString() == email && datos.toArray()[1].toString() == password){
            Log.d("Login: ", "Se inicio abre la nueva pantalla (todavia no existe)");
        }
    }
    private void Cancelar(){
        Intent activity = new Intent(this, MainActivity.class);
        startActivity(activity);
    }

    private void Registrar(){
        Intent activity = new Intent(this, UserInformation.class);
        startActivity(activity);
    }
}