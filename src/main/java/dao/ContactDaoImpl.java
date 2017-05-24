package dao;

import dao.daoInterface.AbstractDao;
import dao.daoInterface.ContactDAO;
import domain.Abonement;
import domain.Contact;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 16.03.2017.
 */
@Transactional
@Repository
public class ContactDaoImpl extends AbstractDao implements ContactDAO {
    @Override
    public List<Contact> findAll() {
         return getSession().createQuery("from Contact ").list();
    }

    @Override
    public Contact getById(Integer id) {
        return (Contact)getSession().get(Contact.class, id);
    }

    @Override
    public void add(Contact contact) {
getSession().save(contact);
    }

    @Override
    public void delete(Contact contact) {
getSession().delete(contact);
    }

    @Override
    public void changeEtity(Contact contact) {
        getSession().update(contact);

    }
}
