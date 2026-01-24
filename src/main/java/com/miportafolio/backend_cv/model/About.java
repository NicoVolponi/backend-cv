package com.miportafolio.backend_cv.model;

import java.util.List;

public class About {
    private String nombre;
    private String titulo;
    private String subtitulo;
    private String descripcion;
    private List<String> highlights;
    private String avatarInitials;

    public About(String nombre,
                 String titulo,
                 String subtitulo,
                 String descripcion,
                 List<String> highlights,
                 String avatarInitials) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.descripcion = descripcion;
        this.highlights = highlights;
        this.avatarInitials = avatarInitials;
    }

    public String getNombre() { return nombre; }
    public String getTitulo() { return titulo; }
    public String getSubtitulo() { return subtitulo; }
    public String getDescripcion() { return descripcion; }
    public List<String> getHighlights() { return highlights; }
    public String getAvatarInitials() { return avatarInitials; }
}
