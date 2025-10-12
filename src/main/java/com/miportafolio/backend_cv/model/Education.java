package com.miportafolio.backend_cv.model;

public class Education {
    private String titulo;
    private String institucion;
    private String anioInicio;
    private String anioFin;
    private String certificado;

    public Education(String titulo, String institucion, String anioInicio, String anioFin, String certificado) {
        this.titulo = titulo;
        this.institucion = institucion;
        this.anioInicio = anioInicio;
        this.anioFin = anioFin;
        this.certificado = certificado;
    }

    public String getTitulo() { return titulo; }
    public String getInstitucion() { return institucion; }
    public String getAnioInicio() { return anioInicio; }
    public String getAnioFin() { return anioFin; }
    public String getCertificado() { return certificado; }
}
