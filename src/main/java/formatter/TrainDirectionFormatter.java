package formatter;

import domain.Traindirections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import service.serviceInterface.TrainDirectionService;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;


/**
 * Created by Admin on 14.03.2017.
 */
@Component
public class TrainDirectionFormatter implements Formatter<Traindirections> {
    @Autowired
    TrainDirectionService trainDirectionService;

    @Override
    public String print(Traindirections traindirections, Locale arg1) {
        return traindirections.getName().toString();
    }


    @Override
    public Traindirections parse(String id, Locale arg1) throws ParseException {
        System.out.println(" formater id"+ id);

        return trainDirectionService.getById(Integer.parseInt(id));
    }


}
