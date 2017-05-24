package controller;

import domain.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import service.serviceInterface.InstructorService;

import java.util.List;

/**
 * Created by Admin on 08.03.2017.
 */
@Controller
public class InstruktorCont {

    @Autowired
     private  InstructorService instructorService ;

    @RequestMapping("/instructors")
    public String instructorsList(ModelMap model){
  List<Instructor> instructorList= instructorService.listInstructors();
        model.addAttribute("instructorList", instructorList);
        return  "instructor/instructorlist";




    }

}
