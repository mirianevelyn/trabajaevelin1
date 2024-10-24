package com.example.trabajaevelin;

import java.util.ArrayList;

public class UsuariosData {

    // Lista estática para almacenar los usuarios en memoria
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    // Método para inicializar usuarios fijos
    public static void inicializarUsuariosFijos() {
        if (listaUsuarios.isEmpty()) { // Solo agregar usuarios fijos si la lista está vacía
            listaUsuarios.add(new Usuario("Juan", "Perez", "Calle 123", "123456789", "juanperez@mail.com"));
            listaUsuarios.add(new Usuario("Maria", "Lopez", "Avenida 45", "987654321", "marialopez@mail.com"));
            listaUsuarios.add(new Usuario("Carlos", "Garcia", "Calle 789", "789123456", "carlosgarcia@mail.com"));
            listaUsuarios.add(new Usuario("Ana", "Martinez", "Calle 456", "456789123", "anamartinez@mail.com"));
            listaUsuarios.add(new Usuario("Luis", "Rodriguez", "Avenida 67", "321987654", "luisrodriguez@mail.com"));
            listaUsuarios.add(new Usuario("Laura", "Fernandez", "Calle 101", "654321789", "laurafernandez@mail.com"));
            listaUsuarios.add(new Usuario("Pedro", "Gutierrez", "Avenida 10", "102938475", "pedrogutierrez@mail.com"));
            listaUsuarios.add(new Usuario("Sofia", "Hernandez", "Calle 202", "847362915", "sofiahernandez@mail.com"));
            listaUsuarios.add(new Usuario("Javier", "Diaz", "Avenida 30", "748596321", "javierdiaz@mail.com"));
            listaUsuarios.add(new Usuario("Lucia", "Morales", "Calle 505", "951753852", "luciamorales@mail.com"));
        }
    }
}

