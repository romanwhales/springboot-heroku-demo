package com.apress.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private UserRepository userrepository;

    @Autowired
    public HomeController(UserRepository userRepository){
        this.userrepository = userRepository;
    }

    @GetMapping("/")
    public String home(Model model){
        List<User> users = userrepository.findAll();
        model.addAttribute("users",users);
        return "home";
    }
}
