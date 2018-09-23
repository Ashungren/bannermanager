package ru.bannermanager.repository;

import ru.bannermanager.model.User;

import java.util.HashMap;

public class UserRepository implements UserRepInterface {
    private HashMap<Integer, User> users;

    public UserRepository() {
        users = new HashMap<>();
    }


    @Override
    public void save(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User removeUser(int id) {
        return users.remove(id);
    }
}