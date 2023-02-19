package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    List<User> givenDataList = UserRepository.getUserList();

    public double getAvgPosts(List<User> users) {
        double sum = 0;
        for (User user : users) {
            sum += user.getNumberOfPost();
        }
        return sum / users.size();
    }

    @Test
    public void testAvgPostsAboveEqualAge40() {
        // given
        List<User> usersAbove40 = new ArrayList<>();
        // when
        double result = ForumStats.avgPostsAboveEqualAge40(givenDataList);
        // then
        for (User userExpected : givenDataList) {
            if (userExpected.getAge() >= 40) {
                usersAbove40.add(userExpected);
            }
        }
        double expected = getAvgPosts(usersAbove40);
        assertEquals(expected, result);
    }

    @Test
    public void avgPostsBelowAge40() {
        // given
        List<User> usersBelow40 = new ArrayList<>();
        // when
        double result = ForumStats.avgPostsBelowAge40(givenDataList);
        // then
        for (User userExpected : givenDataList) {
            if (userExpected.getAge() < 40) {
                usersBelow40.add(userExpected);
            }
        }
        double expected = getAvgPosts(usersBelow40);
        assertEquals(expected, result);
    }
}