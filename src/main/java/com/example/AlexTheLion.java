package com.example;

import java.util.List;

public class AlexTheLion extends Lion{

    public AlexTheLion(Feline feline) {
       super(feline);
    }

    public AlexTheLion () throws Exception{
        super("Самец");
    }

    public List<String> getFriends(){
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens(){
        return 0;
    }
}
