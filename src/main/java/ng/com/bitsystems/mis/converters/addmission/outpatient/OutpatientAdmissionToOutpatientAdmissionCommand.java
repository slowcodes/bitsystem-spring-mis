package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientAdmissionCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmission;
import org.springframework.core.convert.converter.Converter;

public class OutpatientAdmissionToOutpatientAdmissionCommand implements Converter<OutpatientAdmission, OutpatientAdmissionCommand> {

    private OutpatientPrescriptionToOutpatientPrecriptionCommand outpatientPrescriptionToOutpatientPrecriptionCommand;

    public OutpatientAdmissionToOutpatientAdmissionCommand(OutpatientPrescriptionToOutpatientPrecriptionCommand outpatientPrescriptionToOutpatientPrecriptionCommand) {
        this.outpatientPrescriptionToOutpatientPrecriptionCommand = outpatientPrescriptionToOutpatientPrecriptionCommand;
    }

    @Override
    public OutpatientAdmissionCommand convert(OutpatientAdmission source) {
        if(source==null)
            return null;

        OutpatientAdmissionCommand command = new OutpatientAdmissionCommand();
        command.setId(source.getId());
        command.setAdmissionDate(source.getAdmissionDate());
        command.setClinicalExamination(source.getClinicalExamination());
        command.setHistoryPresentingComplaints(source.getHistoryPresentingComplaints());
        if(source.getPatients()!=null){
            command.setPatientId(source.getPatients().getId());
        }
        if(source.getUsers()!=null)
            command.setUserId(source.getUsers().getId());
        command.setPresentingComplaints(source.getPresentingComplaints());
        command.setClinicalExamination(source.getClinicalExamination());
        command.setProvisionalDiagnosis(source.getProvisionalDiagnosis());
        command.setStatus(source.getStatus());

        return command;
    }
}
