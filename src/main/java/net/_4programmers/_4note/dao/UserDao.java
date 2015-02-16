package net._4programmers._4note.dao;

import net._4programmers._4note.entity.User;

public interface UserDao {
    User findById(Integer id);

    User findByUsername(String username);

    User create(String username, String password);
}