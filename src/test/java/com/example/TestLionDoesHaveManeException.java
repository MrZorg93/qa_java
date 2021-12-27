package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class TestLionDoesHaveManeException {


    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkLionDoesHaveManeReturnRightAnswer() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion("sex");
        thrown = ExpectedException.none();
    }
}
