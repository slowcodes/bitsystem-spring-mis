package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientPrescriptionCommand;
import ng.com.bitsystems.mis.converters.pharmacy.PharmacyProductCommandToPharmacyProduct;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmission;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptions;
import ng.com.bitsystems.mis.models.users.Physicians;
import org.springframework.core.convert.converter.Converter;

public class OutpatientPrescriptionCommandToOutpatientPrescription
implements Converter<OutpatientPrescriptionCommand, OutpatientPrescriptions> {

    private PharmacyProductCommandToPharmacyProduct pharmacyProductCommandToPharmacyProduct;

    @Override
    public OutpatientPrescriptions convert(OutpatientPrescriptionCommand source) {
        if(source == null){
            return null;
        }
        OutpatientPrescriptions outpatientPrescriptions = new OutpatientPrescriptions();
        if(source.getOutpatientId() !=null){
            OutpatientAdmission patients = new OutpatientAdmission();
            patients.setId(source.getOutpatientId());
            outpatientPrescriptions.setOutpatientAdmission(patients);
            OutpatientAdmission outpatientAdmission = patients.addOutPatientPrescription(outpatientPrescriptions);
        }
        outpatientPrescriptions.setId(source.getId());
        outpatientPrescriptions.setPharmacyProducts(pharmacyProductCommandToPharmacyProduct.convert(source.getPharmacyProductCommand()));
        outpatientPrescriptions.setAdministrationMode(source.getAdministrationMode());
        outpatientPrescriptions.setDose(source.getDose());
        outpatientPrescriptions.setDuration(source.getDuration());
        outpatientPrescriptions.setForm(source.getForm());
        outpatientPrescriptions.setFrequency(source.getFrequency());
        outpatientPrescriptions.setMeasure(source.getMeasure());

        if(source.getUsersId() !=null){
            Physicians physicians = new Physicians();
            physicians.setId(source.getUsersId());
            outpatientPrescriptions.setUsers(physicians);
            Physicians physicians1 = physicians.addOutPatientPrecription(outpatientPrescriptions);
        }


        return outpatientPrescriptions;
    }
}
