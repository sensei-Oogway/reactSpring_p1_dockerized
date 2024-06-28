package com.senseiOogway.projects.Demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class Controller {
    @GetMapping("/hello")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("DON!");
    }
}
