package com.darkhan.myspringsecurity.config;

import com.darkhan.myspringsecurity.model.Person;
import com.darkhan.myspringsecurity.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private final RegistrationService registrationService;

    @Autowired
    public AuthController(RegistrationService registrationService) {

        this.registrationService = registrationService;
    }


    @GetMapping("/login")
    public String login(){
        return "auth/login";
    }

    @GetMapping("/registration")
    public String registrationPage(@ModelAttribute("person") Person person){

        return "auth/registration";
    }
    @PostMapping("/registration")
    public String register(@ModelAttribute("person") Person person){

        registrationService.save(person);
        return "redirect:/auth/login";
    }
}
