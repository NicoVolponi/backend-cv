package com.miportafolio.backend_cv.model;

public class Project {
    private String nombre;
    private String descripcion;
    private String linkDemo;
    private String linkRepo;

    public Project(String nombre, String descripcion, String linkDemo, String linkRepo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.linkDemo = linkDemo;
        this.linkRepo = linkRepo;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getLinkDemo() { return linkDemo; }
    public String getLinkRepo() { return linkRepo; }
}
