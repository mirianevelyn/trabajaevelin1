package com.example.trabajaevelin;

public class Usuario {

    private String nombres;
    private String apellidos;
    private String direccion;
    private String celular;
    private String correo;

    public Usuario(String nombres, String apellidos, String direccion, String celular, String correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.celular = celular;
        this.correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return nombres + " " + apellidos;
    }
}

