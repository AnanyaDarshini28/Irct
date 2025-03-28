package com.cts.irct;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/railway")
public class IrctController {
       @GetMapping
       public String get() {
    	   return "Hello Bro!";
       }
       @GetMapping("/welcome")
       public String getWelcome() {
    	   return "Welcome bro!";
       }
}