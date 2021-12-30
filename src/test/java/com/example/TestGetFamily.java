package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestGetFamily {

    @Test
    public void checkFelineGetFamilyReturnFelineWhenCalled(){
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void checkAnimalGetFamilyReturnBasePhraseWhenCalled(){
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }


}
