package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientMedicalFileAttachmentCommand;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalFileAttachment;
import org.springframework.core.convert.converter.Converter;

public class FileAttachmentToFileAttachementCommand implements
        Converter<PatientsMedicalFileAttachment, PatientMedicalFileAttachmentCommand> {
    @Override
    public PatientMedicalFileAttachmentCommand convert(PatientsMedicalFileAttachment source) {
        return null;
    }
}
