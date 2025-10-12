package com.miportafolio.backend_cv.model;

public class About {
    private String nombre;
    private String titulo;
    private String descripcion;

    public About(String nombre, String titulo, String descripcion) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
}
