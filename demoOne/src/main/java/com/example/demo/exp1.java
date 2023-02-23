package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exp1 {
   @GetMapping("/")
   public String display() {
	   return "Welcome to Spring boot";
   }
}
