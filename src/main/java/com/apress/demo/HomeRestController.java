package com.apress.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeRestController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> allUsers(){
        return userRepository.findAll();
    }
}
