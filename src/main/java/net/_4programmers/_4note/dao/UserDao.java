package net._4programmers._4note.dao;

import net._4programmers._4note.entities.User;

import java.util.List;

public interface UserDao {

    User getUserById(Integer id);

    List<User> getAll();

    void deleteUser(User user);
}
