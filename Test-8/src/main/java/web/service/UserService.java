package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    public void saveUser(User user);

    void updateUser(User user);

    List<User> showAllUsers();

    public User getUser(long id);

    public void deleteUser(long id);
}
