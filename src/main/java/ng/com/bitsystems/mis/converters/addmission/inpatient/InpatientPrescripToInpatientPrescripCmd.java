package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionCommand;
import ng.com.bitsystems.mis.converters.pharmacy.PharmacyProductToPharmacyProductCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptions;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrescripToInpatientPrescripCmd
implements Converter<InpatientPrescriptions, InpatientPrescriptionCommand> {
    private InpatientPrescripScheduleToInpatientPrecripScheduleCmd inpatientPrescripScheduleToInpatientPrecripScheduleCmd;
    private InpatientPrescripAdmToInpatientPrescripAdmCmd inpatientPrescripAdmToInpatientPrescripAdmCmd;
    private PharmacyProductToPharmacyProductCommand pharmacyProductToPharmacyProductCommand;


    @Override
    public InpatientPrescriptionCommand convert(InpatientPrescriptions source) {
        if(source==null){
            return null;
        }
        InpatientPrescriptionCommand command = new InpatientPrescriptionCommand();
        command.setInpatientId(source.getId());
        if(source.getUsers() !=null ){
            command.setUsersId(source.getUsers().getId());
        }
        if(source.getInpatientAdmission() != null){
            command.setInpatientId(source.getInpatientAdmission().getId());
        }
        command.setAdministrationMode(source.getAdministrationMode());
        command.setDose(source.getDose());
        command.setDuration(source.getDuration());
        command.setForm(source.getForm());
        command.setFrequency(source.getFrequency());
        command.setMeasure(source.getMeasure());

        if(source.getInpatientPrescriptionSchedules() !=null && source.getInpatientPrescriptionSchedules().size()>0){
            source.getInpatientPrescriptionSchedules().forEach(schedules->command.getInpatientPrescriptionScheduleCommands().add(inpatientPrescripScheduleToInpatientPrecripScheduleCmd.convert(schedules)));
        }

        if(source.getInpatientPrescriptionAdministrations() != null && source.getInpatientPrescriptionAdministrations().size()>0){
            source.getInpatientPrescriptionAdministrations().forEach(administration->command.getInpatientPrescriptionAdministrations().add(inpatientPrescripAdmToInpatientPrescripAdmCmd.convert(administration)));
        }

        command.setPharmacyProductCommand(pharmacyProductToPharmacyProductCommand.convert(source.getPharmacyProducts()));
        return command;
    }
}
