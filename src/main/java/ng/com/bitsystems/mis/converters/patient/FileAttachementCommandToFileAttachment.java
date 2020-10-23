package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientMedicalFileAttachmentCommand;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalFileAttachment;
import org.springframework.core.convert.converter.Converter;

public class FileAttachementCommandToFileAttachment implements Converter<PatientMedicalFileAttachmentCommand, PatientsMedicalFileAttachment> {
    @Override
    public PatientsMedicalFileAttachment convert(PatientMedicalFileAttachmentCommand source) {
        return null;
    }
}
