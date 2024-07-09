package com.sathya.name;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    // Hardcoded username and password 
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    @PostMapping("/login")
    public String login(@RequestBody loginDetails details) 
    {
    	
    	String username=details.getUsername();
    	String password=details.getPassword();
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            return "success";
        } else {
            return "failure";
        }
    }
}