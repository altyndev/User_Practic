package com.company.servise;

import com.company.model.User;

import java.util.List;

/**
 * 5) service пакеттин ичине UserService деген interface тузунуз жана impl деген пакет тузуп коюнуз.
 * 6) UserServiceтин ичинде 4 метод болот, userди кошуу, id менен табуу, id менен очуруу жана баардык userлерди алуу.
 */
public interface UserService {

    void saveUser(User user);

    void getId(int id);

    void deleteById(int id);

    List<User> getAll();

    boolean extend(int id);
}
