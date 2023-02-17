package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {

    @Test
    public void testIfFilterChemistGroupUsernamesReturnsProperNames() {
        // given
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        UserManager userManager = new UserManager();
        // when
        List<String> result = userManager.getFilterChemistGroupUsernames();
        // then
        List<String> expected = new ArrayList<>();
        for (User user : users) {
            //  if (user.getGroup() == "Chemists") {    // >>>> chciałem sprawdzić działanie dwóch spobów porównania <<<<
            if (user.getGroup().equals("Chemists")) {
                expected.add(user.getUsername());
            }
        }
        assertEquals(expected, result);
    }

    @Test
    public void testIfFilterOlderUsernamesReturnsAllOlderPersons() {
        // given
        List<User> userList = UserRepository.getUserList();
        // when
        List<String> resultFor49 = UserManager.filterOlderUsernames(49);
        List<String> resultFor34 = UserManager.filterOlderUsernames(34);
        List<String> resultFor25 = UserManager.filterOlderUsernames(25);
        // then
        List<String> expectedFor34 = new ArrayList<>();
        for (User above34 : userList) {
            if (above34.getAge() > 34)
                expectedFor34.add(above34.getUsername());
        }
        assertEquals(expectedFor34,resultFor34);

        assertEquals(2,resultFor49.size());
        assertEquals(4,resultFor34.size());
        assertEquals(5,resultFor25.size());
    }

    @Test
    public void testFilterMostActiveAboveAverageAgeV2() {
        // given
        List<User> userList = UserRepository.getUserList();
        List<String> expected = new ArrayList<>();
        // when
        List<String> result = UserManager.filterMostActiveAboveAverageAgeV2();
        // then
        for (User user : userList) {
            if (user.getAge() > UserManager.getAverageAge() && user.getNumberOfPost() > 3) {
                expected.add(user.getUsername());
            }
        }
        assertEquals(expected,result);
    }

}