package com.example.promgraf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

        @GetMapping("/hello")
        public String hello() {
            return "Hello, World!";
        }

        @GetMapping("/hi")
        public String hi() {
            return "Hi, World!";
        }

        @GetMapping("/bye")
        public String bye() {
            return "Bye, World!";
        }
}
