package com.company.dao;

import com.company.model.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    void saveUser(User user);

    User getId(int id);

    void deleteById(int id);

    List<User> getAll();

    boolean extend(int id);
}
