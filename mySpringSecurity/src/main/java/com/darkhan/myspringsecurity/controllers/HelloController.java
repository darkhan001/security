package com.darkhan.myspringsecurity.controllers;

import com.darkhan.myspringsecurity.model.Person;
import com.darkhan.myspringsecurity.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping()
    public String sayHello(){
        return "/hello";
    }


}
