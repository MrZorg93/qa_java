package com.example;

import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionDoesHaveMane {
    final String sex;
    final boolean hasMane;

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

//    @Rule
//    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkLionDoesHaveManeReturnRightAnswer() throws Exception{
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
//        thrown.expect(Exception.class);
//        thrown.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        assertEquals(hasMane, actual);
//        thrown = ExpectedException.none();
    }
}
