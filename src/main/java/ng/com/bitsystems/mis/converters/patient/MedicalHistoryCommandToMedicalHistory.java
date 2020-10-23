package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientMedicalHistoryCommand;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalHistory;
import org.springframework.core.convert.converter.Converter;

public class MedicalHistoryCommandToMedicalHistory implements Converter<PatientMedicalHistoryCommand, PatientsMedicalHistory> {
    @Override
    public PatientsMedicalHistory convert(PatientMedicalHistoryCommand source) {
        return null;
    }
}
