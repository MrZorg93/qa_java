package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestFelineEatMeat {

    @Test
    public void checkFelineEatMeatReturnPredatorMealsWhenCalled() throws Exception {
        Feline felineSpy = Mockito.spy(Feline.class);
        List<String> expected = List.of("Звери", "Птицы", "Рыба");
        Mockito.when(felineSpy.getFood("Хищник")).thenReturn(List.of("Звери", "Птицы", "Рыба"));
        List<String> actual = felineSpy.eatMeat();
        assertEquals(expected, actual);
    }
}
