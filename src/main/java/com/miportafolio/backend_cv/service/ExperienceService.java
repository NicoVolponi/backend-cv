package com.miportafolio.backend_cv.service;

import com.miportafolio.backend_cv.model.Experience;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {

    public List<Experience> getExperiences() {
        return List.of(
                new Experience(
                        "Account Manager / Desarrollador Salesforce Commerce Cloud",
                        "Bits0",
                        "Mayo 2024 - Actualidad",
                        "Gestión y organización de tareas junto al cliente, ejecución de implementaciones técnicas en Salesforce Commerce Cloud, control del proceso de QA y coordinación de salidas a producción (UAT). Participación en proyectos para marcas como Lancôme, Kiehl’s Argentina y Kérastase Chile."
                ),
                new Experience(
                        "Desarrollador Web Freelance",
                        "Freelance",
                        "2025 - Actualidad",
                        "Desarrollo y mejora de sitios web y aplicaciones, adaptando la solución según las necesidades del proyecto. Implementación mediante distintas plataformas y herramientas, así como desarrollo a medida con código. Enfoque en experiencia de usuario (UX), estructura, rendimiento y funcionalidades del sitio."
                )
        );
    }
}
