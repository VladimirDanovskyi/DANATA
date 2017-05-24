package controller;

import domain.AbonementKind;
import domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.annotation.ModelMethodProcessor;
import service.serviceInterface.ClientService;
import service.serviceInterface.ContactService;

import java.util.Date;
import java.util.List;

/**
 * Created by Admin on 16.03.2017.
 */



@Controller
public class ClientController {

    @Autowired
    ContactService contactService;

    @Autowired
    ClientService clientService;

    @RequestMapping("/newClient")
    public String newClient(@ModelAttribute("client")Client client){
        return "client/clientAdd";
    }

    @RequestMapping("/addClient")
    public String addNew(@ModelAttribute("client")Client client){
        client.setDateCreation(new Date());
      clientService.add(client);
        return "redirect:/clientListinit";
    }
    @RequestMapping("/clientListinit")
    public String clientList(ModelMap model){
        List<Client> clientList = clientService.findAll();
        model.addAttribute("clientList", clientList);
        return "client/clientList";

    }
    @RequestMapping("/changeClient/{id}")
    public  String changeClient (@PathVariable("id")long id, Model model){
        model.addAttribute(clientService.getById(id));
        return "client/clientAdd";
    }




}
