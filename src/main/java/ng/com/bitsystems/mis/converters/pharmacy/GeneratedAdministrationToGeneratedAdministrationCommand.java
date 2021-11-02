package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.GeneratedAdministrationCommand;
import ng.com.bitsystems.mis.models.pharmacy.GeneratedAdministration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class GeneratedAdministrationToGeneratedAdministrationCommand implements
        Converter<GeneratedAdministration, GeneratedAdministrationCommand> {

    private PrescriptionToPrescriptionCommand prescriptionCommandToPrescription;

    public GeneratedAdministrationToGeneratedAdministrationCommand(PrescriptionToPrescriptionCommand prescriptionCommandToPrescription) {
        this.prescriptionCommandToPrescription = prescriptionCommandToPrescription;
    }

    @Override
    public GeneratedAdministrationCommand convert(GeneratedAdministration source) {
        if(source==null)
            return null;

        GeneratedAdministrationCommand command= new GeneratedAdministrationCommand();

        command.setId(source.getId());
        command.setExtimatedAdminTime(source.getExtimatedAdminTime());
        command.setPrescriptionCommand(prescriptionCommandToPrescription.convert(source.getPrescription()));
        command.setQuantity(source.getQuantity());

        return command;
    }
}
