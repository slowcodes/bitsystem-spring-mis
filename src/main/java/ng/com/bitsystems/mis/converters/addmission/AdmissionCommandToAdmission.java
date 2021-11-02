package ng.com.bitsystems.mis.converters.addmission;

import ng.com.bitsystems.mis.command.admissions.AdmissionCommand;
import ng.com.bitsystems.mis.converters.addmission.facilities.StartUsageCommandToStartUsage;
import ng.com.bitsystems.mis.converters.pharmacy.PrescriptionCommandToPrescription;
import ng.com.bitsystems.mis.models.admissions.Admission;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AdmissionCommandToAdmission implements Converter<AdmissionCommand, Admission> {
    private PrescriptionCommandToPrescription prescriptionCommandToPrescription;
    private StartUsageCommandToStartUsage startUsageCommandToStartUsage;

    public AdmissionCommandToAdmission(PrescriptionCommandToPrescription prescriptionCommandToPrescription,
                                       StartUsageCommandToStartUsage startUsageCommandToStartUsage) {
        this.prescriptionCommandToPrescription = prescriptionCommandToPrescription;
        this.startUsageCommandToStartUsage = startUsageCommandToStartUsage;
    }

    @Override
    public Admission convert(AdmissionCommand source) {


        if(source==null){
            return null;
        }
        Admission admission = new Admission();
        admission.setId(source.getId());
        admission.setAdmissionMode(source.getAdmissionMode());

        if(source.getPrescriptionCommand().size()>0 && source.getPrescriptionCommand() !=null){
            source.getPrescriptionCommand().forEach(prescriptionCommand ->
                    admission.getPrescriptions().add(prescriptionCommandToPrescription.convert(prescriptionCommand)));
        }

        if(source.getStartUsageCommand().size()>0 && source.getStartUsageCommand()!=null){
            source.getStartUsageCommand().forEach(startUsageCommand -> admission.getStartUsages().add(startUsageCommandToStartUsage.convert(startUsageCommand)));
        }
        admission.setAdmissionDate(source.getAdmissionDate());
        admission.setClinicalExamination(source.getClinicalExamination());
        admission.setHistoryPresentingComplaints(source.getHistoryOfPresentingComplaint());

        if(source.getPatientId()!=null){
            Patients patients = new Patients();
            patients.setId(source.getPatientId());
            admission.setPatients(patients);
            Patients patient = patients.addAdmission(admission);
        }

        admission.setPresentingComplaints(source.getPresentingComplaint());
        admission.setProvisionalDiagnosis(source.getProvisionalDiagnosis());
        admission.setStatus(source.getStatus());

        if(source.getUserId()!=null){
            AppUsers appUsers = new AppUsers();
            appUsers.setId(source.getUserId());
            admission.setAppUsers(appUsers);
            AppUsers urs= appUsers.addAdmission(admission);
        }
        return admission;

    }
}
