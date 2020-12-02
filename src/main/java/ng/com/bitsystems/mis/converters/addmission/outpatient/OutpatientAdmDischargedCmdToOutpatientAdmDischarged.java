package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientAdmissionDischargedCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmissionDischarged;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class OutpatientAdmDischargedCmdToOutpatientAdmDischarged
implements Converter<OutpatientAdmissionDischargedCommand, OutpatientAdmissionDischarged> {
    private OutpatientAdmissionCommandToOutpatientAdmission outpatientAdmissionCommandToOutpatientAdmission;

    @Override
    public OutpatientAdmissionDischarged convert(OutpatientAdmissionDischargedCommand source) {
        if(source==null){
            return null;
        }
        OutpatientAdmissionDischarged outpatient = new OutpatientAdmissionDischarged();
        outpatient.setId(source.getId());
        outpatient.setOutpatientAdmission(outpatientAdmissionCommandToOutpatientAdmission.convert(source.getOutpatientAdmissionCommand()));
        outpatient.setDateDischarged(source.getDateDischarged());
        outpatient.setComment(source.getComment());
        if(source.getUserId()!=null){
            Users usr = new Users();
            usr.setId(source.getUserId());
            outpatient.setUsers(usr);
            Users user =usr.addClosedOutpatientCase(outpatient);
        }
        return outpatient;
    }
}
