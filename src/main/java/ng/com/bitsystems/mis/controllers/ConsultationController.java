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
        //
    }

    @RequestMapping("/specializations/add")
    public String addSpecialization(){
        return "add_specialization.html";
        //HTML Form: specialization, description
    }

    @RequestMapping("/specializations/update")
    public String updateSpecialization(){
        //HTML Form: specialization, description
        return "update_specialization.html";
    }

    @RequestMapping("/consultants/add")
    public String add(){
        //Form first name, last name, sex,email,phone,specializations
        return "add_consultants.html";
    }

    @RequestMapping("/consultants/update")
    public String update(){
        //Form first name, last name, sex,email,phone,specializations
        return "add_consultants.html";
    }

    @RequestMapping("/consultants/delete")
    public String delete(){
        return "";
    }

    @RequestMapping("/consultations")
    public String consultations(){
        return "consultations.html";
        //Table: Name of last, specialization, data of specialization, scheduled by, date of consultation
    }

    @RequestMapping("/consultation/consultants")
    public String consultants(){
        return "consultants.html";
        //Table First name, last, specialization, Action
    }

    @RequestMapping("/consultation/book")
    public String book(){
        //HTML form: Specialization, Patient Name, Note
        return "bookConsultation.html";
    }

    @RequestMapping("/consultation/appointments/add")
    public String addAppointment(){
        return "";

    }
}
