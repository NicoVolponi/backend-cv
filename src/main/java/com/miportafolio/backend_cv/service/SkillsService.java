package com.miportafolio.backend_cv.service;

import com.miportafolio.backend_cv.model.Skill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService {

    public List<Skill> getSkills() {
        return List.of(
                // 🔹 Habilidades Duras
                new Skill("Java", "Dura"),
                new Skill("C, C++, C#", "Dura"),
                new Skill("SQL / MySQL", "Dura"),
                new Skill("React", "Dura"),
                new Skill("Spring Boot", "Dura"),
                new Skill("Salesforce Commerce Cloud", "Dura"),
                new Skill("APIs REST", "Dura"),
                new Skill("Maven", "Dura"),
                new Skill("HTML y CSS", "Dura"),
                new Skill("Automatización QA", "Dura"),
                new Skill("Optimización SEO", "Dura"),
                new Skill("IntelliJ IDEA", "Dura"),
                new Skill("Tienda Nube", "Dura"),
                new Skill("Fundamentos de Inteligencia Artificial", "Dura"),
                new Skill("Machine Learning", "Dura"),
                new Skill("Redes Neuronales", "Dura"),
                new Skill("IA Generativa y Agentes", "Dura"),
                new Skill("Microsoft Office", "Dura"),
                new Skill("Inglés Intermedio", "Dura"),

                // 🔹 Habilidades Blandas
                new Skill("Gestión de proyectos", "Blanda"),
                new Skill("Trato con clientes", "Blanda"),
                new Skill("Comunicación efectiva", "Blanda"),
                new Skill("Resolución de problemas", "Blanda"),
                new Skill("Trabajo en equipo", "Blanda"),
                new Skill("Organización", "Blanda"),
                new Skill("Gestión del tiempo", "Blanda"),
                new Skill("Aprendizaje continuo", "Blanda"),
                new Skill("Pensamiento analítico", "Blanda"),
                new Skill("Adaptabilidad", "Blanda"),
                new Skill("Responsabilidad profesional", "Blanda")
        );
    }
}
