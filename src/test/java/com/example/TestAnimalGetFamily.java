package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAnimalGetFamily {
    @Test
    public void checkAnimalGetFamilyReturnBasePhraseWhenCalled(){
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }
}