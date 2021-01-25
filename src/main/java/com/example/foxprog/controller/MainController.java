
package com.example.foxprog.controller;

import com.example.foxprog.model.Fox;
import com.example.foxprog.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;

@Controller
public class MainController {

    final
    FoxService foxService;

    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping(path = "/")
    public String renderIndex(Model model, @RequestParam(name = "name", required = false) String foxName) {
        if (foxName == null || foxName.isEmpty()) {
            return "redirect:/login";
        } else {
            Fox fox = foxService.getFox(foxName);
            //fox.moodChanger();
            if (fox == null) {
                return "redirect:/login?warn=true";
            }
            model.addAttribute("fox", fox);
            //model.addAttribute("foxActionList", fox.getActions().stream().limit(5).collect(Collectors.toList()));
            return "index";
        }
    }
}
