package com.example.foxprog.model;

public enum Food {
    TOMATO,
    APPLE,
    MUFFIN,
    PASTA,
    PIZZA,
    CHOCOLATE;

    @Override
    public String toString() {
        switch (this) {
            case APPLE:
                return "apple";
            case PASTA:
                return "pasta";
            case PIZZA:
                return "pizza";
            case MUFFIN:
                return "muffin";
            case CHOCOLATE:
                return "chocolate";
            case TOMATO:
                return "tomato";
            default:
                throw new IllegalArgumentException();
        }
    }
}
