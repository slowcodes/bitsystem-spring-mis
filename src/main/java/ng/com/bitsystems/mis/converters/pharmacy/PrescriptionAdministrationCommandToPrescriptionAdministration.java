package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.PrescriptionAdministrationCommand;
import ng.com.bitsystems.mis.models.pharmacy.PrescriptionAdministration;
import org.springframework.core.convert.converter.Converter;

public class PrescriptionAdministrationCommandToPrescriptionAdministration
implements Converter<PrescriptionAdministrationCommand, PrescriptionAdministration> {
    @Override
    public PrescriptionAdministration convert(PrescriptionAdministrationCommand source) {
        return null;
    }
}
