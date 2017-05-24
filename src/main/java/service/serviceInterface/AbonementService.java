package service.serviceInterface;

import domain.Abonement;
import domain.AbonementKind;

import java.util.List;

/**
 * Created by Admin on 16.03.2017.
 */
public interface AbonementService {
    public void changeByModel(Abonement abonement);
    public Abonement getById(Integer id);
    public List<Abonement> listAbonementsKind();
    public void addAboniment(Abonement abonement);
    public void  removeAboniment(Abonement abonement);
    public List<Abonement> listAbonementsValid();

}
