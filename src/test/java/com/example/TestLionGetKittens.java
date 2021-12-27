package com.example;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLionGetKittens {
    @Test
    public void checkLionGetKittensReturn1WhenCalled(){
        Lion lion = new Lion(new Feline());
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }
}
