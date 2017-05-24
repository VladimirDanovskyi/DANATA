package service;

import dao.InstructorDAOImpl;
import dao.daoInterface.InstructorDAO;
import domain.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.serviceInterface.InstructorService;

import java.util.List;

/**
 * Created by Admin on 20.02.2017.
 */
@Service("InstServDaoImpl")

public class InstructorServiceImpl implements InstructorService {

    @Qualifier("InstDaoImpl")
    @Autowired
    private InstructorDAO instructorDAO;

    @Override
    public List<Instructor> listInstructors() {

        return instructorDAO.listInstructors();
    }

    @Override
    public void addInstructor(Instructor instrucor) {
       instructorDAO.addInstructor(instrucor);
    }

    @Override
    public void removeInstructor(Integer id) {
        instructorDAO.removeInstructor(id);

    }
}
