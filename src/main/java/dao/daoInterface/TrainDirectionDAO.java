package dao.daoInterface;

import domain.Traindirections;

import java.util.List;

/**
 * Created by Admin on 21.02.2017.
 */
public interface TrainDirectionDAO {


        // Найти все направления.
        public List<Traindirections> findAll();



        // Найти direction со всеми деталями по идентификатору.
        public Traindirections getById(Integer id);

        // Вставить или обновить контакт.
        public void add(Traindirections traindirections);

        // Удалить контакт.
        public void delete(Traindirections traindirections);
        public void changeEtity(Traindirections traindirections);

}
