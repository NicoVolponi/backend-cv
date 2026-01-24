package com.miportafolio.backend_cv.service;

import com.miportafolio.backend_cv.model.About;
import org.springframework.stereotype.Service;

@Service
public class AboutService {

    public About getAboutInfo() {
        return new About(
                "Nicolás Volponi",
                "Técnico en Programación",
                """
                Técnico en Programación con un perfil híbrido que combina desarrollo, gestión y comunicación con clientes.
                Actualmente participo en proyectos de Salesforce Commerce Cloud, trabajando tanto en la implementación técnica
                como en la coordinación con equipos y marcas.
                Me encuentro ampliando mi formación en Inteligencia Artificial y Tecnologías de la Información, con interés
                en crear soluciones innovadoras y escalables.
                """
        );
    }
}
