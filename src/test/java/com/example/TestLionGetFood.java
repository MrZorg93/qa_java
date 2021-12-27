package com.example;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestLionGetFood {
    @Test
    public void checkLionGetFoodReturnPredatorFoodWhenCalled() throws Exception{
        Lion lion = new Lion(new Feline());
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }
}
