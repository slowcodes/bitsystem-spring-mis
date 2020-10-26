package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredOtherServiceCommand;
import ng.com.bitsystems.mis.converters.accounts.OtherServiceToOtherServiceCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredOtherServices;
import org.springframework.core.convert.converter.Converter;

public class InsuredOtherServToInsuredOtherServCmd implements Converter<InsuredOtherServices, InsuredOtherServiceCommand> {

    private ProgramToProgramCommand programToProgramCommand;
    private OtherServiceToOtherServiceCommand otherServiceToOtherServiceCommand;

    public InsuredOtherServToInsuredOtherServCmd(ProgramToProgramCommand programToProgramCommand,
                                                 OtherServiceToOtherServiceCommand otherServiceToOtherServiceCommand) {
        this.programToProgramCommand = programToProgramCommand;
        this.otherServiceToOtherServiceCommand = otherServiceToOtherServiceCommand;
    }

    @Override
    public InsuredOtherServiceCommand convert(InsuredOtherServices source) {
        if(source==null){
            return null;
        }
        final InsuredOtherServiceCommand insuredOtherServiceCommand = new InsuredOtherServiceCommand();

        insuredOtherServiceCommand.setId(insuredOtherServiceCommand.getId());
        insuredOtherServiceCommand.setOtherServiceCommand(otherServiceToOtherServiceCommand.convert(source.getOtherServices()));
        insuredOtherServiceCommand.setPercentageIncurred(source.getPercentageIncured());
        insuredOtherServiceCommand.setProgramsCommand(programToProgramCommand.convert(source.getPrograms()));

        return insuredOtherServiceCommand;
    }
}
