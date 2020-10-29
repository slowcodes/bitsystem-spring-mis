package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientPrescriptionCommand;
import ng.com.bitsystems.mis.converters.pharmacy.PharmacyProductToPharmacyProductCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptions;
import org.springframework.core.convert.converter.Converter;

public class OutpatientPrescriptionToOutpatientPrecriptionCommand implements
        Converter<OutpatientPrescriptions, OutpatientPrescriptionCommand> {

    private PharmacyProductToPharmacyProductCommand pharmacyProductToPharmacyProductCommand;

    public OutpatientPrescriptionToOutpatientPrecriptionCommand(PharmacyProductToPharmacyProductCommand pharmacyProductToPharmacyProductCommand) {
        this.pharmacyProductToPharmacyProductCommand = pharmacyProductToPharmacyProductCommand;
    }

    @Override
    public OutpatientPrescriptionCommand convert(OutpatientPrescriptions source) {
        if(source==null){
            return null;
        }
        OutpatientPrescriptionCommand command = new OutpatientPrescriptionCommand();
        command.setId(source.getId());
        if(source.getUsers()!=null)
            command.setUsersId(source.getUsers().getId());
        command.setDose(source.getDose());
        command.setAdministrationMode(source.getAdministrationMode());
        command.setDuration(source.getDuration());
        command.setForm(source.getForm());
        command.setFrequency(source.getFrequency());
        command.setMeasure(source.getMeasure());
        if(source.getOutpatientAdmission()!=null){
            command.setOutpatientId(source.getOutpatientAdmission().getId());
        }
        command.setPharmacyProductCommand(pharmacyProductToPharmacyProductCommand.convert(source.getPharmacyProducts()));
        return command;
    }
}
