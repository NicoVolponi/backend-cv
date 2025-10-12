package com.miportafolio.backend_cv.service;

import com.miportafolio.backend_cv.model.Education;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {

    public List<Education> getEducation() {
        return List.of(
                new Education(
                        "Diplomatura en Inteligencia Artificial",
                        "Universidad Tecnológica Nacional",
                        "2025",
                        "Actualidad",
                        "" // sin certificado por ahora
                ),
                new Education(
                        "Tecnicatura en Programación",
                        "Universidad Tecnológica Nacional",
                        "2023",
                        "2025",
                        "" // sin certificado todavía
                ),
                new Education(
                        "Secundario - Orientación a Sociales",
                        "Colegio San Luis",
                        "2017",
                        "2022",
                        "" // si más adelante tenés diploma escaneado lo podemos poner acá
                )
        );
    }
}
