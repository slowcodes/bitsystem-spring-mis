package ng.com.bitsystems.mis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdmissionController {

    @RequestMapping("/admission/in-patients")
    public String inPatients(){
        return "";
    }

    @RequestMapping("/admission/in-patients/add")
    public String addInPatients(){
        return "";
    }

    @RequestMapping("/admission/in-patients/update")
    public String updateInPatients(){
        return "";
    }

    @RequestMapping("/admission/out-patients")
    public String outPatients(){
        return "";
    }

    @RequestMapping("/admission/out-patients/add")
    public String addOutPatients(){
        return "";
    }

    @RequestMapping("/admission/out-patients/update")
    public String updateOutPatients(){
        return "";
    }

    @RequestMapping("/admission/prescriptions")
    public String prescriptions(){
        return "";
    }

    @RequestMapping("/admission/prescriptions/add")
    public String addPrescription(){
        return "";
    }

    @RequestMapping("/admission/prescriptions/update")
    public String updatePrescription(){
        return "";
    }

    @RequestMapping("/admission/facilities")
    public String facilities(){
        return "";
    }

    @RequestMapping("/admission/facilities/facility-types/categories")
    public String facilityTypeCategories(){
        return "";
    }

    @RequestMapping("/facilities/wards")
    public String wards(){
        return "";
    }

    @RequestMapping("/facilities/wards/add")
    public String addWards(){
        return "";
    }

    @RequestMapping("/facilities/wards/update")
    public String updateWards(){
        return "";
    }

    @RequestMapping("/facilities/facility-types")
    public String facilityTypes(){
        return "";
    }

    @RequestMapping("/facilities/facility-types/add")
    public String addFacilityTypes(){
        return "";
    }

    @RequestMapping("/facilities/facility-types/update")
    public String updateFacility(){
        return "";
    }
}
