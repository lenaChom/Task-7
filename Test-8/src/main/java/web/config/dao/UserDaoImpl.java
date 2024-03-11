package web.config.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.config.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void createUsersTable() {
        entityManager.createNativeQuery("""
                CREATE TABLE IF NOT EXISTS users (
                Id SERIAL PRIMARY KEY,
                Name VARCHAR(200),
                Surname VARCHAR(200),
                Department VARCHAR(200),
                Salary INT);""").executeUpdate();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        entityManager.merge(user);
    }

    @Override
    @Transactional
    public List<User> showAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    @Transactional
    public User getUser(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(long id) {
        entityManager.createQuery("delete from User where id=:id")
                .setParameter("id", id).executeUpdate();
    }


}
