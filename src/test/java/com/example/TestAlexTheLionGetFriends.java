package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestAlexTheLionGetFriends {
    @Test
    public void checkAlexTheLionGetFriendsReturnListOfFriendsWhenCalled() throws Exception{
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        List<String> actual = (new AlexTheLion()).getFriends();
        assertEquals(expected, actual);
    }
}
