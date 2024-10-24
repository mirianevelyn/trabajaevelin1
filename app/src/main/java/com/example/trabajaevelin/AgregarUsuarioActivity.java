package com.example.trabajaevelin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgregarUsuarioActivity extends AppCompatActivity {

    EditText etNombres, etApellidos, etDireccion, etCelular, etCorreo;
    Button btnGuardar, btnAgregarFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_usuario);

        etNombres = findViewById(R.id.etNombres);

        etApellidos = findViewById(R.id.etApellidos);
        etDireccion = findViewById(R.id.etDireccion);
        etCelular = findViewById(R.id.etCelular);
        etCorreo = findViewById(R.id.etCorreo);
        btnGuardar = findViewById(R.id.btnGuardar);
        btnAgregarFoto = findViewById(R.id.btnAgregarFoto);

        // Acción al guardar el usuario
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los datos ingresados
                String nombres = etNombres.getText().toString();
                String apellidos = etApellidos.getText().toString();
                String direccion = etDireccion.getText().toString();
                String celular = etCelular.getText().toString();
                String correo = etCorreo.getText().toString();

                // Crear un nuevo objeto Usuario y agregarlo a la lista
                Usuario nuevoUsuario = new Usuario(nombres, apellidos, direccion, celular, correo);
                UsuariosData.listaUsuarios.add(nuevoUsuario);

                // Mostrar un mensaje de éxito
                Toast.makeText(AgregarUsuarioActivity.this, "Usuario guardado", Toast.LENGTH_SHORT).show();

                // Finalizar la actividad y volver a la pantalla anterior
                finish();
            }
        });

        // Acción para agregar una foto (puede implementar más adelante con permisos)
        btnAgregarFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Código para agregar foto (no implementado aquí)
            }
        });
    }
}
