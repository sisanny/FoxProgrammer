package com.example.foxprog.controller;

import com.example.foxprog.model.Fox;
import com.example.foxprog.model.Treat;
import com.example.foxprog.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WellBeingController {
    final FoxService foxService;
    public WellBeingController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping(path = "/wellbeing")
    public String learTricks(Model model, @RequestParam(name = "name") String foxName) {
        Fox fox = foxService.getFox(foxName);
        model.addAttribute("fox", fox);
        model.addAttribute("treatList", Treat.values());
        return "wellbeing";
    }

    @PostMapping(path = "/wellbeing")
    public String learnTricksPost(@ModelAttribute() Fox fox, @RequestParam(name = "treatString") String treat) {
        Fox newFox = foxService.getFox(fox.getName());
        //newFox.addAction(foxService.getDate() + " " + fox.getName() + "'s well being is maintained by a " + treat + ".");
        return "redirect:/?name=" + fox.getName();
    }
}

