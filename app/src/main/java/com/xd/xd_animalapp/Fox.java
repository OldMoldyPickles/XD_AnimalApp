package com.xd.xd_animalapp;

public class Fox extends Animal implements Fun{

    void Fox() {

    }
    public String say(){
        return "Ring ding ding";
    }

    @Override
    public String play() {
        return "The fox eats mice!";
    }
}