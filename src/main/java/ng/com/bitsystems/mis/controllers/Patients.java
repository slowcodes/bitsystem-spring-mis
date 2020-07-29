package ng.com.bitsystems.mis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Patients {

    @RequestMapping("/patients")
    public String getPatients(Model model){
        return "";
    }
}
