package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.InvestigationQueueCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.InvestigationQueue;
import org.springframework.core.convert.converter.Converter;

public class InvestigationQueueCommandToInvestigationQueue implements Converter<InvestigationQueueCommand, InvestigationQueue> {
    @Override
    public InvestigationQueue convert(InvestigationQueueCommand source) {
        return null;
    }
}
