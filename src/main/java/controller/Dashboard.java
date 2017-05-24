package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Admin on 23.02.2017.
 */
@Controller
public class Dashboard {
    @RequestMapping("/index")
    public String redirect(){
        return "wrapDashboard";
    }
}
