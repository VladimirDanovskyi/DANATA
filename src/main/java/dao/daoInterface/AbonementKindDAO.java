package dao.daoInterface;

import domain.AbonementKind;

import java.util.List;

/**
 * Created by Admin on 21.02.2017.
 */
public interface AbonementKindDAO {
    public void changeByModel(AbonementKind abonementKind);
    public AbonementKind getById(Integer id);
    public List<AbonementKind> listAbonementsKind();
    public void addAbonimentKind(AbonementKind abonementKind);
    public void  removeAbonimentKind(AbonementKind abonementKind);
}
