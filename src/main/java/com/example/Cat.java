package com.example;

import java.util.List;

public class Cat {

    Predator predator;

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public String getSound() { //Кейс на вызов метода
        return "Мяу";
    }

    public List<String> getFood() throws Exception { //Кейс хз какой
        return predator.eatMeat();
    }

}
