package com.example.CarSharing.controller;

import com.example.CarSharing.model.Advertisement;
import com.example.CarSharing.model.User;
import com.example.CarSharing.repository.AdsRepository;
import com.example.CarSharing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.Map;

@Controller
public class AdController {
    @Autowired
    private AdsRepository adsRepository;

    @GetMapping("/add")
    public String index(Model model){
        return "advertisementCreation";
    }

    @PostMapping("/add")
    public String add(
            @AuthenticationPrincipal User user,
            @RequestParam String mark,
            @RequestParam String carmodel,
            @RequestParam Integer year,
            @RequestParam String stateNumber,
            @RequestParam String place,
            @RequestParam String type,
            @RequestParam String fuel,
            @RequestParam Integer price,
            @RequestParam String text,
            @RequestParam String calendar,
            Map <String, Object> model
            ) throws IOException {
        Advertisement ad = new Advertisement(mark, carmodel, year, stateNumber, place, type, fuel, price, text,
                                            calendar, user);
        adsRepository.save(ad);

        //todo if success
        return "advertisementCreation";
    }
}
