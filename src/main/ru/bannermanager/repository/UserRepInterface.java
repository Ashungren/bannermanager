package ru.bannermanager.repository;

import ru.bannermanager.model.User;

public interface UserRepInterface {

    void save (User user);

    User removeUser(int id);
}