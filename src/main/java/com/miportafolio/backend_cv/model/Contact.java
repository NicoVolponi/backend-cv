package com.miportafolio.backend_cv.model;

public class Contact {
    private String email;
    private String telefono;
    private String ubicacion;
    private String linkedin;
    private String github; // por ahora lo dejamos vacío

    public Contact(String email, String telefono, String ubicacion, String linkedin, String github) {
        this.email = email;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.linkedin = linkedin;
        this.github = github;
    }

    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }
    public String getUbicacion() { return ubicacion; }
    public String getLinkedin() { return linkedin; }
    public String getGithub() { return github; }
}
