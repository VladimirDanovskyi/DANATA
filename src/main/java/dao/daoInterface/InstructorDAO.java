package dao.daoInterface;

import domain.Instructor;

import java.util.List;

/**
 * Created by Admin on 17.02.2017.
 */

public interface InstructorDAO {
    public List<Instructor> listInstructors();
    public void addInstructor(Instructor instrucor);
    public void  removeInstructor(Integer id);


}
