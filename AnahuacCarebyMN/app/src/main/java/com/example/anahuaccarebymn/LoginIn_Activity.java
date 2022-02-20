package com.example.anahuaccarebymn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginIn_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_in);
    }

    // Metodo el boton siguiente
    public void AgregarInformacion(View view){
        Intent siguiente = new Intent(this, UserInformation.class);
        startActivity(siguiente);
    }
}