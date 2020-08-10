package ng.com.bitsystems.mis.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "/index", "/home"})
    public String home(Model model){

        return "ui/index.html";
    }
}
