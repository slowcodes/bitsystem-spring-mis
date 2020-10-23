package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.DonationCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Donations;
import org.springframework.core.convert.converter.Converter;

public class DonationCommandToDonation implements Converter<DonationCommand, Donations> {
    @Override
    public Donations convert(DonationCommand source) {
        return null;
    }
}
