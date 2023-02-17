package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        System.out.println(UserManager.filterOlderUsernames(55) + "\n");
        UserManager.filterMostActiveAboveAverageAge();
        System.out.println(UserManager.filterMostActiveAboveAverageAgeV2());

    }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UserManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    // nie chciałem zmieniać wejściowej postaci zadania, więc dostałem się do metody przez getter
    // druga opcja, którą rozważałem to zmiana private na public, ale wtedy zmieniałbym dane wejściowe

    public List<String> getFilterChemistGroupUsernames() {
        return filterChemistGroupUsernames();
    }

    public static List<String> filterOlderUsernames(int age) {
        List<String> usernames = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(UserManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static double getAverageAge() {
        List<User> users = UserRepository.getUserList();
        double sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }
        return sum / users.size();
    }

    public static boolean getUsersAboveAverage(User user) {
        return user.getAge() > UserManager.getAverageAge();
    }


    public static void filterMostActiveAboveAverageAge() {
        UserRepository.getUserList()
                .stream()
                .filter(UserManager::getUsersAboveAverage)
                .filter(user -> user.getNumberOfPost() >= 3)
                .map(UserManager::getUserName)
                .forEach(username -> System.out.println(username));
    }

    public static List<String> filterMostActiveAboveAverageAgeV2() {
        List<String> usernames = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() > UserManager.getAverageAge())    // second way to get users above avg without using next method
                .filter(user -> user.getNumberOfPost() >= 3)
                .map(UserManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

}
