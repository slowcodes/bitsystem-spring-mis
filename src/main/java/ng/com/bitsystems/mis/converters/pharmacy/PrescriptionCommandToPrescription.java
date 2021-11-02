package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.PrescriptionCommand;
import ng.com.bitsystems.mis.models.pharmacy.Prescription;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PrescriptionCommandToPrescription implements Converter<PrescriptionCommand, Prescription> {
    private PharmacyProductCommandToPharmacyProduct pharmacyProductCommandToPharmacyProduct;
    private PrescriptionScheduleCommandToPrescriptionSchedule prescriptionScheduleCommandToPrescriptionSchedule;

    public PrescriptionCommandToPrescription(PharmacyProductCommandToPharmacyProduct pharmacyProductCommandToPharmacyProduct,
                                             PrescriptionScheduleCommandToPrescriptionSchedule prescriptionScheduleCommandToPrescriptionSchedule) {
        this.pharmacyProductCommandToPharmacyProduct = pharmacyProductCommandToPharmacyProduct;
        this.prescriptionScheduleCommandToPrescriptionSchedule = prescriptionScheduleCommandToPrescriptionSchedule;
    }

    @Override
    public Prescription convert(PrescriptionCommand source) {
        if(source==null)
            return null;

        Prescription prescription = new Prescription();
        prescription.setId(source.getId());
        prescription.setAdministrationMode(source.getAdministrationMode());
        prescription.setDose(source.getDose());
        prescription.setDuration(source.getDuration());

        if(source.getUserId()!=null){
            AppUsers appUsers = new AppUsers();
            appUsers.setId(source.getUserId());
            prescription.setAppUsers(appUsers);
            AppUsers users = appUsers.addPrescription(prescription);
        }

        prescription.setForm(source.getForm());
        prescription.setFrequency(source.getFrequency());
        prescription.setPharmacyProducts(pharmacyProductCommandToPharmacyProduct.convert(source.getPharmacyProductCommand()));
        prescription.setMeasure(source.getMeasure());

        if(source.getPrescriptionScheduleCommands().size()>0 && source.getPrescriptionScheduleCommands()!=null){
            source.getPrescriptionScheduleCommands().forEach(prescriptionScheduleCommand ->
                    prescription.getPrescriptionSchedules().add(
                            prescriptionScheduleCommandToPrescriptionSchedule.convert(prescriptionScheduleCommand)
                    ));
        }

        return prescription;
    }
}
