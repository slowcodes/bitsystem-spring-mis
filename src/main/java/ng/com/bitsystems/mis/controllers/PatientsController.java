package ng.com.bitsystems.mis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PatientsController {

    @RequestMapping("/patients")
    public String patients(){
        return "patients.html";
    }

    @RequestMapping("/patients/add")
    public String addPatients(){
        return "addPatients.html";
    }

    @RequestMapping("/patients/update")
    public String updatePatients(){
        return "updatePatients.html";
    }

    @RequestMapping("/patients/insurance/add")
    public String addPatientInsurance(){
        return "addPatientInsurance.html";
    }

    @RequestMapping("patients/investigations")
    public String patientInvestigations(){
        return "patientInvestigations.html";
    }

    @RequestMapping("/patients/appointments/view")
    public String patientAppointment(){
        return "patientAppointment.html";
    }

    @RequestMapping("/patients/folder")
    public String patientFolder(){
        return "patientFolder.html";
    }

    @RequestMapping("/patients/folder/investivation/results")
    public String patientResults(){
        return "patientFolder.html";
    }

    @RequestMapping("/patients/records")
    public String patientRecords(){
        return "patientRecords.html";
    }

    @RequestMapping("/patients/allergy")
    public String patientAllergy(){
        return "patientAllergy.html";
    }

    @RequestMapping("/patients/history/family")
    public String familyHistory(){
        return "familyHistory.html";
    }

    @RequestMapping("/patients/history/medical")
    public String medicalHistory(){
        return "medicalHistory.html";
    }

    @RequestMapping("/patients/vitals")
    public String patientVitals(){
        return "patientVitals.html";
    }

    @RequestMapping("/patients/history/socio-cultural")
    public String socioCulturalHistory(){
        return "socioCulturalHistory.html";
    }

    @RequestMapping("/patients/history/social")
    public String socialHistory(){
        return "socioHistory.html";
    }

    @RequestMapping("/patients/medicals/attachments")
    public String medialAttachments(){
        return "medicalAttachment.html";
    }

    @RequestMapping("/patients/medicals/activities/listings")
    public String medicalActivityListing(){
        return "medicalActivityListing.html";
    }

    @RequestMapping("/patients/e-wallet")
    public String ewallet(){
        return "ewallet.html";
    }

    @RequestMapping("/patients/e-wallet/deposits")
    public String ewalletDeposits(){
        return "ewalletDeposits.html";
    }

    @RequestMapping("/patients/e-wallet/transactions")
    public String ewalletTransactions(){
        return "ewalletTransactions.html";
    }
}
