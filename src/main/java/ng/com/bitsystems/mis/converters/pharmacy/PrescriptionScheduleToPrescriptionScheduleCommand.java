package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.PrescriptionScheduleCommand;
import ng.com.bitsystems.mis.models.pharmacy.PrescriptionSchedule;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PrescriptionScheduleToPrescriptionScheduleCommand implements
        Converter<PrescriptionSchedule, PrescriptionScheduleCommand> {


    @Override
    public PrescriptionScheduleCommand convert(PrescriptionSchedule source) {
        if(source==null)
            return null;

        PrescriptionScheduleCommand command = new PrescriptionScheduleCommand();
        command.setId(source.getId());
        command.setHourlyInterval(source.getHourlyInterval());
        command.setNoOfDosage(source.getNoOfDosage());

        if(source.getPrescription()!=null)
            command.setPrescriptionId(source.getPrescription().getId());
//        command.setPrescriptionCommand(prescriptionToPrescriptionCommand.convert(source.getPrescription()));

        if(source.getAppUsers()!=null)
            command.setUser_id(source.getAppUsers().getId());

        command.setPrescriptionNote(source.getPrescriptionNote());
        command.setTimeOfSchedule(command.getTimeOfSchedule());

        return command;
    }
}
