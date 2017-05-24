package service;

import dao.ContactDaoImpl;
import dao.daoInterface.ContactDAO;
import domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.serviceInterface.ContactService;

import java.util.List;

/**
 * Created by Admin on 16.03.2017.
 */
@Service
public class ContactServiceImpl implements ContactService {

@Autowired
private ContactDAO contactDao;


    @Override
    public List<Contact> findAll() {
       return contactDao.findAll();
    }

    @Override
    public Contact getById(Integer id) {
        return contactDao.getById(id);
    }

    @Override
    public void add(Contact contact) {
             contactDao.add(contact);
    }

    @Override
    public void delete(Contact contact) {
contactDao.delete(contact);
    }

    @Override
    public void changeEtity(Contact contact) {
        contactDao.changeEtity(contact);

    }
}
