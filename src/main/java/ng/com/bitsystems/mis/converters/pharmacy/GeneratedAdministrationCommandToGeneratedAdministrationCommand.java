package ng.com.bitsystems.mis.converters.pharmacy;


import ng.com.bitsystems.mis.command.pharmacy.GeneratedAdministrationCommand;
import ng.com.bitsystems.mis.models.pharmacy.GeneratedAdministration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class GeneratedAdministrationCommandToGeneratedAdministrationCommand implements
        Converter<GeneratedAdministrationCommand, GeneratedAdministration> {
    private PrescriptionCommandToPrescription prescriptionCommandToPrescription;

    public GeneratedAdministrationCommandToGeneratedAdministrationCommand(PrescriptionCommandToPrescription prescriptionCommandToPrescription) {
        this.prescriptionCommandToPrescription = prescriptionCommandToPrescription;
    }

    @Override
    public GeneratedAdministration convert(GeneratedAdministrationCommand source) {

        if(source==null)
            return null;

        GeneratedAdministration administration = new GeneratedAdministration();
        administration.setId(source.getId());
        administration.setPrescription(prescriptionCommandToPrescription.convert(source.getPrescriptionCommand()));
        administration.setExtimatedAdminTime(source.getExtimatedAdminTime());
        //administration.setForm(source.getForm());
        administration.setQuantity(source.getQuantity());
        return administration;

    }
}
