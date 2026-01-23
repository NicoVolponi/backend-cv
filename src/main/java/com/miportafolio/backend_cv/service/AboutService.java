package com.miportafolio.backend_cv.service;

import com.miportafolio.backend_cv.model.About;
import org.springframework.stereotype.Service;

@Service
public class AboutService {

    public About getAboutInfo() {
        return new About(
                "Nicolás Volponi",
                "Técnico en Programación",
                "Soy un Técnico en Programación con un perfil híbrido que combina habilidades técnicas y de gestión.
Actualmente trabajo en Bits0, donde participo en proyectos sobre Salesforce Commerce Cloud, gestionando tanto la implementación técnica como la comunicación con los clientes.
Este año inicié la Licenciatura en Tecnología de la Información, fortaleciendo mi formación académica y mi visión integral del desarrollo tecnológico.
Además, continúo profundizando en el campo de la Inteligencia Artificial, abordando temas como machine learning, redes neuronales y agentes inteligentes, con el objetivo de integrar soluciones más innovadoras en cada proyecto.
También realizo proyectos freelance, como la mejora de plataformas e-commerce en Tienda Nube, y disfruto asumir desafíos que mezclen tecnología, estrategia y creatividad."
        );
    }
}
