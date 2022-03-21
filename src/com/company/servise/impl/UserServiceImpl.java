package com.company.servise.impl;

import com.company.dao.UserDao;
import com.company.dao.UserDaoImpl;
import com.company.exceptions.IdExseption;
import com.company.model.User;
import com.company.servise.UserService;

import java.util.List;

/**
 * * 6) UserServiceтин ичинде 4 метод болот, userди кошуу, id менен табуу, id менен очуруу жана
 * баардык userлерди алуу.
 * * 7) impl пакеттин ичине UserServiceImpl деген класс тузунуз,
 * * бул класс UserService интерфейсин ишке ашырат жана бул класста свойства катары биздин
 * база данныхыбыз болот(UserDao).
 * * 8) UserServiceImpl класста UserService интерфейсинин бардык методдорун ишке ашырыныз.
 */
public class UserServiceImpl implements UserService {

    UserDao dao = new UserDaoImpl();

    public UserServiceImpl() {

    }

    @Override
    public void saveUser(User user) {
        dao.saveUser(user);
    }

    @Override
    public void getId(int id) {

        try {
            if (!extend(id)) {
                throw new IdExseption("сен жок id ни чакырып жатасын ");
            }
              dao.getId(id);
        } catch (IdExseption e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteById(int id) {

        try {
            if (!extend(id)) {
                throw new IdExseption("сен жок id ни очургону атасын");
            }
                dao.deleteById(id);
        } catch (IdExseption e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<User> getAll() {
        return dao.getAll();
    }

    @Override
    public boolean extend(int id) {
       return dao.extend(id);
    }
}
