package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientAdmissionCommand;
import ng.com.bitsystems.mis.converters.addmission.facilities.StartUsageToStartUsageCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientAdmission;
import org.springframework.core.convert.converter.Converter;

public class InpatientAdmToInpatientAdmCmd implements Converter<InpatientAdmission, InpatientAdmissionCommand> {
    private InpatientPrescripToInpatientPrescripCmd inpatientPrescripToInpatientPrescripCmd;
    private StartUsageToStartUsageCommand startUsageToStartUsageCommand;

    public InpatientAdmToInpatientAdmCmd(InpatientPrescripToInpatientPrescripCmd inpatientPrescripToInpatientPrescripCmd,
                                         StartUsageToStartUsageCommand startUsageToStartUsageCommand) {
        this.inpatientPrescripToInpatientPrescripCmd = inpatientPrescripToInpatientPrescripCmd;
        this.startUsageToStartUsageCommand = startUsageToStartUsageCommand;
    }

    @Override
    public InpatientAdmissionCommand convert(InpatientAdmission source) {
        if(source==null){
            return null;
        }
        final InpatientAdmissionCommand inpatientAdmissionCommand = new InpatientAdmissionCommand();
        inpatientAdmissionCommand.setId(source.getId());
        inpatientAdmissionCommand.setAdmissionDate(source.getAdmissionDate());
        inpatientAdmissionCommand.setClinicalExamination(source.getClinicalExamination());
        inpatientAdmissionCommand.setHistoryOfPresentingComplaint(source.getHistoryPresentingComplaints());

        if(source.getStartUsages().size()>0 && source.getStartUsages() !=null){
            source.getStartUsages().forEach(startUsage -> inpatientAdmissionCommand.getStartUsageCommand().add(startUsageToStartUsageCommand.convert(startUsage)));
        }

        if(source.getInpatientPrescriptions().size()>0 && source.getInpatientPrescriptions()!=null)
            source.getInpatientPrescriptions().forEach(inpatientPrescriptions -> inpatientAdmissionCommand.getInpatientPrescriptionCommand().add(inpatientPrescripToInpatientPrescripCmd.convert(inpatientPrescriptions)));

        if(source.getPatients() != null){
            inpatientAdmissionCommand.setPatientCommandId(source.getPatients().getId());
        }

        if(source.getUsers() != null){
            inpatientAdmissionCommand.setUserId(source.getUsers().getId());
        }

        inpatientAdmissionCommand.setProvisionalDiagnosis(source.getProvisionalDiagnosis());
        return inpatientAdmissionCommand;
    }
}
