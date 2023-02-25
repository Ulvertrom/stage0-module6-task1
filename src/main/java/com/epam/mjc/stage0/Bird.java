package com.epam.mjc.stage0;

//child class
public class Bird extends Animal {

    //constructor
    public Bird() {
        super("blue", 2, false);
    }

    //overridden method
    public String getDescription() {
        return "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
    }
}