package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientAdmissionCommand;
import ng.com.bitsystems.mis.converters.addmission.facilities.StartUsageCommandToStartUsage;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientAdmission;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class InpatientAdmCmdToInpatientAdm implements Converter<InpatientAdmissionCommand, InpatientAdmission> {
    private InpatientPrescripCmdToInpatientPrescrip inpatientPrescripCmdToInpatientPrescrip;
    private StartUsageCommandToStartUsage startUsageCommandToStartUsage;

    public InpatientAdmCmdToInpatientAdm(InpatientPrescripCmdToInpatientPrescrip inpatientPrescripCmdToInpatientPrescrip,
                                         StartUsageCommandToStartUsage startUsageCommandToStartUsage) {
        this.inpatientPrescripCmdToInpatientPrescrip = inpatientPrescripCmdToInpatientPrescrip;
        this.startUsageCommandToStartUsage = startUsageCommandToStartUsage;
    }

    @Override
    public InpatientAdmission convert(InpatientAdmissionCommand source) {


        if(source==null){
            return null;
        }
        InpatientAdmission inpatientAdmission = new InpatientAdmission();
        inpatientAdmission.setId(source.getId());
        if(source.getInpatientPrescriptionCommand().size()>0 && source.getInpatientPrescriptionCommand() !=null){
            source.getInpatientPrescriptionCommand().forEach(inpatientPrescriptionCommand -> inpatientAdmission.getInpatientPrescriptions().add(inpatientPrescripCmdToInpatientPrescrip.convert(inpatientPrescriptionCommand)));
        }

        if(source.getStartUsageCommand().size()>0 && source.getStartUsageCommand()!=null){
            source.getStartUsageCommand().forEach(startUsageCommand -> inpatientAdmission.getStartUsages().add(startUsageCommandToStartUsage.convert(startUsageCommand)));
        }
        inpatientAdmission.setAdmissionDate(source.getAdmissionDate());
        inpatientAdmission.setClinicalExamination(source.getClinicalExamination());
        inpatientAdmission.setHistoryPresentingComplaints(source.getHistoryOfPresentingComplaint());

        if(source.getPatientCommandId()!=null){
            Patients patients = new Patients();
            patients.setId(source.getPatientCommandId());
            inpatientAdmission.setPatients(patients);
            patients.addInpatientAdmission(inpatientAdmission);
        }

        inpatientAdmission.setPresentingComplaints(source.getPresentingComplaint());
        inpatientAdmission.setProvisionalDiagnosis(source.getProvisionalDiagnosis());
        inpatientAdmission.setStatus(source.getStatus());
        if(source.getUserId()!=null){
            Users users = new Users();
            users.setId(source.getUserId());
            inpatientAdmission.setUsers(users);
            Users urs= users.addInpatientAdmission(inpatientAdmission);
        }
        return inpatientAdmission;

    }
}
