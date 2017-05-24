package service;

import dao.daoInterface.ListPriceDAO;
import domain.ListPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.serviceInterface.ListPriceService;

import java.util.List;

/**
 * Created by Admin on 16.03.2017.
 */
@Service
public class ListServiceImpl implements ListPriceService {
    @Autowired
    private ListPriceDAO listPriceDAO;

    @Override
    public List<ListPrice> findAll() {
        return listPriceDAO.findAll();
    }

    @Override
    public ListPrice getById(Integer id) {
        return listPriceDAO.getById(id);
    }

    @Override
    public void add(ListPrice listPrice) {
        listPriceDAO.add(listPrice);

    }

    @Override
    public void delete(ListPrice listPrice) {
listPriceDAO.delete(listPrice);
    }

    @Override
    public void changeEtity(ListPrice listPrice) {
listPriceDAO.changeEtity(listPrice);
    }
}
