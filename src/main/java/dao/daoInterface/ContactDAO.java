package dao.daoInterface;


import domain.Contact;

import java.util.List;

/**
 * Created by Admin on 21.02.2017.
 */
public interface ContactDAO {
    // Найти все abonements.
    public List<Contact> findAll();

    // Найти со всеми деталями по идентификатору.
    public Contact getById(Integer id);

    // Вставить или обновить .
    public void add(Contact contact);

    // Удалить.
    public void delete(Contact contact);
    public void changeEtity(Contact contact);

}
