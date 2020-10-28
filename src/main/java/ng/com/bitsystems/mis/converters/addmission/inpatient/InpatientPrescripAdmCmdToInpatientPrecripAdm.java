package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionAdministrationCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionAdministration;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrescripAdmCmdToInpatientPrecripAdm implements Converter<InpatientPrescriptionAdministrationCommand, InpatientPrescriptionAdministration> {
    private InpatientPrescripCmdToInpatientPrescrip inpatientPrescripCmdToInpatientPrescrip;

    public InpatientPrescripAdmCmdToInpatientPrecripAdm(InpatientPrescripCmdToInpatientPrescrip inpatientPrescripCmdToInpatientPrescrip) {
        this.inpatientPrescripCmdToInpatientPrescrip = inpatientPrescripCmdToInpatientPrescrip;
    }

    @Override
    public InpatientPrescriptionAdministration convert(InpatientPrescriptionAdministrationCommand source) {
        if(source==null){
            return null;
        }
        InpatientPrescriptionAdministration inpatientPrescriptionAdministration=new InpatientPrescriptionAdministration();
        inpatientPrescriptionAdministration.setId(source.getId());
        inpatientPrescriptionAdministration.setInpatientPrescriptions(inpatientPrescripCmdToInpatientPrescrip.convert(source.getInpatientPrescriptionCommand()));
        inpatientPrescriptionAdministration.setAdministrationTime(source.getAdministrationTime());
        inpatientPrescriptionAdministration.setComment(source.getComment());
        if (source.getUserId()!=null){
            Users users = new Users();
            users.setId(source.getUserId());
            inpatientPrescriptionAdministration.setUsers(users);
            Users usr = users.addInpatientPrescriptionAdministration(inpatientPrescriptionAdministration);
        }

        return inpatientPrescriptionAdministration;
    }
}
