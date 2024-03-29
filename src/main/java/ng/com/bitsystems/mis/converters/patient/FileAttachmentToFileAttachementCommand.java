package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientMedicalFileAttachmentCommand;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalFileAttachment;
import org.springframework.core.convert.converter.Converter;

public class FileAttachmentToFileAttachementCommand implements
        Converter<PatientsMedicalFileAttachment, PatientMedicalFileAttachmentCommand> {
    @Override
    public PatientMedicalFileAttachmentCommand convert(PatientsMedicalFileAttachment source) {

        if(source==null)
            return null;

        final PatientMedicalFileAttachmentCommand command=new PatientMedicalFileAttachmentCommand();

        command.setId(source.getId());
        command.setDescription(source.getDescription());
        command.setMedicalFile(source.getMedicalFile());

        if(source.getPatients()!=null)
            command.setPatientId(source.getPatients().getId());

        if ((source.getUsers()!=null))
            command.setUserId(source.getUsers().getId());

        return command;
    }
}
