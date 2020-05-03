
package dao;

import entities.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Result;


public class UserDaoImpl implements IUserDao{
    private EntityManagerFactory emf;
    private EntityManager em;

    public UserDaoImpl() {
        emf = Persistence.createEntityManagerFactory("cb10ft_scrumexamPU");
        em = emf.createEntityManager();
    }
    
    @Override
    public boolean saveUser(User user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Result getResult(User user) {
        return (Result) em.createQuery("SELECT zoukou FROM scrum.user_answers zoukou", User.class).getResultList();
    }

    
    
}
