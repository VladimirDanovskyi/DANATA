package service;

import dao.daoInterface.TrainDirectionDAO;
import domain.Traindirections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.serviceInterface.TrainDirectionService;

import java.util.List;

/**
 * Created by Admin on 09.03.2017.
 */
@Service ("traindsi")
public class TrainDirectioServiceImpl implements TrainDirectionService {
    @Autowired
    private TrainDirectionDAO trainDirectionDAO;

    @Override
    public List<Traindirections> findAll() {
        return  trainDirectionDAO.findAll();
    }

    @Override
    public Traindirections getById(Integer id) {
        return trainDirectionDAO.getById(id);
    }

    @Override
    public void add(Traindirections traindirections) {
            trainDirectionDAO.add(traindirections);
    }

    @Override
    public void delete(Traindirections traindirections) {
            trainDirectionDAO.delete(traindirections);
    }

    @Override
    public void changeEtity(Traindirections traindirections) {
        trainDirectionDAO.changeEtity(traindirections);
    }
}
