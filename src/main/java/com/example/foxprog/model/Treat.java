package com.example.foxprog.model;

public enum Treat {
    PET,
    TALK,
    PLAY,
    HUG;

    @Override
    public String toString() {
        switch (this) {
            case PET:
                return "pet";
            case TALK:
                return "talk";
            case PLAY:
                return "play";
            case HUG:
                return "hug";
            default:
                throw new IllegalArgumentException();
        }
    }
}
