package com.miportafolio.backend_cv.controller;

import com.miportafolio.backend_cv.model.Experience;
import com.miportafolio.backend_cv.service.ExperienceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExperienceController {

    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("/api/experience")
    public List<Experience> getExperiences() {
        return experienceService.getExperiences();
    }
}
