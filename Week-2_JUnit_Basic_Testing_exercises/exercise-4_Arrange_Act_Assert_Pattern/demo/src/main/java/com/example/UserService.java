package com.example;

import java.util.HashSet;
import java.util.Set;

public class UserService {
    private Set<String> users = new HashSet<>();

    public void addUser(String name) {
        users.add(name);
    }

    public boolean userExists(String name) {
        return users.contains(name);
    }

    public int getUserCount() {
        return users.size();
    }

    public void clearUsers() {
        users.clear();
    }
}
