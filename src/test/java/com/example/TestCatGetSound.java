package com.example;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCatGetSound {
    @Test
    public void checkCatGetSoundReturnMyauWhenCalled(){
        Cat cat = new Cat(new Feline());
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }
}
