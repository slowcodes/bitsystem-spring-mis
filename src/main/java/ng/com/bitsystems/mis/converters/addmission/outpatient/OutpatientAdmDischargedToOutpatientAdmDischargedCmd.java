package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientAdmissionDischargedCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmissionDischarged;
import org.springframework.core.convert.converter.Converter;

public class OutpatientAdmDischargedToOutpatientAdmDischargedCmd implements Converter<OutpatientAdmissionDischarged, OutpatientAdmissionDischargedCommand> {

    private OutpatientAdmissionToOutpatientAdmissionCommand outpatientAdmissionToOutpatientAdmissionCommand;

    public OutpatientAdmDischargedToOutpatientAdmDischargedCmd(OutpatientAdmissionToOutpatientAdmissionCommand outpatientAdmissionToOutpatientAdmissionCommand) {
        this.outpatientAdmissionToOutpatientAdmissionCommand = outpatientAdmissionToOutpatientAdmissionCommand;
    }

    @Override
    public OutpatientAdmissionDischargedCommand convert(OutpatientAdmissionDischarged source) {
        if(source==null){
            return null;
        }
        OutpatientAdmissionDischargedCommand outpatientAdmissionDischargedCommand = new OutpatientAdmissionDischargedCommand();
        outpatientAdmissionDischargedCommand.setId(source.getId());
        outpatientAdmissionDischargedCommand.setComment(source.getComment());
        outpatientAdmissionDischargedCommand.setDateDischarged(source.getDateDischarged());
        outpatientAdmissionDischargedCommand.setOutpatientAdmissionCommand(outpatientAdmissionToOutpatientAdmissionCommand.convert(source.getOutpatientAdmission()));
        if(source.getUsers()!=null)
            outpatientAdmissionDischargedCommand.setUserId(source.getUsers().getId());
        return outpatientAdmissionDischargedCommand;
    }
}
