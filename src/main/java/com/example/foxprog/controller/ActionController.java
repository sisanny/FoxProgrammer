package com.example.foxprog.controller;

import com.example.foxprog.model.Fox;
import com.example.foxprog.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActionController {
    final FoxService foxService;

    public ActionController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping(path = "/actionHistory")
    public String displayActionHistory(@RequestParam(name = "name") String foxName, Model model) {
        Fox fox = foxService.getFox(foxName);
        model.addAttribute("fox", fox);
        return "actions";
    }
}
