package com.example.foxprog.controller;

import com.example.foxprog.model.Drink;
import com.example.foxprog.model.Food;
import com.example.foxprog.model.Fox;
import com.example.foxprog.service.DrinkService;
import com.example.foxprog.service.FoodService;
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
    final FoodService foodService;
    final DrinkService drinkService;

    public NutritionController(FoxService foxService, FoodService foodService, DrinkService drinkService) {
        this.foxService = foxService;
        this.foodService = foodService;
        this.drinkService = drinkService;
    }

    @GetMapping(path = "/nutritionStore")
    public String changeNutritions(Model model, @RequestParam(name = "name") String foxName) {
        model.addAttribute("drinks", drinkService.getAllDrink());
        model.addAttribute("foods", foodService.getAllFood());
        Fox fox = foxService.getFox(foxName);
        model.addAttribute("fox", fox);
        return "nutrition";
    }

    @PostMapping(path = "/nutritionStore")
    public String changeNutritionPost(@ModelAttribute() Fox fox, @RequestParam(name = "foodString") String food, @RequestParam(name = "drinkString") String drink) {
        Fox newFox = foxService.getFox(fox.getName());
        Drink drink1 = new Drink();
        drink1.setName(drink);
        drinkService.addDrink(drink1);
        newFox.setDrink(drink1);
        Food food1 = new Food();
        food1.setName(food);
        foodService.addFood(food1);
        newFox.setFood(food1);
        //newFox.addAction(foxService.getDate() + " " + fox.getName() + " is drinking from now " + drink);
        //newFox.addAction(foxService.getDate() + " " + fox.getName() + " is eating from now " + food);
        return "redirect:/?name=" + fox.getName();
    }
}
