package controller;

import domain.Traindirections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.jdbc.IncorrectResultSetColumnCountException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.serviceInterface.TrainDirectionService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Admin on 10.03.2017.
 */
@Controller
public class TrainDirectionController {
    @Autowired
    TrainDirectionService trainDirectionService;

    @RequestMapping("/train_direction_list")
    public String trainDirectionList(ModelMap model){
        String valid="актуальний";
        List<Traindirections>traindirectionsList =trainDirectionService.findAll();
        for(Traindirections traindirections:traindirectionsList){
            if(traindirections.getValid()==true){
              valid="актульний";
            }else {
               valid="не актуальний";
            }
        }
        model.addAttribute("train_direction_list",traindirectionsList);
        return "directions/direction_list";
    }

    @RequestMapping("/train_direct_Change/{id}")
    public String   changeTrainDirection(@PathVariable ("id") Integer id, Model model){
        Traindirections traindirections=trainDirectionService.getById(id);
model.addAttribute("trainDirection", traindirections );

        return "directions/change_direction";
    }

    @RequestMapping(value = "changeTrainDirection",method = RequestMethod.POST)
    public String change( @ModelAttribute ("trainDirection") Traindirections traindirections )
    {

        trainDirectionService.changeEtity(traindirections);
        return "redirect:train_direction_list";
    }

    @RequestMapping("/viewAddTrainDirection" )
    public String viewAdd(@ModelAttribute ("trainDirection") Traindirections traindirections){
        return "/directions/train_direct_add";
    }
    @RequestMapping("/addTraindirection")
    public String addDirection(@ModelAttribute("trainDirection") Traindirections traindirections){
        traindirections.setDateCreate(new Date());
        trainDirectionService.add(traindirections);
        return "redirect:train_direction_list";
    }



    @RequestMapping("/deleteTrainDirect/{id}")
            public String deleteDirect(@PathVariable ("id") Integer id){
       trainDirectionService.delete(trainDirectionService.getById(id));

            return "/directions/train_dir_delredir";
            }

    @RequestMapping("/abonementKindsOfTrainDirection/{id}")
    public String abKindsOfTrainDirection(@PathVariable("id") Integer id, ModelMap model){

        model.addAttribute("trainDirection",trainDirectionService.getById(id) );

        return "/directions/abonement_kinds_of_direction";

        }

}
