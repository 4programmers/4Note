package net._4programmers._4note.dao.impl;

import net._4programmers._4note.dao.UserDao;
import net._4programmers._4note.entities.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public User getUserById(Integer id) {
        return em.find(User.class, id);
    }

    @Transactional
    public List<User> getAll() {
        return null;
    }

    @Transactional
    public void deleteUser(User user) {
        em.remove(user);
    }
}
