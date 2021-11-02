package ng.com.bitsystems.mis.converters.addmission;

import ng.com.bitsystems.mis.command.admissions.AdmissionCommand;
import ng.com.bitsystems.mis.converters.addmission.facilities.StartUsageToStartUsageCommand;
import ng.com.bitsystems.mis.converters.pharmacy.PrescriptionToPrescriptionCommand;
import ng.com.bitsystems.mis.models.admissions.Admission;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AdmissionToAdmissionCommand implements Converter<Admission, AdmissionCommand> {
    private PrescriptionToPrescriptionCommand prescriptionToPrescriptionCommand;
    private StartUsageToStartUsageCommand startUsageToStartUsageCommand;

    public AdmissionToAdmissionCommand(PrescriptionToPrescriptionCommand prescriptionToPrescriptionCommand,
                                       StartUsageToStartUsageCommand startUsageToStartUsageCommand) {
        this.prescriptionToPrescriptionCommand = prescriptionToPrescriptionCommand;
        this.startUsageToStartUsageCommand = startUsageToStartUsageCommand;
    }

    @Override
    public AdmissionCommand convert(Admission source) {
        if(source==null){
            return null;
        }
        final AdmissionCommand admissionCommand = new AdmissionCommand();
        admissionCommand.setId(source.getId());
        admissionCommand.setAdmissionMode(source.getAdmissionMode());
        admissionCommand.setAdmissionDate(source.getAdmissionDate());
        admissionCommand.setClinicalExamination(source.getClinicalExamination());
        admissionCommand.setHistoryOfPresentingComplaint(source.getHistoryPresentingComplaints());

        if(source.getStartUsages().size()>0 && source.getStartUsages() !=null){
            source.getStartUsages().forEach(startUsage -> admissionCommand.getStartUsageCommand().add(startUsageToStartUsageCommand.convert(startUsage)));
        }

        if(source.getPrescriptions().size()>0 && source.getPrescriptions()!=null)
            source.getPrescriptions().forEach(inpatientPrescriptions ->
                    admissionCommand.getPrescriptionCommand().add(prescriptionToPrescriptionCommand.convert(inpatientPrescriptions)));

        if(source.getPatients() != null){
            admissionCommand.setPatientId(source.getPatients().getId());
        }

        if(source.getAppUsers() != null){
            admissionCommand.setUserId(source.getAppUsers().getId());
        }

        admissionCommand.setProvisionalDiagnosis(source.getProvisionalDiagnosis());
        return admissionCommand;
    }
}
