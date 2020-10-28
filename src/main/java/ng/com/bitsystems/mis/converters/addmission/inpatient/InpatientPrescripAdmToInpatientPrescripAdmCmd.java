package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionAdministrationCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionAdministration;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrescripAdmToInpatientPrescripAdmCmd implements Converter<InpatientPrescriptionAdministration, InpatientPrescriptionAdministrationCommand> {

    private InpatientPrescripToInpatientPrescripCmd inpatientPrescripToInpatientPrescripCmd;

    public InpatientPrescripAdmToInpatientPrescripAdmCmd(InpatientPrescripToInpatientPrescripCmd inpatientPrescripToInpatientPrescripCmd) {
        this.inpatientPrescripToInpatientPrescripCmd = inpatientPrescripToInpatientPrescripCmd;
    }

    @Override
    public InpatientPrescriptionAdministrationCommand convert(InpatientPrescriptionAdministration source) {


        if (source==null){
            return null;
        }
        InpatientPrescriptionAdministrationCommand inpatientPrescriptionAdministrationCommand =new InpatientPrescriptionAdministrationCommand();
        inpatientPrescriptionAdministrationCommand.setId(source.getId());
        inpatientPrescriptionAdministrationCommand.setInpatientPrescriptionCommand(inpatientPrescripToInpatientPrescripCmd.convert(source.getInpatientPrescriptions()));
        if(source.getUsers()!=null){
            inpatientPrescriptionAdministrationCommand.setUserId(source.getUsers().getId());
        }
        inpatientPrescriptionAdministrationCommand.setComment(source.getComment());
        return inpatientPrescriptionAdministrationCommand;
    }
}
