package com.example.foxprog.controller;

import com.example.foxprog.model.Fox;
import com.example.foxprog.model.Treat;
import com.example.foxprog.service.FoxService;
import com.example.foxprog.service.TreatService;
import com.example.foxprog.service.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WellBeingController {
    final FoxService foxService;
    final TreatService treatService;

    public WellBeingController(FoxService foxService, TreatService treatService) {
        this.foxService = foxService;
        this.treatService = treatService;
    }

    @GetMapping(path = "/wellbeing")
    public String learTricks(Model model, @RequestParam(name = "name") String foxName) {
        Fox fox = foxService.getFox(foxName);
        model.addAttribute("fox", fox);
        model.addAttribute("treatList", treatService.getAllTreat());
        return "wellbeing";
    }

    @PostMapping(path = "/wellbeing")
    public String learnTricksPost(@ModelAttribute() Fox fox, @RequestParam(name = "treatString") String treat) {
        Fox newFox = foxService.getFox(fox.getName());
        //newFox.addAction(foxService.getDate() + " " + fox.getName() + "'s well being is maintained by a " + treat + ".");
        return "redirect:/?name=" + fox.getName();
    }
}

