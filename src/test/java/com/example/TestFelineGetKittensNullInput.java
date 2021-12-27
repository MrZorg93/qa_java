package com.example;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class TestFelineGetKittensNullInput {

    @Test
    public void CheckFelineGetKittensReturn1WhenCalledWithoutInput() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }
}
