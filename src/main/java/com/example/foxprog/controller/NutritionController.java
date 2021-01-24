package com.example.foxprog.controller;

import com.example.foxprog.model.Drink;
import com.example.foxprog.model.Food;
import com.example.foxprog.model.Fox;
import com.example.foxprog.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NutritionController {
    final FoxService foxService;
    public NutritionController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping(path = "/nutritionStore")
    public String changeNutritions(Model model, @RequestParam(name = "name") String foxName) {
        model.addAttribute("drinks", Drink.values());
        model.addAttribute("foods", Food.values());
        Fox fox = foxService.getFox(foxName);
        model.addAttribute("fox", fox);
        return "nutrition";
    }

    @PostMapping(path = "/nutritionStore")
    public String changeNutritionPost(@ModelAttribute() Fox fox, @RequestParam(name = "foodString") String food, @RequestParam(name = "drinkString") String drink) {
        Fox newFox = foxService.getFox(fox.getName());
        newFox.setDrink(Drink.valueOf(drink.toUpperCase()));
        newFox.setFood(Food.valueOf(food.toUpperCase()));
        newFox.addAction(foxService.getDate() + " " + fox.getName() + " is drinking from now " + drink);
        newFox.addAction(foxService.getDate() + " " + fox.getName() + " is eating from now " + food);
        return "redirect:/?name=" + fox.getName();
    }
}
