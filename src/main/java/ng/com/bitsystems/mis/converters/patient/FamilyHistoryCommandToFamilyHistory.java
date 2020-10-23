package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.FamilyHistoryCommand;
import ng.com.bitsystems.mis.models.patients.PatientsFamilyHistory;
import org.springframework.core.convert.converter.Converter;

public class FamilyHistoryCommandToFamilyHistory implements Converter<PatientsFamilyHistory, FamilyHistoryCommand> {
    @Override
    public FamilyHistoryCommand convert(PatientsFamilyHistory source) {
        return null;
    }
}
