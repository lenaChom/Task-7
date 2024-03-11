package web.config.service;

import web.config.model.User;


import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);
}
