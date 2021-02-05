package ng.com.bitsystems.mis.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"index", "/", "/index.html"})
    public String login(Model model){
        return "login";
    }

    @RequestMapping({"home", "/home", "/home.html"})
    public String home(Model model){
        return "index";
    }

    @RequestMapping({"/about.html", "/about"})
    public String about(Model model){
        return "components/charts/chart-js";
    }

}
