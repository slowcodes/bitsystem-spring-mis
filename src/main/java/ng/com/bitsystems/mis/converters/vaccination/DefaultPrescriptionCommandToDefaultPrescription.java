package ng.com.bitsystems.mis.converters.vaccination;

import ng.com.bitsystems.mis.command.vaccination.DefaultPrescriptionCommand;
import ng.com.bitsystems.mis.models.vaccination.DefaultPrescription;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DefaultPrescriptionCommandToDefaultPrescription implements
        Converter<DefaultPrescriptionCommand, DefaultPrescription> {
    @Override
    public DefaultPrescription convert(DefaultPrescriptionCommand source) {
        return null;
    }
}
