package ng.com.bitsystems.mis.converters.addmission;

import ng.com.bitsystems.mis.command.admissions.DischargeCommand;
import ng.com.bitsystems.mis.models.admissions.Discharged;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DischargeToDischargeCommand
implements Converter<Discharged, DischargeCommand> {

    private AdmissionToAdmissionCommand inpatientAdmToInpatientAdmCmd;

    public DischargeToDischargeCommand(AdmissionToAdmissionCommand inpatientAdmToInpatientAdmCmd) {
        this.inpatientAdmToInpatientAdmCmd = inpatientAdmToInpatientAdmCmd;
    }

    @Override
    public DischargeCommand convert(Discharged source) {
        if(source==null){
            return null;
        }
        DischargeCommand discharge =new DischargeCommand();
        discharge.setId(source.getId());
        discharge.setComment(source.getComment());
        discharge.setDateDischarged(source.getDateDischarged());
        discharge.setAdmissionCommand(inpatientAdmToInpatientAdmCmd.convert(source.getAdmission()));

        if(source.getAppUsers() != null)
            discharge.setUserId(source.getAppUsers().getId());
        return discharge;
    }
}
