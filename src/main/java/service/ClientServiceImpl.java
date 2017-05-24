package service;

import dao.daoInterface.ClientDAO;
import domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.serviceInterface.ClientService;

import java.util.List;

/**
 * Created by Admin on 16.03.2017.
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDAO clientDAO;

    @Override
    public List<Client> findAll() {
        return clientDAO.findAll();
    }

    @Override
    public Client getById(Long id) {
        return clientDAO.getById(id);
    }

    @Override
    public void add(Client client) {
clientDAO.add(client);
    }

    @Override
    public void delete(Client client) {
clientDAO.delete(client);
    }

    @Override
    public void changeEtity(Client client) {
clientDAO.changeEtity(client);
    }
}
