package ng.com.bitsystems.mis.converters.addmission;

import ng.com.bitsystems.mis.command.admissions.DischargeCommand;
import ng.com.bitsystems.mis.models.admissions.Discharged;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DischargeCommandToDischarge implements Converter<DischargeCommand, Discharged> {

    private AdmissionCommandToAdmission admissionCommandToAdmission;

    public DischargeCommandToDischarge(AdmissionCommandToAdmission admissionCommandToAdmission) {
        this.admissionCommandToAdmission = admissionCommandToAdmission;
    }

    @Override
    public Discharged convert(DischargeCommand source) {
        if(source ==null){
            return null;
        }
        Discharged discharged = new Discharged();
        discharged.setId(source.getId());
        discharged.setAdmission(admissionCommandToAdmission.convert(source.getAdmissionCommand()));
        discharged.setComment(source.getComment());
        discharged.setDateDischarged(source.getDateDischarged());
        if(source.getUserId()!=null){
            AppUsers appUsers = new AppUsers();
            appUsers.setId(source.getUserId());
            discharged.setAppUsers(appUsers);
            AppUsers usr = appUsers.addDischarged(discharged);
        }
        return discharged;
    }
}
