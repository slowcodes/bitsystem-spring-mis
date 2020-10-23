package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.PrescriptionAdministrationCommand;
import ng.com.bitsystems.mis.models.pharmacy.PrescriptionAdministration;
import org.springframework.core.convert.converter.Converter;

public class PrescriptionAdministrationToPrescriptionAdministrationCommand
implements Converter<PrescriptionAdministration, PrescriptionAdministrationCommand> {
    @Override
    public PrescriptionAdministrationCommand convert(PrescriptionAdministration source) {
        return null;
    }
}
