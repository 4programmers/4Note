package net._4programmers._4note.dao.impl;

import net._4programmers._4note.dao.UserDao;
import net._4programmers._4note.entity.Role;
import net._4programmers._4note.entity.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public User findById(Integer id) {
        return em.find(User.class, id);
    }

    @Transactional
    public User findByUsername(String username)
    {
        return (User)em.createQuery("SELECT u FROM User u WHERE u.username = :username")
            .setParameter("username", username).
            getSingleResult();
    }

    @Transactional
    public User create(String username, String password) {
        User user = new User();

        user.setUsername(username);
        user.setPassword(password);
        user.setEmail("fakeemail@gmail.com");
        user.setEnabled(true);

        Role role = new Role(user, "ROLE_USER");
        Set<Role> roles = new HashSet<Role>();
        roles.add(role);

        user.setRoles(roles);

        em.persist(user);
        em.flush();

        return user;
    }
}
