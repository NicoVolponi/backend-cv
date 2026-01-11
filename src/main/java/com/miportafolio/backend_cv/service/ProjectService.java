package com.miportafolio.backend_cv.service;

import com.miportafolio.backend_cv.model.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    public List<Project> getProjects() {
        return List.of(
                new Project(
                        "Backend CV Dinámico",
                        "Proyecto personal para crear un CV dinámico con backend en Spring Boot y frontend en Vite/React.",
                        "https://nico-cv.onrender.com/"
                ),
                new Project(
                        "Berpic - Casa de Vinos",
                        "Desarrollo de una tienda online para la marca Berpic, enfocada en la venta de vinos, utilizando la plataforma Tienda Nube. Incluye personalización de plantillas, diseño responsive y optimización de la experiencia de compra.",
                        "https://berpicasadevinos.mitiendanube.com/"
                      
                )
        );
    }
}
