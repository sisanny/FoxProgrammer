package com.example.foxprog.model;

public enum Drink {
    WATER,
    COFFEE,
    TEA,
    LEMONADE,
    BEER,
    TEQUILA,
    ORAGNEJUICE;

    @Override
    public String toString() {
        switch (this) {
            case WATER:
                return "water";
            case COFFEE:
                return "coffee";
            case TEA:
                return "tea";
            case LEMONADE:
                return "lemonade";
            case BEER:
                return "beer";
            case TEQUILA:
                return "tequila";
            case ORAGNEJUICE:
                return "orangejuice";
            default:
                throw new IllegalArgumentException();
        }
    }
}
