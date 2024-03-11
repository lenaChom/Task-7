package web.config.service;

import web.config.model.User;

import java.util.List;

public interface UserService {

    void createUsersTable();

    public void saveUser(User user);

    List<User> showAllUsers();

    public User getUser(long id);

    public void deleteUser(long id);
}
