package com.example.demo.controlers;

import com.example.demo.utils.Utils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio {
    //http:// localchost:8080/
    @GetMapping("/")
    public String greet() {
        return "Bienvenido al servidor backend";
    }
    //http:// localchost:8080/aleatorio
    @GetMapping("/aleatorio")
    public String randomNumber() {
       long r = Math.round(Math.random()*100);
       return r + "";
    }

    @GetMapping("/palindromo/{name}")
    public String palindrome(@PathVariable String name) {
        boolean palindrome = Utils.isPalindrome(name);
        return palindrome ? "Si es un palindromo" : "No es un palindromo";
    }

}
