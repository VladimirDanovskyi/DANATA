package dao.daoInterface;

import domain.AbonementKind;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Admin on 21.02.2017.
 */
@Transactional
public class AbstractDao {

    @Autowired
    private  SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void changeByEntity(Object entity){getSession().update(entity);}

    public void persist(Object entity) {
        getSession().persist(entity);
    }

    public void delete(Object entity) {
        getSession().delete(entity);
    }
}

