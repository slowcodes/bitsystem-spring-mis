package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientDrugAllergyCommand;
import ng.com.bitsystems.mis.models.patients.PatientDrugAllergy;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class DrugAllergyCommandToDrugAllergy implements Converter<PatientDrugAllergyCommand, PatientDrugAllergy> {

    @Nullable
    @Override
    public PatientDrugAllergy convert(PatientDrugAllergyCommand source) {

        if(source==null){
            return null;
        }

        final PatientDrugAllergy patientDrugAllergy = new PatientDrugAllergy();

        if(source.getPatientId()!=null){
            Patients patients=new Patients();
            patients.setId(source.getPatientId());
            patientDrugAllergy.setPatients(patients);
            Patients patient = patients.addDrugAllergy(patientDrugAllergy);
        }

        patientDrugAllergy.setId(source.getId());

        if(source.getPharmacyProductsId()!=null){
            PharmacyProducts pharmacyProducts=new PharmacyProducts();
            pharmacyProducts.setId(source.getPharmacyProductsId());
            patientDrugAllergy.setPharmacyProducts(pharmacyProducts);

        }

        patientDrugAllergy.setToleranceLevel(source.getToleranceLevel());

        return patientDrugAllergy;
    }
}
