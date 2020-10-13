package ng.com.bitsystems.mis.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class VaccinationController {

    @RequestMapping("/vaccination/vacines")
    public String vaccine(){
        return "vaccines.html";
    }

    @RequestMapping("/vaccination/schedule")
    public String vaccinationSchedule(){
        return "vaccination_schedule.html";
    }

    @RequestMapping("/vaccination/dosage_schedule")
    public String dosageSchedule(){
        return "dosage_schedule.html";
    }

    @RequestMapping("/vaccination/dosage_schedule/add")
    public String addDosageSchedule(){
        return "add_scheduled_dosage.html";
    }

}
