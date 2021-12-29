package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAlexTheLionHasMane {
    @Test
    public void checkAlexTheLionHasManeReturnTrueWhenCalled() throws Exception{
        boolean expected = true;
        AlexTheLion alex = new AlexTheLion();
        boolean actual = alex.doesHaveMane();
        assertEquals(expected, actual);
    }
}
