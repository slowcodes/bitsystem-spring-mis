package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.ProgramsCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.Programs;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProgramToProgramCommand implements Converter<Programs, ProgramsCommand> {
    @Override
    public ProgramsCommand convert(Programs source) {

        if(source==null) {
            return null;
        }
        final ProgramsCommand programsCommand = new ProgramsCommand();

        programsCommand.setId(source.getId());
        programsCommand.setCompanyEmail(source.getCompanyEmail());
        programsCommand.setCompanyPhone(source.getCompanyPhone());
        programsCommand.setInsuranceCompany(source.getInsuranceCompany());
        programsCommand.setServiceDiscount(source.getServiceDiscount());

        return programsCommand;
    }
}
