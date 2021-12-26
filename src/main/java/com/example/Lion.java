package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    Feline feline;

    public Lion(Feline feline) {
        this.feline = feline;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) { //Кейс на самец
            hasMane = true;
        } else if ("Самка".equals(sex)) { //Кейс на самка
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка"); //Кейс на что-то левое
        }
    }

    public int getKittens() {
        return feline.getKittens(); //Кейс на вызов метода без входящего числа
    }

    public boolean doesHaveMane() { //Кейс на вызов метода с моком Самец + Кейс на вызов с моком Самка
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.eatMeat(); // Кейс с моком Хищник
    }
}
