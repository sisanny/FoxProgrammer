package com.example.foxprog.controller;

import com.example.foxprog.model.Fox;
import com.example.foxprog.model.Trick;
import com.example.foxprog.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TrickController {
    final FoxService foxService;
    public TrickController(FoxService foxService) {
        this.foxService = foxService;
    }

   /* @GetMapping(path = "/trick")
    public String learTricks(Model model, @RequestParam(name = "name") String foxName) {
        model.addAttribute("fox", foxService.getFox(foxName));
        List<Trick> filter = foxService.getFox(foxName).getTrickList();
        ArrayList<Trick> trickList = new ArrayList<>(Arrays.asList(Trick.values()));
        for (int i = 0; i < filter.size(); i++) {
            for (int j = 0; j < trickList.size(); j++) {
                if (trickList.get(j) == filter.get(i)) {
                    trickList.remove(j);
                }
            }
        }
        model.addAttribute("trickList", trickList);
        return "trick";
    }

    @PostMapping(path = "/trick")
    public String learnTricksPost(@ModelAttribute() Fox fox, @RequestParam(name = "trick") Trick trick) {
        Fox newFox = foxService.getFox(fox.getName());
        newFox.getTrickList().add(trick);
        newFox.addAction(foxService.getDate() + " " + fox.getName() + " learned a this trick: " + trick);
        return "redirect:/?name=" + fox.getName();
    }*/
}
