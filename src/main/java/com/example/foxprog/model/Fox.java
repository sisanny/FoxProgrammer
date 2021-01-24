package com.example.foxprog.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Fox {
    @Id
    private int id;
    protected String name;
    protected Drink drink;
    protected Food food;
    protected List<Trick> trickList;
    protected List<String> actions;
    protected List<Treat> treatList;
    protected Mood mood;

    public Fox() {
    }

    public Fox(String name, Drink drink, Food food, List<Trick> tricks, List<String> actions, List<Treat> treatList) {
        this.name = name;
        this.drink = drink;
        this.food = food;
        this.trickList = tricks;
        this.actions = actions;
        this.treatList = treatList;
    }

    public Fox(String name) {
        this.name = name;
        this.drink = Drink.BEER;
        this.food = Food.MUFFIN;
        trickList = new ArrayList<Trick>();
        actions = new ArrayList<String>();
        treatList = new ArrayList<Treat>();
        this.mood = Mood.NORMAL;
    }

    public Fox(String name, String drink, String food) {
        this.name = name;
        this.drink = Drink.BEER;
        this.food = Food.MUFFIN;
        trickList = new ArrayList<Trick>();
        actions = new ArrayList<String>();
        treatList = new ArrayList<Treat>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Trick> getTrickList() {
        return trickList;
    }

    public Drink getDrink() {
        return drink;
    }

    public Food getFood() {
        return food;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public List<String> getActions() {
        return actions;
    }

    public void addAction(String action) {
        actions.add(action);
    }

    public Mood moodChanger() {
        if (actions.isEmpty()) {
            mood = Mood.NORMAL;
        } else if (!actions.isEmpty() && actions.get(actions.size() - 1).contains("hug")) {
            mood = Mood.LOVED;
        } else if (!actions.isEmpty() && actions.get(actions.size() - 1).contains("pet")) {
            mood = Mood.HAPPY;
        } else mood = Mood.NORMAL;
        return mood;
    }

    public Mood getMood() {
        return mood;
    }
}
