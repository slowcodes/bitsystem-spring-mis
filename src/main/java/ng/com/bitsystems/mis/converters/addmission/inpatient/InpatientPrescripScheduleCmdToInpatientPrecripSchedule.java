package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionScheduleCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionSchedule;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrescripScheduleCmdToInpatientPrecripSchedule
implements Converter<InpatientPrescriptionScheduleCommand, InpatientPrescriptionSchedule> {

    private InpatientPrescripCmdToInpatientPrescrip inpatientPrescripCmdToInpatientPrescrip;

    public InpatientPrescripScheduleCmdToInpatientPrecripSchedule(InpatientPrescripCmdToInpatientPrescrip inpatientPrescripCmdToInpatientPrescrip) {
        this.inpatientPrescripCmdToInpatientPrescrip = inpatientPrescripCmdToInpatientPrescrip;
    }

    @Override
    public InpatientPrescriptionSchedule convert(InpatientPrescriptionScheduleCommand source) {
        if(source==null){
            return null;
        }
        InpatientPrescriptionSchedule inpatientPrescriptionSchedule = new InpatientPrescriptionSchedule();
        inpatientPrescriptionSchedule.setId(source.getId());
        inpatientPrescriptionSchedule.setInpatientPrescriptions(inpatientPrescripCmdToInpatientPrescrip.convert(source.getInpatientPrescriptionCommand()));
        inpatientPrescriptionSchedule.setHourlyInterval(source.getHourlyInterval());
        inpatientPrescriptionSchedule.setNoOfDosage(source.getNoOfDosage());
        inpatientPrescriptionSchedule.setPrescriptionNote(source.getPrescriptionNote());
        inpatientPrescriptionSchedule.setTimeOfSchedule(source.getTimeOfSchedule());
        if(source.getUsers_id()!=null){
            Users users=new Users();
            users.setId(source.getUsers_id());
            inpatientPrescriptionSchedule.setUsers(users);
            Users usr= users.addInpatientPrescriptionSchedule(inpatientPrescriptionSchedule);
        }
        return inpatientPrescriptionSchedule;
    }
}
