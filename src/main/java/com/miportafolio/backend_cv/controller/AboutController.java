package com.miportafolio.backend_cv.controller;

import com.miportafolio.backend_cv.model.About;
import com.miportafolio.backend_cv.service.AboutService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    private final AboutService aboutService;

    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    @GetMapping("/api/about")
    public About getAbout() {
        return aboutService.getAboutInfo();
    }
}
