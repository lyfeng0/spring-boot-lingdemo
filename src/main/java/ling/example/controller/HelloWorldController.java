package ling.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hellow")
    public String index() {
        return "Hello World from HelloWorldController";
    }
}

