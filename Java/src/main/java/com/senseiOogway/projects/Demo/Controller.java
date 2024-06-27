package com.senseiOogway.projects.Demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public ResponseEntity hello(){
        return ResponseEntity.ok("Hello@ Don");
    }
}
