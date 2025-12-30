package com.jenkins.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class CommonController {

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("test was been called.");
    }
}
