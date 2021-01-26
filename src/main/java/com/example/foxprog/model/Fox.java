package com.example.foxprog.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Fox {
    @Id
    private int id;

    @Column
    protected String name;

    @OneToOne
    protected Drink drink;

    @OneToOne
    protected Food food;

    @OneToMany
    protected List<Trick> trickList;
    //protected List<String> actions;
    //protected List<Treat> treatList;
    protected Mood mood;

    public Fox(String name) {
        this.name = name;
    }


    /*public Mood moodChanger() {
        if (actions.isEmpty()) {
            mood = Mood.NORMAL;
        } else if (!actions.isEmpty() && actions.get(actions.size() - 1).contains("hug")) {
            mood = Mood.LOVED;
        } else if (!actions.isEmpty() && actions.get(actions.size() - 1).contains("pet")) {
            mood = Mood.HAPPY;
        } else mood = Mood.NORMAL;
        return mood;
    }*/

    public Mood getMood() {
        return mood;
    }
}
