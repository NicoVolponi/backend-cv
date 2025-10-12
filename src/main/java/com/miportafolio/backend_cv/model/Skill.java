package com.miportafolio.backend_cv.model;

public class Skill {
    private String nombre;
    private String tipo; // "Dura" o "Blanda"

    public Skill(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
}
