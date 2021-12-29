package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAlexTheLionGetPlaceOfLiving {
    @Test
    public void checkAlexTheLionGetPlaceOfLivingReturnNewYorkZooWhenCalled() throws Exception{
        String expected = "Нью-Йоркский зоопарк";
        String actual = (new AlexTheLion()).getPlaceOfLiving();
        assertEquals(expected, actual);
    }
}
