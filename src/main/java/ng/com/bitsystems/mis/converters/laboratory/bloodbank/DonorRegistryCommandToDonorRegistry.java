package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.DonationRegistryCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonorRegistry;
import org.springframework.core.convert.converter.Converter;

public class DonorRegistryCommandToDonorRegistry implements Converter<DonationRegistryCommand, DonorRegistry> {
    @Override
    public DonorRegistry convert(DonationRegistryCommand source) {
        return null;
    }
}
