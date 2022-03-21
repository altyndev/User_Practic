package com.company.dao;

import com.company.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {

    // дата база
    Map<Integer, User> dao = new HashMap<>();

    @Override
    public void saveUser(User user) {
        dao.put(user.getId(), user);
    }

    @Override
    public User getId(int id) {
       return dao.get(id);
    }

    @Override
    public void deleteById(int id) {
        dao.remove(id);
    }

    @Override
    public List<User> getAll() {
        return dao.values().stream().toList();
    }

    @Override
    public boolean extend(int id) {
        return dao.values().stream().anyMatch(x -> x.getId() == id);
    }
}
