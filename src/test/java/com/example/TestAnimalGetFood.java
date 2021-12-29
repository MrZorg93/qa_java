package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestAnimalGetFood {
    private final String animalType;
    private final List<String> foodType;

    public TestAnimalGetFood(String animalType, List<String> foodType){
        this.animalType = animalType;
        this.foodType = foodType;
    }
    @Parameterized.Parameters
    public static Object[][] getFoodType(){
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };

    }
    @Test
    public void checkAnimalGetFoodReturnCorrectTypeOfFoodWhenAnimalTypeInput() throws Exception{
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalType);
        assertEquals(foodType, actual);
    }
}
