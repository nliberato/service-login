package com.servicelogin.lean.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @GetMapping("/prueba")
    public String prueba() {
        return "hola desde servicio lean";
    }
    
}
