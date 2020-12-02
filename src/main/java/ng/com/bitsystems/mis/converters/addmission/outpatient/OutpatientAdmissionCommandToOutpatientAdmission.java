package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientAdmissionCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmission;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class OutpatientAdmissionCommandToOutpatientAdmission
implements Converter<OutpatientAdmissionCommand, OutpatientAdmission> {
    private OutpatientPrescriptionCommandToOutpatientPrescription outpatientPrescriptionCommandToOutpatientPrescription;

    public OutpatientAdmissionCommandToOutpatientAdmission(OutpatientPrescriptionCommandToOutpatientPrescription outpatientPrescriptionCommandToOutpatientPrescription) {
        this.outpatientPrescriptionCommandToOutpatientPrescription = outpatientPrescriptionCommandToOutpatientPrescription;
    }

    @Override
    public OutpatientAdmission convert(OutpatientAdmissionCommand source) {

        if(source==null){
            return null;
        }
        final OutpatientAdmission outpatientAdmission = new OutpatientAdmission();
        outpatientAdmission.setId(source.getId());
        if(source.getOutpatientPrescriptionCommand()!=null && source.getOutpatientPrescriptionCommand().size()>0)
            source.getOutpatientPrescriptionCommand().forEach(prescriptionCommand->{outpatientAdmission.getOutpatientPrescriptions().add(outpatientPrescriptionCommandToOutpatientPrescription.convert(prescriptionCommand));});
        outpatientAdmission.setAdmissionDate(source.getAdmissionDate());
        outpatientAdmission.setClinicalExamination(source.getClinicalExamination());
        outpatientAdmission.setHistoryPresentingComplaints(source.getHistoryPresentingComplaints());
        outpatientAdmission.setProvisionalDiagnosis(source.getProvisionalDiagnosis());
        if(source.getPatientId()!=null) {
            Patients patients = new Patients();
            patients.setId(source.getPatientId());
            outpatientAdmission.setPatients(patients);
            patients.addOutpatientAdmission(outpatientAdmission);
        }
        outpatientAdmission.setStatus(source.getStatus());

        if(source.getUserId()!=null){
            Users user = new Users();
            user.setId(source.getUserId());
            outpatientAdmission.setUsers(user);
            Users usr = user.addAdmittedOutpatients(outpatientAdmission);
        }

        return outpatientAdmission;
    }
}
