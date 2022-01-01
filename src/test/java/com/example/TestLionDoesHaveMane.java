package com.example;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionDoesHaveMane {
    final String sex;
    final boolean hasMane;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    public TestLionDoesHaveMane(String sex, boolean hasMane){
        this.hasMane = hasMane;
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] doesHaveMane(){
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }

    @Mock
    Feline feline;


    @Test
    public void checkLionDoesHaveManeReturnRightAnswer() throws Exception{
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(hasMane, actual);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkLionDoesHaveManeException() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion("sex", feline);
        thrown = ExpectedException.none();
    }

    @Test
    public void checkAlexTheLionHasManeReturnTrueWhenCalled() throws Exception{
        boolean expected = true;
        AlexTheLion alex = new AlexTheLion();
        boolean actual = alex.doesHaveMane();
        assertEquals(expected, actual);
    }
}
