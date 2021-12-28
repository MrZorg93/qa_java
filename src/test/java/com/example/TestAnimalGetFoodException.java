package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

public class TestAnimalGetFoodException {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkAnimalGetFoodException() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        Animal animal = new Animal();
        List<String> wrongFood = animal.getFood("None");

        thrown = ExpectedException.none();
    }
}
