package com.example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class TestGetKittens {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private final int kittensCount;
    private final int expected;

    public TestGetKittens(int kittensCount, int expected){
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][] {
                { 1, 1},
                { 0, 0},
                { 2, 2},
                { 7, 7},
                {-1, -1},
        };
    }

    @Test
    public void checkFelineGetKittensReturnKittensCountWhenCalled() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals(expected, actual);
    }

    @Test
    public void checkFelineGetKittensReturn1WhenCalledWithoutInput() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

    @Mock
    Feline feline;

    @Test
    public void checkLionGetKittensReturn1WhenCalled(){
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void checkAlexTheLionGetKittensReturnZero() throws Exception{
        int expected = 0;
        int actual = (new AlexTheLion()).getKittens();
        assertEquals(expected, actual);
    }
}
