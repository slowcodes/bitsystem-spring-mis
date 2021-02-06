package ng.com.bitsystems.mis.controllers;

import ng.com.bitsystems.mis.services.patients.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PatientsController {
    private PatientService patientService;

    public PatientsController(PatientService patientService) {
        this.patientService = patientService;
    }

    @RequestMapping("/patients/family/add")
    public String addFamily() {
        return "patient/family.html";

        // Form: Family Name, Mobile Nos, Email, Address
    }

    @RequestMapping("/patients/medicals/attachments/add")
    public String addMedialAttachments() {
        return "patient/add_medical_attachment.html";

        // HTML FORM: file, Description
    }

    @RequestMapping("/patients/allergy/add")
    public String addPatientAllergy() {
        return "patient/add_allergy.html";
    }

    @RequestMapping("/patients/insurance/add")
    public String addPatientInsurance() {
        return "patient/add_insurance.html";

        // HTML Form: Patients, Insurance programs
    }

    @RequestMapping("/patients/vitals/add")
    public String addPatientVitals() {
        return "patient/vitals.html";

        // Form: Tempreture, Weight, Blood presure, BMI, Height
    }

    @RequestMapping("/patients/add")
    public String addPatients() {
        return "patients/add.html";

        // current form is OK
    }

    @RequestMapping("/patients/history/socio-cultural/add")
    public String addsocioCulturalHistory() {
        return "patient/add_socio_cultural_history.html";

        // Form: ID, History
    }

    @RequestMapping("/users/patients/directory")
    public String directory(Model model) {
        model.addAttribute("patients", patientService.findAll());

        return "components/datatables/basic/paginations";

        // Table is OK
    }

    @RequestMapping("/patients/e-wallet")
    public String ewallet() {
        return "patient/ewallet.html";

        // Blank
    }

    @RequestMapping("/patients/e-wallet/deposits")
    public String ewalletDeposits() {
        return "patients/ewallet_deposits.html";

        // ID, Date, Amount, Description, Mode of Deposit
    }

    @RequestMapping("/patients/e-wallet/transactions")
    public String ewalletTransactions() {
        return "patient/ewallet_transactions.html";

        // Date, amount, Service, Description, Action
    }

    @RequestMapping("/patients/family")
    public String family() {
        return "patient/family.html";

        // Table: Family Name, Mobile Nos, Email, Address, CreatedAt, Action
    }

    @RequestMapping("/patients/medicals/attachments")
    public String medialAttachments() {
        return "patients/medical_attachments.html";

        // HTML TABLE: file, Description, Date created,
    }

    @RequestMapping("/patients/history/medicals/add")
    public String medical() {
        return "patient/medical_history.html";

        // Form: Medical Activity, Date of accurrance, location, remark
    }

    @RequestMapping("/patients/history/medical")
    public String medicalHistory() {
        return "patient/medical_history.html";

        // Table: Medical Activity, Date of accurrance, location, remark
    }

    @RequestMapping("/patients/allergy")
    public String patientAllergy() {
        return "patient/allergy.html";

        // HTML Table: Drug, Degree
    }

    @RequestMapping("/patients/appointments/view")
    public String patientAppointment() {
        return "patient/appointment.html";

        // HTML Table: ID, Physician, View Report, Status
    }

    @RequestMapping("/patients/folder")
    public String patientFolder() {
        return "patient/folder.html";

        // Investigations
        // HTML Table Lab ID, Lab Serial, Investigation, Date, View Report
        // Consultations
        // Allergy
        // HTML Table: Drug, Degree, Action
        // HTML Table: ID, Physician, View Report, Status
        // Prescriptions
        // HTML Table: Physician, Drugs, Prescription, Dose, Order Status
    }

    @RequestMapping("patients/investigations")
    public String patientInvestigations() {
        return "patient/investigations.html";

        // HTML Table Lab ID, Lab Serial, Investigation, Date, View Report
    }

    @RequestMapping("/patients/folder/investivation/results")
    public String patientResults() {
        return "patient/lab_result.html";

        // HTML Table Lab ID, Lab Serial, Investigation, Date, View Report
    }

    @RequestMapping("/patients/vitals")
    public String patientVitals() {
        return "patient/vitals.html";

        // Table: Tempreture, Weight, Blood presure, BMI, Height
    }

    @RequestMapping("/patients")
    public String patients() {
        return "patients/patients.html";

        // Table is OK
    }

    @RequestMapping("/patients/history/social")
    public String socialHistory() {
        return "patient/socio_history.html";
    }

    @RequestMapping("/patients/history/socio-cultural")
    public String socioCulturalHistory() {
        return "patient/socio_cultural_history.html";

        // Table: ID, History
    }

    @RequestMapping("/patients/family/update")
    public String updateFamily() {
        return "patient/update_family.html";

        // Form: Family Name, Mobile Nos, Email, Address
    }

    @RequestMapping("/patients/update")
    public String updatePatients() {
        return "patient/patients.html";

        // same as add patient
    }

    @RequestMapping("/patients/history/socio-cultural/update")
    public String updateSocioCulturalHistory() {
        return "patient/add_socio_cultural_history.html";

        // Form: ID, History
    }
}
