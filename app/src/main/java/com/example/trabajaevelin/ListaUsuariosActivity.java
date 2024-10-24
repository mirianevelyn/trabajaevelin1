package com.example.trabajaevelin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaUsuariosActivity extends AppCompatActivity {

    ListView listViewUsuarios;
    ArrayAdapter<Usuario> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuarios);

        listViewUsuarios = findViewById(R.id.listViewUsuarios);

        // Inicializar los usuarios fijos en la lista, si aún no se han agregado
        UsuariosData.inicializarUsuariosFijos();

        // Configurar el adaptador para mostrar los usuarios
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, UsuariosData.listaUsuarios);
        listViewUsuarios.setAdapter(adapter);

        // Acción al hacer clic en un usuario de la lista
        listViewUsuarios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Usuario usuarioSeleccionado = UsuariosData.listaUsuarios.get(position);

                // Iniciar la actividad de detalle del usuario
                Intent intent = new Intent(ListaUsuariosActivity.this, DetalleUsuarioActivity.class);
                intent.putExtra("usuarioNombre", usuarioSeleccionado.getNombres());
                intent.putExtra("usuarioApellidos", usuarioSeleccionado.getApellidos());
                intent.putExtra("usuarioDireccion", usuarioSeleccionado.getDireccion());
                intent.putExtra("usuarioCelular", usuarioSeleccionado.getCelular());
                intent.putExtra("usuarioCorreo", usuarioSeleccionado.getCorreo());
                startActivity(intent);
            }
        });
    }
}
