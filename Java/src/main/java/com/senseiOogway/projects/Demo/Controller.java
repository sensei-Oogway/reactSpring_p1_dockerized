package com.senseiOogway.projects.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class Controller {

    @Autowired
    private AllowedOriginsService allowedOriginsService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok().header("Access-Control-Allow-Origin", allowedOriginsService.getAllowedOrigins()).body("DON!");
    }
}
