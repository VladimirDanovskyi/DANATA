package controller;

import domain.Traindirections;
import java.util.Collections;
import java.util.Comparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.serviceInterface.TrainDirectionService;

import java.util.Date;
import java.util.List;

/**
 * Created by Admin on 10.03.2017.
 */
@Controller
public class TrainDirectionController {
    @Autowired
    TrainDirectionService trainDirectionService;
    private List<Traindirections> traindirectionList;

       @RequestMapping("/train_direction_list")
    public String trainDirectionList(ModelMap model) {

           if (traindirectionList == null) {
               traindirectionList = trainDirectionService.findAll();

           }

        model.addAttribute("train_direction_list", traindirectionList);
        return "directions/direction_list";

    }



    @RequestMapping("/train_direction_sort_list/{columnName}")
    public String trainDirectionSortedList(@PathVariable("columnName") String columnName, Model model) {
        if (traindirectionList == null) {
            traindirectionList = trainDirectionService.findAll();

        }

        switch(columnName) {
            case "name":
                /*if (traindirectionsList.get(0).equals(name)) {
                    traindirectionsList.sort(Comparator.comparing(a -> a.getName()));
                }*/

                traindirectionList.sort(Comparator.comparing(a -> a.getName()));
                //reverse
                Collections.sort(traindirectionList, Comparator.comparing(Traindirections :: getName).reversed());
                model.addAttribute("train_direction_list", traindirectionList);
                break;
            case "createDate":
                traindirectionList.sort(Comparator.comparing(a -> a.getDateCreate()));
                model.addAttribute("train_direction_list", traindirectionList);
                break;
            case "valid":
                traindirectionList.sort(Comparator.comparing(a -> a.getValid()));
                model.addAttribute("train_direction_list", traindirectionList);
                break;
            default:
                break;
        }

        return "redirect:http://localhost:8080/train_direction_list";
    }

    @RequestMapping("/train_direct_Change/{id}")
    public String changeTrainDirection(@PathVariable("id") Integer id, Model model) {
        Traindirections traindirections = trainDirectionService.getById(id);
        model.addAttribute("trainDirection", traindirections);

        return "directions/change_direction";
    }

    @RequestMapping(value = "changeTrainDirection", method = RequestMethod.POST)
    public String change(@ModelAttribute("trainDirection") Traindirections traindirections) {

        trainDirectionService.changeEtity(traindirections);
        return "redirect:train_direction_list";
    }

    @RequestMapping("/viewAddTrainDirection")
    public String viewAdd(@ModelAttribute("trainDirection") Traindirections traindirections) {
        return "/directions/train_direct_add";
    }

    @RequestMapping("/addTraindirection")
    public String addDirection(@ModelAttribute("trainDirection") Traindirections traindirections) {
        traindirections.setDateCreate(new Date());
        trainDirectionService.add(traindirections);
        return "redirect:train_direction_list";
    }


    @RequestMapping("/deleteTrainDirect/{id}")
    public String deleteDirect(@PathVariable("id") Integer id) {
        trainDirectionService.delete(trainDirectionService.getById(id));

        return "/directions/train_dir_delredir";
    }

    @RequestMapping("/abonementKindsOfTrainDirection/{id}")
    public String abKindsOfTrainDirection(@PathVariable("id") Integer id, ModelMap model) {

        model.addAttribute("trainDirection", trainDirectionService.getById(id));

        return "/directions/abonement_kinds_of_direction";

    }

}
