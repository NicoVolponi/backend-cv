package com.miportafolio.backend_cv.service;

import com.miportafolio.backend_cv.model.Contact;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    public Contact getContactInfo() {
        return new Contact(
                "nicovolpo9@gmail.com",
                "11 67626116",
                "Buenos Aires, San Fernando",
                "https://www.linkedin.com/in/nicolás-volponi/",
                "" // Por ahora sin GitHub
        );
    }
}
