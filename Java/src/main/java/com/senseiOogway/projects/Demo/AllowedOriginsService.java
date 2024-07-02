package com.senseiOogway.projects.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class AllowedOriginsService {
    @Autowired
    private Environment env;

    public String getAllowedOrigins() {
        return env.getProperty("allowed.origins","http://app:3000");
    }
}
