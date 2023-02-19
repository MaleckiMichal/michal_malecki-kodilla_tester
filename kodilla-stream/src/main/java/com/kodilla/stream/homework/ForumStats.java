package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {

    }

    public static double avgPostsAboveEqualAge40(List<User> userList) {
        double avgPosts = userList
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToDouble(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgPosts;
    }

    public static double avgPostsBelowAge40(List<User> userList) {
        double avgPosts = userList
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToDouble(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgPosts;
    }
}
