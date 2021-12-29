package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAlexTheLionGetKittens {
    @Test
    public void checkAlexTheLionGetKittensReturnZero() throws Exception{
        int expected = 0;
        int actual = (new AlexTheLion()).getKittens();
        assertEquals(expected, actual);
    }
}
