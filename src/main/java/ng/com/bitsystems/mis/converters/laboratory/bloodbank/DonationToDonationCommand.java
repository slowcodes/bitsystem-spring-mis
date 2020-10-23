package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.DonationCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Donations;
import org.springframework.core.convert.converter.Converter;

public class DonationToDonationCommand implements Converter<Donations, DonationCommand> {
    @Override
    public DonationCommand convert(Donations source) {
        return null;
    }
}
