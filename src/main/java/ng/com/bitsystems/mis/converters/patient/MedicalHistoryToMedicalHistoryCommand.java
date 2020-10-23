package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientMedicalHistoryCommand;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalHistory;
import org.springframework.core.convert.converter.Converter;

public class MedicalHistoryToMedicalHistoryCommand implements
        Converter<PatientsMedicalHistory, PatientMedicalHistoryCommand> {
    @Override
    public PatientMedicalHistoryCommand convert(PatientsMedicalHistory source) {
        return null;
    }
}
