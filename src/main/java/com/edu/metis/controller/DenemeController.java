package com.edu.metis.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @author Mertcan Özarslan
 */

@RestController
@RequestMapping("/deneme")
@RequiredArgsConstructor
public class DenemeController {

    @GetMapping
    public ResponseEntity<String> init(){
        return ResponseEntity.ok("hello metis");
    }

    @PostConstruct
    public void sayHello(){
        System.out.println("hello metisd");
    }
}
