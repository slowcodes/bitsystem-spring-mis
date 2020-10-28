package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionScheduleCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionSchedule;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrescripScheduleToInpatientPrecripScheduleCmd implements Converter<InpatientPrescriptionSchedule, InpatientPrescriptionScheduleCommand> {
    private InpatientPrescripToInpatientPrescripCmd inpatientPrescripToInpatientPrescripCmd;

    public InpatientPrescripScheduleToInpatientPrecripScheduleCmd(InpatientPrescripToInpatientPrescripCmd inpatientPrescripToInpatientPrescripCmd) {
        this.inpatientPrescripToInpatientPrescripCmd = inpatientPrescripToInpatientPrescripCmd;
    }

    @Override
    public InpatientPrescriptionScheduleCommand convert(InpatientPrescriptionSchedule source) {
        if(source==null){
            return null;
        }
        InpatientPrescriptionScheduleCommand scheduleCommand = new InpatientPrescriptionScheduleCommand();
        scheduleCommand.setId(source.getId());
        scheduleCommand.setHourlyInterval(source.getHourlyInterval());
        scheduleCommand.setInpatientPrescriptionCommand(inpatientPrescripToInpatientPrescripCmd.convert(source.getInpatientPrescriptions()));
        scheduleCommand.setNoOfDosage(source.getNoOfDosage());
        scheduleCommand.setPrescriptionNote(source.getPrescriptionNote());
        if(source.getUsers()!=null){
            scheduleCommand.setUsers_id(source.getUsers().getId());
        }
        return scheduleCommand;
    }
}
