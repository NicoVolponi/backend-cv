package com.miportafolio.backend_cv.controller;

import com.miportafolio.backend_cv.model.Contact;
import com.miportafolio.backend_cv.service.ContactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/api/contact")
    public Contact getContact() {
        return contactService.getContactInfo();
    }
}
