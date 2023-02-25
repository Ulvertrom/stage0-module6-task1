package com.epam.mjc.stage0;

public class Animal {

    //fields
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    //constructor
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    //method
    public String getDescription() {
        return "This animal is mostly " + color + ". It has " + numberOfPaws + (numberOfPaws == 1? " paw": " paws") + " and " + (hasFur? "a ": "no ") + "fur.";
    }


}
