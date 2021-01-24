package com.example.foxprog.controller;

import com.example.foxprog.model.Fox;
import com.example.foxprog.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    final FoxService foxService;

    public LoginController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping(path = "/login")
    public String getLogin(@RequestParam(name = "warn", required = false, defaultValue = "false") boolean warn, Model model) {
        model.addAttribute("warn", warn);
        return "login";
    }

    @PostMapping(path = "/login")
    public String postLogin(@RequestParam(name = "name") String foxName) {
        if (foxService.getFox(foxName) == null) {
            foxService.addFox(new Fox(foxName));
        }
        return "redirect:/?name=" + foxName;
    }
}
