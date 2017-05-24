package service;

import dao.daoInterface.AbonementDAO;
import domain.Abonement;
import domain.AbonementKind;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.serviceInterface.AbonementService;

import java.util.List;

/**
 * Created by Admin on 16.03.2017.
 */
@Service
public class AbonemenServiceImpl implements AbonementService {

    @Autowired
    private AbonementDAO abonementDAO;

    @Override
    public void changeByModel(Abonement abonement) {
        abonementDAO.changeEtity(abonement);
    }

    @Override
    public Abonement getById(Integer id) {
        return abonementDAO.getById(id);
    }

    @Override
    public List<Abonement> listAbonementsKind() {
        return abonementDAO.findAll();
    }

    @Override
    public void addAboniment(Abonement abonement) {
      abonementDAO.add(abonement);
    }

    @Override
    public void removeAboniment(Abonement abonement) {
 abonementDAO.delete(abonement);
    }

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public List<Abonement> listAbonementsValid() {
        return getSession().createQuery("from  Abonement where valid=true ").list();

    }
}
