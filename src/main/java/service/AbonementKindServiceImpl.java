package service;

import dao.AbonementKindDaoImpl;
import dao.daoInterface.AbonementKindDAO;
import domain.AbonementKind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 21.02.2017.
 */

@Service("AbonementKindServiceImpl")
public class AbonementKindServiceImpl implements service.serviceInterface.AbonementKindService {

    @Qualifier("AbKindDaoImpl")
    @Autowired
   private AbonementKindDAO abonementKindDao;

    @Override
    public void changeByModel(AbonementKind abonementKind) {
        abonementKindDao.changeByModel(abonementKind);}

    @Override
    public AbonementKind getById(Integer id) {

        return abonementKindDao.getById(id);
    }

    @Override
    public List<AbonementKind> listAbonementKind() {
        return abonementKindDao.listAbonementsKind();
    }

    @Override
    public void addAbonimentKind(AbonementKind abonementKind) {
               abonementKindDao.addAbonimentKind(abonementKind);
    }

    @Override
    public void removeAbonimentKind(AbonementKind abonementKind) {
        abonementKindDao.removeAbonimentKind(abonementKind);

    }
}
