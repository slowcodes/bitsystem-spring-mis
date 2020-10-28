package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionCommand;
import ng.com.bitsystems.mis.converters.pharmacy.PharmacyProductCommandToPharmacyProduct;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientAdmission;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptions;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrescripCmdToInpatientPrescrip implements Converter<InpatientPrescriptionCommand, InpatientPrescriptions> {

    private InpatientPrescripAdmCmdToInpatientPrecripAdm inpatientPrescripAdmCmdToInpatientPrecripAdm;
    private InpatientPrescripScheduleCmdToInpatientPrecripSchedule inpatientPrescripScheduleCmdToInpatientPrecripSchedule;
    private PharmacyProductCommandToPharmacyProduct pharmacyProductCommandToPharmacyProduct;

    public InpatientPrescripCmdToInpatientPrescrip(InpatientPrescripAdmCmdToInpatientPrecripAdm inpatientPrescripAdmCmdToInpatientPrecripAdm,
                                                   InpatientPrescripScheduleCmdToInpatientPrecripSchedule inpatientPrescripScheduleCmdToInpatientPrecripSchedule,
                                                   PharmacyProductCommandToPharmacyProduct pharmacyProductCommandToPharmacyProduct) {
        this.inpatientPrescripAdmCmdToInpatientPrecripAdm = inpatientPrescripAdmCmdToInpatientPrecripAdm;
        this.inpatientPrescripScheduleCmdToInpatientPrecripSchedule = inpatientPrescripScheduleCmdToInpatientPrecripSchedule;
        this.pharmacyProductCommandToPharmacyProduct = pharmacyProductCommandToPharmacyProduct;
    }

    @Override
    public InpatientPrescriptions convert(InpatientPrescriptionCommand source) {
        if(source==null){
            return null;
        }
        final InpatientPrescriptions inpatientPrescriptions = new InpatientPrescriptions();
        inpatientPrescriptions.setId(source.getId());

        if(source.getInpatientPrescriptionAdministrations().size()>0 && source.getInpatientPrescriptionAdministrations() != null){
            source.getInpatientPrescriptionAdministrations().
                    forEach(administration->inpatientPrescriptions.getInpatientPrescriptionAdministrations().add(inpatientPrescripAdmCmdToInpatientPrecripAdm.convert(administration)));
        }
        if(source.getInpatientPrescriptionScheduleCommands().size()>0 && source.getInpatientPrescriptionScheduleCommands() !=null){
            source.getInpatientPrescriptionScheduleCommands()
                    .forEach(scheduleCommand ->
                            inpatientPrescriptions.getInpatientPrescriptionSchedules()
                                    .add(inpatientPrescripScheduleCmdToInpatientPrecripSchedule.convert(scheduleCommand)));
        }

        if(source.getInpatientId()!=null){
            InpatientAdmission inpatientAdmission = new InpatientAdmission();
            inpatientAdmission.setId(source.getInpatientId());
            inpatientPrescriptions.setInpatientAdmission(inpatientAdmission);
            InpatientAdmission inpatientAdmission1 = inpatientAdmission.addInpatientPrescription(inpatientPrescriptions);
        }

        inpatientPrescriptions.setPharmacyProducts(pharmacyProductCommandToPharmacyProduct.convert(source.getPharmacyProductCommand()));
        inpatientPrescriptions.setAdministrationMode(source.getAdministrationMode());
        inpatientPrescriptions.setDose(source.getDose());
        inpatientPrescriptions.setDuration(source.getDuration());
        inpatientPrescriptions.setForm(source.getForm());
        inpatientPrescriptions.setFrequency(source.getFrequency());
        inpatientPrescriptions.setMeasure(source.getMeasure());

        if(source.getUsersId() !=null){
            Users users = new Users();
            users.setId(source.getUsersId());
            inpatientPrescriptions.setUsers(users);
            Users usr = users.addInpatientPrescription(inpatientPrescriptions);
        }

        return inpatientPrescriptions;
    }
}
