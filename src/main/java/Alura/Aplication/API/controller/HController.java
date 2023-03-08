package Alura.Aplication.API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HController {

    @GetMapping
    public String OlaMundo(){
        return "Hello world";
    }

}
