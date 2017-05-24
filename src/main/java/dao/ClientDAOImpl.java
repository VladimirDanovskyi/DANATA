package dao;

import dao.daoInterface.AbstractDao;
import dao.daoInterface.ClientDAO;
import domain.Client;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 16.03.2017.
 */
@Transactional
@Repository
public class ClientDAOImpl extends AbstractDao implements ClientDAO {
    @Override
    public List<Client> findAll() {
        return getSession().createQuery("from Client ").list();
    }

    @Override
    public Client getById(Long id) {
        return (Client)getSession().get(Client.class, id);
    }

    @Override
    public void add(Client client) {
getSession().save(client);
    }

    @Override
    public void delete(Client client) {
getSession().delete(client);
    }

    @Override
    public void changeEtity(Client client) {
getSession().update(client);
    }
}
