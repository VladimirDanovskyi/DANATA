package service.serviceInterface;

import domain.Client;

import java.util.List;

/**
 * Created by Admin on 16.03.2017.
 */
public interface ClientService {
    // Найти все abonements.
    public List<Client> findAll();

    // Найти со всеми деталями по идентификатору.
    public Client getById(Long id);

    // Вставить или обновить .
    public void add(Client client);

    // Удалить.
    public void delete(Client client);
    public void changeEtity(Client client);

}
