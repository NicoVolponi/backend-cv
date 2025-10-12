package com.miportafolio.backend_cv.model;

public class Experience {
    private String puesto;
    private String empresa;
    private String periodo;
    private String descripcion;

    public Experience(String puesto, String empresa, String periodo, String descripcion) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }

    public String getPuesto() { return puesto; }
    public String getEmpresa() { return empresa; }
    public String getPeriodo() { return periodo; }
    public String getDescripcion() { return descripcion; }
}
