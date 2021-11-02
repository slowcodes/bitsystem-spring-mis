package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.PrescriptionScheduleCommand;
import ng.com.bitsystems.mis.models.pharmacy.Prescription;
import ng.com.bitsystems.mis.models.pharmacy.PrescriptionSchedule;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PrescriptionScheduleCommandToPrescriptionSchedule implements
        Converter<PrescriptionScheduleCommand, PrescriptionSchedule> {



    @Override
    public PrescriptionSchedule convert(PrescriptionScheduleCommand source) {
        if(source==null)
            return null;

        final PrescriptionSchedule prescriptionSchedule = new PrescriptionSchedule();
        prescriptionSchedule.setId(source.getId());
        prescriptionSchedule.setHourlyInterval(source.getHourlyInterval());

        if(source.getUser_id()!= null){
            AppUsers appUsers = new AppUsers();
            appUsers.setId(source.getUser_id());
            prescriptionSchedule.setAppUsers(appUsers);
            AppUsers users = appUsers.addPrescriptionSchedule(prescriptionSchedule);
        }
        prescriptionSchedule.setNoOfDosage(source.getNoOfDosage());
        prescriptionSchedule.setPrescriptionNote(source.getPrescriptionNote());
        prescriptionSchedule.setTimeOfSchedule(source.getTimeOfSchedule());
//        prescriptionSchedule.setPrescription(prescriptionCommandToPrescription.convert(source.getPrescriptionCommand()));

        if(source.getPrescriptionId()!=null){
            Prescription prescription = new Prescription();
            prescription.setId(source.getPrescriptionId());
            prescriptionSchedule.setPrescription(prescription);
            Prescription psc = prescription.addSchedule(prescriptionSchedule);
        }

        return prescriptionSchedule;
    }
}
