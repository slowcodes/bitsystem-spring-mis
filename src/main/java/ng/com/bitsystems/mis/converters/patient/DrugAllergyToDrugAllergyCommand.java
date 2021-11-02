package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientDrugAllergyCommand;
import ng.com.bitsystems.mis.models.patients.PatientDrugAllergy;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class DrugAllergyToDrugAllergyCommand implements Converter<PatientDrugAllergy, PatientDrugAllergyCommand> {

    @Nullable
    @Override
    public PatientDrugAllergyCommand convert(PatientDrugAllergy source) {
        if(source==null){
            return null;
        }

        final PatientDrugAllergyCommand patientDrugAllergyCommand=new PatientDrugAllergyCommand();
        patientDrugAllergyCommand.setId(source.getId());

        if (source.getPatients()!=null)
            patientDrugAllergyCommand.setPatientId(source.getPatients().getId());

        if(source.getPharmacyProducts()!=null)
            patientDrugAllergyCommand.setPharmacyProductsId(source.getPharmacyProducts().getId());

        patientDrugAllergyCommand.setToleranceLevel(source.getToleranceLevel());

        return patientDrugAllergyCommand;
    }
}
