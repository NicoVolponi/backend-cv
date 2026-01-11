package com.miportafolio.backend_cv.service;

import com.miportafolio.backend_cv.model.Education;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {

    public List<Education> getEducation() {
        return List.of(
                new Education(
                        "Diseño e implementación de agentes de IA low code/no code",
                        "Universidad de Buenos Aires – Laboratorio de Innovación e Inteligencia Artificial",
                        "2025",
                        "2026"
                ),
                new Education(
                        "Diplomatura en Inteligencia Artificial",
                        "Universidad Tecnológica Nacional",
                        "2025",
                        "2026",
                        "https://backend-cv-7nm4.onrender.com/images/diploma-diploIA.pdf"
                ),
                new Education(
                        "Tecnicatura en Programación",
                        "Universidad Tecnológica Nacional",
                        "2023",
                        "2025",
                        "https://backend-cv-7nm4.onrender.com/images/diploma-titulo-tramite-tecnico.pdf"
                ),
                new Education(
                        "Secundario - Orientación a Sociales",
                        "Colegio San Luis",
                        "2017",
                        "2022",
                        "https://backend-cv-7nm4.onrender.com/images/diploma-secundario.pdf"
                )
        );
    }
}
