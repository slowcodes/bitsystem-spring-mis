package ng.com.bitsystems.mis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consultation")
public class ConsultationController {

    @RequestMapping("/")
    public String index(){
        return "consultations.html";
        //HTML Table Columns (Name, Specialization, Staff ID, Action)
    }

    @RequestMapping("/specializations")
    public String specializations(){
        return "specialization.html";
    }

    @RequestMapping("/specializations/add")
    public String addSpecialization(){
        return "specialization.html";
        //HTML Form: Fields,
    }

    @RequestMapping("/specializations/update")
    public String updateSpecialization(){
        return "updateSpecialization.html";
    }

    @RequestMapping("/consultants/add")
    public String add(){
        return "addConsultants.html";
    }

    @RequestMapping("/consultations")
    public String consultations(){
        return "consultations.html";
    }

    @RequestMapping("/consultation/consultants")
    public String consultants(){
        return "consultants.html";
    }

    @RequestMapping("/consultation/book")
    public String book(){
        return "bookConsultation.html";
    }

    @RequestMapping("/consultation/appointments/add")
    public String addAppointment(){
        return "";
    }
}
