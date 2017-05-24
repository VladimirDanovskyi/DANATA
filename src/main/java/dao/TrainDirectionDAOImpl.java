package dao;

import dao.daoInterface.AbstractDao;
import dao.daoInterface.TrainDirectionDAO;
import domain.Traindirections;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 09.03.2017.
 */
@Transactional
@Repository
public class TrainDirectionDAOImpl extends AbstractDao implements TrainDirectionDAO  {

    @Override
    public List<Traindirections> findAll() {
        return getSession().createQuery("from Traindirections " ).list();
    }

    @Override
    public Traindirections getById(Integer id) {
        return (Traindirections) getSession().get(Traindirections.class,id);
    }

    @Override
    public void add(Traindirections traindirections) {
        getSession().save(traindirections);
    }

    @Override
    public void delete(Traindirections traindirections) {
        getSession().delete(traindirections);

    }

    @Override
    public void changeEtity(Traindirections traindirections) {
        getSession().update(traindirections);
    }
}
