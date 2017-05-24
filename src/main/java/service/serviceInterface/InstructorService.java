package service.serviceInterface;

import domain.Instructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 20.02.2017.
 */

public interface InstructorService {
    public List<Instructor> listInstructors();
    public void addInstructor(Instructor instrucor);
    public void  removeInstructor(Integer id);
}
