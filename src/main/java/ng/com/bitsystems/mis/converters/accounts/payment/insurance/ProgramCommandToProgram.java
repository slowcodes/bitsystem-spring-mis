package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.ProgramsCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.Programs;
import org.springframework.core.convert.converter.Converter;

public class ProgramCommandToProgram implements Converter<ProgramsCommand, Programs> {
    @Override
    public Programs convert(ProgramsCommand source) {
        return null;
    }
}
