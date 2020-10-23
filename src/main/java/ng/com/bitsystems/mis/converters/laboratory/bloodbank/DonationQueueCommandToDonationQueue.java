package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.DonationQueueCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonationQueue;
import org.springframework.core.convert.converter.Converter;

public class DonationQueueCommandToDonationQueue
implements Converter<DonationQueueCommand, DonationQueue> {
    @Override
    public DonationQueue convert(DonationQueueCommand source) {
        return null;
    }
}
