package TestDao;

import domain.AbonementKind;
import domain.Traindirections;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.AbonementKindServiceImpl;
import service.TrainDirectioServiceImpl;

import java.util.Date;

/**
 * Created by Admin on 09.03.2017.
 */
public class TrainDirectionTest {
    static AbstractApplicationContext context =  new FileSystemXmlApplicationContext("C:/DaNaTa/web/WEB-INF/spring/applicationContext.xml");
    private  static TrainDirectioServiceImpl serv = (TrainDirectioServiceImpl)context.getBean("traindsi");
   private static AbonementKindServiceImpl abk=(AbonementKindServiceImpl) context.getBean("AbonementKindServiceImpl");

    public static void main(String[] args) {

       Traindirections traindirectionsserv=serv.getById(11);
        for(AbonementKind abonementKind: traindirectionsserv.getAbonementKinds()){
            System.out.println(abonementKind.getNameAb()+"  "+abonementKind.getDaysValid());
        }

    }
    public static  void setAbkind(){
        AbonementKind abonementKind= new AbonementKind();
        abonementKind.setNameAb("fit1");
        abonementKind.setDateCreate(new Date());
        abonementKind.setDaysValid(356);
        Traindirections traindirections=serv.getById(10);
        abonementKind.setTraindirections(traindirections);
        traindirections.getAbonementKinds().add(abonementKind);
        abk.addAbonimentKind(abonementKind);

        AbonementKind abonementKind3= new AbonementKind();
        abonementKind3.setNameAb("fit2");
        abonementKind3.setDateCreate(new Date());
        abonementKind3.setDaysValid(356);
        Traindirections traindirections3=serv.getById(10);
        abonementKind3.setTraindirections(traindirections3);
        traindirections3.getAbonementKinds().add(abonementKind3);
        abk.addAbonimentKind(abonementKind3);



        AbonementKind abonementKind1= new AbonementKind();
        abonementKind1.setNameAb("train");
        abonementKind1.setDateCreate(new Date());
        abonementKind1.setDaysValid(356);
        Traindirections traindirections1=serv.getById(11);
        abonementKind1.setTraindirections(traindirections1);
        traindirections1.getAbonementKinds().add(abonementKind1);
        abk.addAbonimentKind(abonementKind1);

        AbonementKind abonementKind4= new AbonementKind();
        abonementKind4.setNameAb("train2");
        abonementKind4.setDateCreate(new Date());
        abonementKind4.setDaysValid(356);
        Traindirections traindirections4=serv.getById(11);
        abonementKind4.setTraindirections(traindirections4);
        traindirections4.getAbonementKinds().add(abonementKind4);
        abk.addAbonimentKind(abonementKind4);


    }
    public static  void setTraindirections(){
        Traindirections traindirections= new Traindirections();
        traindirections.setName("Фітнес зал");
        traindirections.setDateCreate(new Date());
        traindirections.setValid(true);
        Traindirections traindirections1=new Traindirections();
        traindirections1.setDateCreate(new Date());
        traindirections1.setName("Тренажерний зал");
        traindirections1.setValid(true);
        serv.add(traindirections);
        serv.add(traindirections1);
    }
}
