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
                Técnico en Programación con un perfil híbrido que combina habilidades técnicas y de gestión.

                Actualmente trabajo en Bits0, participando en proyectos sobre Salesforce Commerce Cloud,
                donde intervengo tanto en la implementación técnica como en la comunicación con clientes,
                incluyendo proyectos para marcas como Lancôme y Kiehl’s Argentina.

                Este año inicié la Licenciatura en Tecnología de la Información, fortaleciendo mi formación
                académica y mi visión integral del desarrollo tecnológico.

                En paralelo, continúo profundizando en Inteligencia Artificial, abordando conceptos como
                machine learning, redes neuronales, IA generativa y agentes inteligentes, con el objetivo
                de integrar soluciones innovadoras en cada proyecto.

                Además, realizo proyectos freelance, como la mejora de plataformas e-commerce en Tienda Nube,
                y disfruto asumir desafíos que combinan tecnología, estrategia y creatividad.
                """
        );
    }
}
