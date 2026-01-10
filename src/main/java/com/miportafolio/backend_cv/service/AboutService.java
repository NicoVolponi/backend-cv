package com.miportafolio.backend_cv.service;

import com.miportafolio.backend_cv.model.About;
import org.springframework.stereotype.Service;

@Service
public class AboutService {

    public About getAboutInfo() {
        return new About(
                "Nicolás Volponi",
                "Técnico en Programación",
                "Técnico en Programación con más de dos años de experiencia en el ámbito tecnológico, participando en la implementación, mantenimiento y coordinación de proyectos digitales. Actualmente cursando una Diplomatura en Inteligencia Artificial. Me caracterizo por mi compromiso, proactividad y buena comunicación con clientes."
        );
    }
}
