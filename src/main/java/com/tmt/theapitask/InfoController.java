package com.tmt.theapitask;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    private List<Info> information = Arrays.asList(
        new Info("Shatu", true, 28, "I am a beginner backend developer. Navigating this field is very interesting!")
        
    );
    
    @GetMapping("/")
    public Info getInfo() {
        return information.get(0);
    }
}
