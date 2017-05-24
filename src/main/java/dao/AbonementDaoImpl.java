package dao;

import dao.daoInterface.AbonementDAO;
import dao.daoInterface.AbstractDao;
import domain.Abonement;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 21.02.2017.
 */
@Transactional
@Repository
public class AbonementDaoImpl extends AbstractDao implements AbonementDAO {

    @Override
    public List<Abonement> findAll() {
        return  getSession().createQuery("from  Abonement ").list();
    }

    @Override
    public Abonement getById(Integer id) {
        return (Abonement)getSession().get(Abonement.class,id);
    }

    @Override
    public void add(Abonement abonement) {
        getSession().save(abonement);

    }

    @Override
    public void delete(Abonement abonement) {
    getSession().delete(abonement);
    }

    @Override
    public void changeEtity(Abonement abonement) {
     getSession().update(abonement);
    }
}
