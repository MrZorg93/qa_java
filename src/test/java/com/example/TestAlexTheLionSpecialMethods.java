package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestAlexTheLionSpecialMethods {
    @Test
    public void checkAlexTheLionGetFriendsReturnListOfFriendsWhenCalled() throws Exception{
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        List<String> actual = (new AlexTheLion()).getFriends();
        assertEquals(expected, actual);
    }

    @Test
    public void checkAlexTheLionGetPlaceOfLivingReturnNewYorkZooWhenCalled() throws Exception{
        String expected = "Нью-Йоркский зоопарк";
        String actual = (new AlexTheLion()).getPlaceOfLiving();
        assertEquals(expected, actual);
    }
}
