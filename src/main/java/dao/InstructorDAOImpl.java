package dao;

import dao.daoInterface.AbstractDao;
import dao.daoInterface.InstructorDAO;
import domain.Instructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


/**
 * Created by Admin on 17.02.2017.
 */


@Repository("InstDaoImpl")
public class InstructorDAOImpl extends AbstractDao implements InstructorDAO{
    @Transactional
    @Override
    @SuppressWarnings("unchecked")
    public List<Instructor> listInstructors() {
        return getSession().createQuery("from Instructor").list();
    }
    @Transactional
    @Override
    public void addInstructor(Instructor instrucor) {
        if(getSession()==null){
      System.out.println("null ");}
     getSession().save(instrucor);

    }
    @Transactional
    @Override
    public void removeInstructor(Integer id) {
 Instructor instructor=(Instructor)getSession().load(Instructor.class,id);
        if(null!=instructor){
          getSession().delete(instructor);
        }
    }


}
