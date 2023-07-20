package com.JuanDevs.elabecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayhi")
public class SayHelloController {
    @GetMapping("/hi")
    public String sayHello(){
        return ("Never Stop Learning");
    }
}
