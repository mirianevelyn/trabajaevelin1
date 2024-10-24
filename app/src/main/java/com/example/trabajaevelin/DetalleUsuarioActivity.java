package com.example.trabajaevelin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleUsuarioActivity extends AppCompatActivity {

    TextView tvNombres, tvApellidos, tvDireccion, tvCelular, tvCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_usuario);

        tvNombres = findViewById(R.id.tvNombres);
        tvApellidos = findViewById(R.id.tvApellidos);
        tvDireccion = findViewById(R.id.tvDireccion);
        tvCelular = findViewById(R.id.tvCelular);
        tvCorreo = findViewById(R.id.tvCorreo);

        // Obtener los datos pasados por el Intent
        String nombres = getIntent().getStringExtra("usuarioNombre");
        String apellidos = getIntent().getStringExtra("usuarioApellidos");
        String direccion = getIntent().getStringExtra("usuarioDireccion");
        String celular = getIntent().getStringExtra("usuarioCelular");
        String correo = getIntent().getStringExtra("usuarioCorreo");

        // Mostrar los detalles del usuario
        tvNombres.setText("Nombres: " + nombres);
        tvApellidos.setText("Apellidos: " + apellidos);
        tvDireccion.setText("Dirección: " + direccion);
        tvCelular.setText("Celular: " + celular);
        tvCorreo.setText("Correo: " + correo);
    }
}
