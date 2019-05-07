package domain;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.AbonementKindServiceImpl;
import service.InstructorServiceImpl;
import service.serviceInterface.AbonementKindService;

import java.util.Date;

/**
 * Created by Admin on 20.02.2017.
 */
public class TestDao {



    public static void main(String[] args) {
    AbstractApplicationContext context =  new FileSystemXmlApplicationContext("C:/DaNaTa/web/WEB-INF/spring/applicationContext.xml");
       // InstructorDAOImpl  inst =(InstructorDAOImpl) context.getBean("ins");
        InstructorServiceImpl inst =(InstructorServiceImpl) context.getBean("InstServDaoImpl");
       AbonementKindServiceImpl abk=(AbonementKindServiceImpl) context.getBean("AbonementKindServiceImpl");
        AbonementKind abonementKind=  abk.getById(4);

        System.out.println(abonementKind.getNameAb());

        Instructor instructor = new Instructor();

        instructor.setFn("Vavan");
        instructor.setMn("alex");
        instructor.setLn("dan");
        instructor.setDateBirth(new Date());
        instructor.setDateHire(new Date());
        instructor.setDateFire(new Date());
        instructor.setWork(true);
       // InstructorDAOImpl inst = new InstructorDAOImpl(session);
      //  inst.addInstructor(instructor);




    }
}
