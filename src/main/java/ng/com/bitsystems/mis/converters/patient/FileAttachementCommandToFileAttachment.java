package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientMedicalFileAttachmentCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalFileAttachment;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class FileAttachementCommandToFileAttachment implements Converter<PatientMedicalFileAttachmentCommand, PatientsMedicalFileAttachment> {


    @Nullable
    @Override
    public PatientsMedicalFileAttachment convert(PatientMedicalFileAttachmentCommand source) {
        if(source==null)
            return null;

        PatientsMedicalFileAttachment patientsMedicalFileAttachment=new PatientsMedicalFileAttachment();
        patientsMedicalFileAttachment.setId(source.getId());

        if(source.getPatientId()!=null){
            Patients patients=new Patients();
            patients.setId(source.getPatientId());
            patientsMedicalFileAttachment.setPatients(patients);
            Patients patient = patients.addFileAttachement(patientsMedicalFileAttachment);
        }

        if(source.getUserId() !=null){
            Users usr=new Users();
            usr.setId(source.getUserId());
            patientsMedicalFileAttachment.setUsers(usr);
            Users doctor = usr.addMedicalFileAttachemt(patientsMedicalFileAttachment);
        }

        patientsMedicalFileAttachment.setDescription(source.getDescription());
        patientsMedicalFileAttachment.setMedicalFile(source.getMedicalFile());

        return patientsMedicalFileAttachment;
    }
}
