package com.miportafolio.backend_cv.service;

import com.miportafolio.backend_cv.model.About;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutService {

    public About getAboutInfo() {
        return new About(
                "Nicolás Volponi",
                "Técnico en Programación",
                "Full Stack Developer & Account Manager",
                """
                Actualmente trabajo en proyectos de Salesforce Commerce Cloud para Kiehl’s Argentina,
                Lancôme Argentina y Kérastase Chile, participando en la implementación técnica
                y en la coordinación de los desarrollos con los equipos de cada marca.

                Me enfoco en crear soluciones claras, escalables y alineadas al negocio,
                combinando código, criterio funcional y experiencia de usuario.
                """,
                List.of(
                        "Salesforce Commerce Cloud",
                        "Desarrollo Full Stack enfocado en producto y experiencia",
                        "Gestión técnica de proyectos digitales"
                ),
                "NV"
        );
    }
}
