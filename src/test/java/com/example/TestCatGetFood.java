package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCatGetFood {

    @Spy
    Feline feline;

    @Test
    public void checkCatGetFoodReturnPredatorMealsWhenCalled() throws Exception{
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Звери", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Звери", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }
}
