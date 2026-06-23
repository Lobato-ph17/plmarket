package com.plmarket.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String dizerHello() {
        return "Servidor do plmarket rodando com sucesso!";
    }
}