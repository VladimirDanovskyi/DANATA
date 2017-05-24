package controller;

import domain.AbonementKind;
import domain.Traindirections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import service.serviceInterface.AbonementKindService;
import service.serviceInterface.TrainDirectionService;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * Created by Admin on 21.02.2017.
 */

@Controller
public class AbonementKindController  {



    @Autowired
     private  AbonementKindService abonementKindService;
    @Autowired
    private TrainDirectionService trainDirectionService;



   @RequestMapping("/abKindList")
public String abKindList(ModelMap model){
        List<AbonementKind> abonementKindList = abonementKindService.listAbonementKind();
        model.addAttribute("abonementKindList", abonementKindList);

 return "abKind/abbkindlist";
}

@RequestMapping( "/changeAbKind/{id}")
public String changeAbKind(@PathVariable("id")int id, Model model ){
    AbonementKind abonementKind= abonementKindService.getById(id);
    model.addAttribute("abonementKind", abonementKind);
    model.addAttribute("trainDirectionList", trainDirectionService.findAll());
    return "abKind/abkindchange";
}

    @RequestMapping(value = "/change", method = RequestMethod.POST)
    public String change( @ModelAttribute("abonementKind")@Valid AbonementKind abonementKind, Model model) {
        abonementKindService.changeByModel(abonementKind);

        return "redirect:abKindList";
    }

        @RequestMapping("/viewAdd")
        public  String viewAdd( @ModelAttribute("abonementKind")  AbonementKind abonementKind,
                BindingResult result, Model model){
            model.addAttribute("trainDirectionList", trainDirectionService.findAll());
            return "abKind/abkindadd";
        }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addAbKindt(  @ModelAttribute  ("abonementKind") @Valid AbonementKind abonementKind,
                             BindingResult result ) {
        abonementKind.setDateCreate(new Date());
        abonementKindService.addAbonimentKind(abonementKind);
              return "redirect:abKindList";
    }




    @GetMapping("/delete/{id}")
    public String deleteAbKind(@PathVariable("id")Integer id) {

        AbonementKind abonementKind=abonementKindService.getById(id);
        abonementKindService.removeAbonimentKind(abonementKind);
        return "abKind/delredir";
    }




    }



