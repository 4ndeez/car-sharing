package com.example.CarSharing.controller;

import com.example.CarSharing.model.User;
import com.example.CarSharing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String test(Map<String, Object> model){
        return "index";
    }

    @GetMapping("/lounge")
    public String lounge(User usr, Map <String, Object> model) {
        Iterable<User> users = userRepository.findAll();
        model.put("users", users);
        model.put("usr", usr.getId());
        return "lounge";
    }

    @PostMapping("/lounge")
    public String add(@RequestParam String username, @RequestParam String password, Map<String, Object> model){
        User user = new User(username, password);
        userRepository.save(user);
        Iterable<User> users = userRepository.findAll();
        model.put("users", users);
        return "lounge";
    }

    @GetMapping("/user/{user}")
    public String profile(@PathVariable User user, Model model) {
        model.addAttribute("usr", user.getUsername());
        model.addAttribute("usr", user.getId());
        return "user";
    }
}