package com.test;

import java.util.Date;
import org.springframework.stereotype.Component;


@Component("greetingService")
public class GreetingService {
    
    public String sayHello(){
        return "Hello from Spring Boot, the time is " + new Date();
    }

}
