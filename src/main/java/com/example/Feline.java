package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception { //вызов метода
        return getFood("Хищник");
    }

    @Override
    public String getFamily() { //вызов метода
        return "Кошачьи";
    }

    public int getKittens() { //вызов параметризованный
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
