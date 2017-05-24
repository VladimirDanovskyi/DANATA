package service.serviceInterface;

import domain.Contact;

import java.util.List;

/**
 * Created by Admin on 16.03.2017.
 */
public interface ContactService {
    // Найти все abonements.
    public List<Contact> findAll();

    // Найти со всеми деталями по идентификатору.
    public Contact getById(Integer id);

    // Вставить или обновить .
    public void add(Contact abonement);

    // Удалить.
    public void delete(Contact abonement);
    public void changeEtity(Contact abonement);
}
