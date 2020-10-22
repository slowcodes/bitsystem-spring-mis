package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.ProgramsCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.Programs;
import org.springframework.core.convert.converter.Converter;

public class ProgramToProgramCommand implements Converter<Programs, ProgramsCommand> {
    @Override
    public ProgramsCommand convert(Programs source) {
        return null;
    }
}
