package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionGeneratedAdministrationCommand;
import ng.com.bitsystems.mis.converters.pharmacy.PharmacyProductToPharmacyProductCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionGeneratedAdministration;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrescripGenAdmToInpatientPrescriptGenAdmCmd implements Converter<InpatientPrescriptionGeneratedAdministration, InpatientPrescriptionGeneratedAdministrationCommand> {
    private PharmacyProductToPharmacyProductCommand pharmacyProductToPharmacyProductCommand;


    @Override
    public InpatientPrescriptionGeneratedAdministrationCommand convert(InpatientPrescriptionGeneratedAdministration source) {
        if(source == null){
            return null;
        }
        InpatientPrescriptionGeneratedAdministrationCommand command = new InpatientPrescriptionGeneratedAdministrationCommand();
        command.setId(source.getId());
        command.setEstimatedAdminTime(source.getExtimatedAdminTime());
        command.setPharmacyProductCommand(pharmacyProductToPharmacyProductCommand.convert(source.getPharmacyProducts()));
        if(source.getSchedule() != null)
            command.setPrescriptionScheduleCommandId(source.getSchedule().getId());

        return command;
    }
}
