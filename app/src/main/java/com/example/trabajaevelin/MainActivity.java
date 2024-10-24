package com.example.trabajaevelin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAgregarUsuario, btnVerUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAgregarUsuario = findViewById(R.id.btnAgregarUsuario);
        btnVerUsuarios = findViewById(R.id.btnVerUsuarios);

        // Ir a la actividad para agregar usuarios
        btnAgregarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AgregarUsuarioActivity.class);
                startActivity(intent);
            }
        });

        // Ir a la actividad para ver todos los usuarios
        btnVerUsuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaUsuariosActivity.class);
                startActivity(intent);
            }
        });
    }
}
