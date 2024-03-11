package web.config.dao;

import web.config.model.User;

import java.util.List;

public interface UserDao {


    void createUsersTable();


    void saveUser(User user);


    List<User> showAllUsers();

    User getUser(long id);


    void deleteUser(long id);

    }


