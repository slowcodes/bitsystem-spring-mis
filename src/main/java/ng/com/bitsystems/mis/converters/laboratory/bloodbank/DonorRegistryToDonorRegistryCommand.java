package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.DonationRegistryCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonorRegistry;
import org.springframework.core.convert.converter.Converter;

public class DonorRegistryToDonorRegistryCommand implements Converter<DonorRegistry, DonationRegistryCommand> {
    @Override
    public DonationRegistryCommand convert(DonorRegistry source) {
        return null;
    }
}
