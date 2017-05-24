package dao.daoInterface;

import domain.Client;

import java.util.List;

/**
 * Created by Admin on 21.02.2017.
 */
public interface ClientDAO {
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
