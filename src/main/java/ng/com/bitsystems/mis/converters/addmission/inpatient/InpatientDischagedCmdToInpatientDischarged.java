package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientDischargeCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientDischarged;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class InpatientDischagedCmdToInpatientDischarged implements Converter<InpatientDischargeCommand, InpatientDischarged> {

    private InpatientAdmCmdToInpatientAdm inpatientAdmCmdToInpatientAdm;

    public InpatientDischagedCmdToInpatientDischarged(InpatientAdmCmdToInpatientAdm inpatientAdmCmdToInpatientAdm) {
        this.inpatientAdmCmdToInpatientAdm = inpatientAdmCmdToInpatientAdm;
    }

    @Override
    public InpatientDischarged convert(InpatientDischargeCommand source) {
        if(source ==null){
            return null;
        }
        InpatientDischarged inpatientDischarged = new InpatientDischarged();
        inpatientDischarged.setId(source.getId());
        inpatientDischarged.setInpatientAdmission(inpatientAdmCmdToInpatientAdm.convert(source.getInpatientAdmissionCommand()));
        inpatientDischarged.setComment(source.getComment());
        inpatientDischarged.setDateDischarged(source.getDateDischarged());
        if(source.getUserId()!=null){
            Users users = new Users();
            users.setId(source.getUserId());
            Users usr = users.addInpatientDischarged(inpatientDischarged);
        }
        return inpatientDischarged;
    }
}
