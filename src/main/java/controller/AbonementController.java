package controller;

import domain.Abonement;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.serviceInterface.AbonementKindService;
import service.serviceInterface.AbonementService;
import service.serviceInterface.ListPriceService;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * Created by Admin on 16.03.2017.
 */
@Controller
public class AbonementController {

@Autowired
    private AbonementService abonementService;
@Autowired
    private ListPriceService listPriceService;
    @Autowired
    private AbonementKindService abonementKindService;


    @RequestMapping("/abonementList")
    public  String abonementList(ModelMap model){
        List<Abonement> abonements= abonementService.listAbonementsValid();

        return "abonement/abonementList";
    }

    @RequestMapping("/viewAddAbonement")
    public String viewAdd(@ModelAttribute("abonement") Abonement abonement, Model model){
        model.addAttribute(abonementKindService.listAbonementKind());
        return "abonement/abonementAdd";
    }
    @RequestMapping(value = "addAbonement", method = RequestMethod.POST)
    public  String add(@ModelAttribute ("abonement") @Valid Abonement abonement){
        abonement.setDateCreation(new Date());
        abonementService.addAboniment(abonement);
        return "redirect:abonementList";
    }


}
