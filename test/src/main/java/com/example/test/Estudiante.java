package com.example.test;

public class Estudiante {

    private String identificacion;
    private String nombre;
    private int edad;

    public Estudiante(String identificacion, String nombre, int edad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean esEdadValida() {
        return edad >= 1 && edad <= 120;
    }

    public boolean esNombreValido() {
        return nombre != null && !nombre.trim().isEmpty();
    }
}