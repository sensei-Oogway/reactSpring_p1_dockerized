package com.senseiOogway.projects.Demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private AllowedOriginsService allowedOriginsService;
    @GetMapping("/hello")
    public ResponseEntity<String> hello(HttpServletRequest request){

        String domain = request.getServerName();
        int port = request.getServerPort();
        String protocol = request.getScheme();

        String domainInfo = protocol + "://" + domain + ":" + port;

//        System.out.println(domainInfo);
        return ResponseEntity.ok().body("DON!");
    }
}
