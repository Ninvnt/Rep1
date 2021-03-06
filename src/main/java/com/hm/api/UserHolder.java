package com.hm.api;

import java.util.HashSet;

/**
 * Created by User83 on 14.01.2017.
 */
public class UserHolder {
    public static HashSet<User> users = new HashSet<>();

    static {
        users.add(new User("JohnDoe", "12345"));
        users.add(new User("JohnDoe1", "1231"));
        users.add(new User("JohnDoe2", "1232"));
        users.add(new User("JohnDoe3", "1233"));
        users.add(new User("JohnDoe4", "1234"));
    }

    public static User search(String login, String pass) {
        return users.stream().filter(user -> user.getLogin().equals(login) && user.getPass().equals(pass)).findFirst().orElse(null);
    }
}