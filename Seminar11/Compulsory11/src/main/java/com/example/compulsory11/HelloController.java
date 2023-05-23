package com.example.compulsory11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Service
    public class HelloService {
        public String sayHello(String name) {
            return "Greetings from " + name;
        }

    }
@RequestMapping("/hello")
    public String sayHello() {
        return "\"Greetings from Spring Boot!";
    }
}
