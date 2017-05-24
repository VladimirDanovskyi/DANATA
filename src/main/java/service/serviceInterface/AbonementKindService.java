package service.serviceInterface;

import domain.AbonementKind;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 21.02.2017.
 */

public interface AbonementKindService {
    public void changeByModel(AbonementKind abonementKind);
    public AbonementKind getById(Integer id);
    public List<AbonementKind> listAbonementKind();
    public void addAbonimentKind(AbonementKind abonementKind);
    public void  removeAbonimentKind(AbonementKind abonementKind);
}
