package TestDao;

import domain.AbonementKind;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.AbonementKindServiceImpl;
import service.InstructorServiceImpl;
import service.TrainDirectioServiceImpl;
import service.serviceInterface.TrainDirectionService;

import java.util.Date;
import java.util.List;

/**
 * Created by Admin on 01.03.2017.
 */
public class TestAbKindDao {
   static AbstractApplicationContext context =  new FileSystemXmlApplicationContext("C:/DaNaTa/web/WEB-INF/spring/applicationContext.xml");
    // InstructorDAOImpl  inst =(InstructorDAOImpl) context.getBean("ins");
     static AbonementKindServiceImpl abk=(AbonementKindServiceImpl) context.getBean("AbonementKindServiceImpl");
    static TrainDirectioServiceImpl tds=(TrainDirectioServiceImpl) context.getBean("traindsi");
    /*AbonementKind abonementKind=  abk.getById(4);

   *//* System.out.println(abonementKind.getNameAb());*/
    public static void  changeAbKind(){
        AbonementKind abonementKind= new AbonementKind();
        abonementKind.setNameAb("chupacabra2");
        abonementKind.setDateCreate(new Date());
       // abonementKind.setId(58);
        abonementKind.setDaysValid(356);
        abonementKind.setTraindirections(tds.getById(12));
        abk.addAbonimentKind(abonementKind);
    }

    public static void main(String[] args) {
        changeAbKind();
        //List<AbonementKind>abonementKindList=abk.listAbonementKind();
    }
}
