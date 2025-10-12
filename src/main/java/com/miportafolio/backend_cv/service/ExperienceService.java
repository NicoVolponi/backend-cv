package com.miportafolio.backend_cv.service;

import com.miportafolio.backend_cv.model.Experience;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {

    public List<Experience> getExperiences() {
        return List.of(
                new Experience(
                        "Project Leader",
                        "Bits0",
                        "Mayo 2024 - Actualidad",
                        "Gestión y organización de tareas junto al cliente, ejecución de implementaciones técnicas en Salesforce Commerce Cloud, control del proceso de QA y coordinación de salidas a producción (UAT)."
                )
                // más adelante podemos agregar más trabajos acá
        );
    }
}
