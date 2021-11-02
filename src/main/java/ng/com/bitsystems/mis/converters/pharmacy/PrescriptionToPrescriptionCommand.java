package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.PrescriptionCommand;
import ng.com.bitsystems.mis.models.pharmacy.Prescription;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PrescriptionToPrescriptionCommand implements Converter<Prescription, PrescriptionCommand> {
    private PharmacyProductToPharmacyProductCommand pharmacyProductToPharmacyProductCommand;
    private PrescriptionScheduleToPrescriptionScheduleCommand prescriptionScheduleToPrescriptionScheduleCommand;

    public PrescriptionToPrescriptionCommand(PharmacyProductToPharmacyProductCommand pharmacyProductToPharmacyProductCommand,
                                             PrescriptionScheduleToPrescriptionScheduleCommand prescriptionScheduleToPrescriptionScheduleCommand) {
        this.pharmacyProductToPharmacyProductCommand = pharmacyProductToPharmacyProductCommand;
        this.prescriptionScheduleToPrescriptionScheduleCommand = prescriptionScheduleToPrescriptionScheduleCommand;
    }

    @Override
    public PrescriptionCommand convert(Prescription source) {
        if(source==null)
            return null;

        PrescriptionCommand command = new PrescriptionCommand();
        command.setId(source.getId());
        command.setAdministrationMode(source.getAdministrationMode());
        command.setDose(source.getDose());
        command.setDuration(source.getDuration());

        if(source.getAppUsers()!=null)
            command.setUserId(source.getAppUsers().getId());

        command.setFrequency(source.getFrequency());
        command.setForm(source.getForm());
        command.setMeasure(source.getMeasure());

        if (source.getPrescriptionSchedules().size()>0 && source.getPrescriptionSchedules()!=null)
            source.getPrescriptionSchedules().forEach(prescriptionSchedule -> command.getPrescriptionScheduleCommands()
            .add(
                    prescriptionScheduleToPrescriptionScheduleCommand.convert(prescriptionSchedule)
            ));

        command.setPharmacyProductCommand(pharmacyProductToPharmacyProductCommand.convert(source.getPharmacyProducts()));

        return command;
    }
}
