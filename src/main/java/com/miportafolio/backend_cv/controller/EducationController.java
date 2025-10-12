package com.miportafolio.backend_cv.controller;

import com.miportafolio.backend_cv.model.Education;
import com.miportafolio.backend_cv.service.EducationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EducationController {

    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/api/education")
    public List<Education> getEducation() {
        return educationService.getEducation();
    }
}
