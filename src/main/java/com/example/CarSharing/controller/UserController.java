package com.example.CarSharing.controller;

import com.example.CarSharing.model.Role;
import com.example.CarSharing.model.User;
import com.example.CarSharing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String addUser(User user, Map<String, Object> model) {
        User userFromDb = userRepository.findByUsername(user.getUsername());
        if(userFromDb != null) {
            model.put("message", "User exists!");
            return "register";
        }
        user.setRoles(Collections.singleton(Role.USER));
        user.setActive(true);
        userRepository.save(user);
        return "redirect:/login";
    }
}
