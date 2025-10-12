package com.miportafolio.backend_cv.controller;

import com.miportafolio.backend_cv.model.Skill;
import com.miportafolio.backend_cv.service.SkillsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkillsController {

    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping("/api/skills")
    public List<Skill> getSkills() {
        return skillsService.getSkills();
    }
}
