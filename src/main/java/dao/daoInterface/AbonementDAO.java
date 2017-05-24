package dao.daoInterface;

import domain.Abonement;

import java.util.List;

/**
 * Created by Admin on 21.02.2017.
 */
public interface AbonementDAO {
    // Найти все abonements.
    public List<Abonement> findAll();

    // Найти со всеми деталями по идентификатору.
    public Abonement getById(Integer id);

    // Вставить или обновить .
    public void add(Abonement abonement);

    // Удалить.
    public void delete(Abonement abonement);
    public void changeEtity(Abonement abonement);

}
