package dao.daoInterface;

import domain.Abonement;
import domain.ListPrice;

import java.util.List;

/**
 * Created by Admin on 21.02.2017.
 */
public interface ListPriceDAO {
    // Найти все .
    public List<ListPrice> findAll();

    // Найти со всеми деталями по идентификатору.
    public ListPrice getById(Integer id);

    // Вставить или обновить .
    public void add(ListPrice listPrice);

    // Удалить.
    public void delete(ListPrice listPrice);
    public void changeEtity(ListPrice listPrice);

}
