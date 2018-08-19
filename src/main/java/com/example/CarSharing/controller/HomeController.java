package com.example.CarSharing.controller;

import com.example.CarSharing.model.User;
import com.example.CarSharing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String test(Map<String, Object> model){
        return "index";
    }

    @GetMapping("/home")
    public String home(Map <String, Object> model) {
        Iterable<User> users = userRepository.findAll();
        model.put("users", users);
        return "home";
    }

    @PostMapping("/layout")
    public String add(@RequestParam String username, @RequestParam String password, Map<String, Object> model){
        User user = new User(username, password);
        userRepository.save(user);
        Iterable<User> users = userRepository.findAll();
        model.put("users", users);
        return "home";
    }

}