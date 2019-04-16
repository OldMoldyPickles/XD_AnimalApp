package com.xd.xd_animalapp;

public class Duck extends Animal {

    public Duck(){

    }


    public String say(){
        String quack = "quack";
        return quack;

    }

    @Override
    public String play() {
        return null;
    }
}