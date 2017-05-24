package dao;

import dao.daoInterface.AbstractDao;
import dao.daoInterface.ListPriceDAO;
import domain.ListPrice;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 16.03.2017.
 */
@Transactional
@Repository
public class ListPriceDaoImpl extends AbstractDao implements ListPriceDAO {
    @Override
    public List<ListPrice> findAll() {
        return getSession().createQuery("from ListPrice ").list();

    }

    @Override
    public ListPrice getById(Integer id) {
        return (ListPrice) getSession().get(ListPrice.class,id);
    }

    @Override
    public void add(ListPrice listPrice) {
getSession().save(listPrice);
    }

    @Override
    public void delete(ListPrice listPrice) {
getSession().delete(listPrice);
    }

    @Override
    public void changeEtity(ListPrice listPrice) {
getSession().update(listPrice);
    }
}
