package dao;

import dao.daoInterface.AbonementKindDAO;
import dao.daoInterface.AbstractDao;
import domain.AbonementKind;
import org.hibernate.annotations.Fetch;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 21.02.2017.
 */

@Repository("AbKindDaoImpl")
public class AbonementKindDaoImpl extends AbstractDao implements AbonementKindDAO {


    @Override
    public void changeByModel(AbonementKind abonementKind) {
        getSession().update(abonementKind);
    }

    @Transactional
    @Override

    public AbonementKind getById(Integer id) {
        AbonementKind abonementKind =(AbonementKind) getSession().get(AbonementKind.class,id);
        return abonementKind;
    }

    @Transactional
    @Override
    public List<AbonementKind> listAbonementsKind() {
        List<AbonementKind>listAbKind=getSession().createQuery("from AbonementKind ").list();


        return listAbKind;
    }

    @Transactional
    @Override
    public void addAbonimentKind(AbonementKind abonementKind) {

             getSession().save(abonementKind);
    }

    @Transactional
    @Override
    public void removeAbonimentKind(AbonementKind abonementKind) {
        getSession().delete(abonementKind);

    }
}
