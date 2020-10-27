package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientDischargeCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientDischarged;
import org.springframework.core.convert.converter.Converter;

public class InpatientDischargedToInpatientDischargedCmd
implements Converter<InpatientDischarged, InpatientDischargeCommand> {

    private InpatientAdmToInpatientAdmCmd inpatientAdmToInpatientAdmCmd;

    public InpatientDischargedToInpatientDischargedCmd(InpatientAdmToInpatientAdmCmd inpatientAdmToInpatientAdmCmd) {
        this.inpatientAdmToInpatientAdmCmd = inpatientAdmToInpatientAdmCmd;
    }

    @Override
    public InpatientDischargeCommand convert(InpatientDischarged source) {
        if(source==null){
            return null;
        }
        InpatientDischargeCommand inpatientDischargeCommand=new InpatientDischargeCommand();
        inpatientDischargeCommand.setId(source.getId());
        inpatientDischargeCommand.setComment(source.getComment());
        inpatientDischargeCommand.setDateDischarged(source.getDateDischarged());
        inpatientDischargeCommand.setInpatientAdmissionCommand(inpatientAdmToInpatientAdmCmd.convert(source.getInpatientAdmission()));
        if(source.getUsers() != null)
            inpatientDischargeCommand.setUserId(source.getUsers().getId());
        return inpatientDischargeCommand;
    }
}
