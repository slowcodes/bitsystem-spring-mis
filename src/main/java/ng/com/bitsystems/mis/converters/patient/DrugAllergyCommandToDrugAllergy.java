package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientDrugAllergyCommand;
import ng.com.bitsystems.mis.models.patients.PatientDrugAllergy;
import org.springframework.core.convert.converter.Converter;

public class DrugAllergyCommandToDrugAllergy implements Converter<PatientDrugAllergyCommand, PatientDrugAllergy> {
    @Override
    public PatientDrugAllergy convert(PatientDrugAllergyCommand source) {
        return null;
    }
}
