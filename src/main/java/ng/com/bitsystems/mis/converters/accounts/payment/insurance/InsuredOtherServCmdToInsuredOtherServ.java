package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredOtherServiceCommand;
import ng.com.bitsystems.mis.converters.accounts.OtherServiceCommandToOtherService;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredOtherServices;
import org.springframework.core.convert.converter.Converter;

public class InsuredOtherServCmdToInsuredOtherServ implements Converter<InsuredOtherServiceCommand, InsuredOtherServices> {

    private ProgramCommandToProgram programCommandToProgram;
    private OtherServiceCommandToOtherService otherServiceCommandToOtherService;

    public InsuredOtherServCmdToInsuredOtherServ(ProgramCommandToProgram programCommandToProgram,
                                                 OtherServiceCommandToOtherService otherServiceCommandToOtherService) {
        this.programCommandToProgram = programCommandToProgram;
        this.otherServiceCommandToOtherService = otherServiceCommandToOtherService;
    }

    @Override
    public InsuredOtherServices convert(InsuredOtherServiceCommand source) {

        if(source==null){
            return null;
        }
        final InsuredOtherServices insuredOtherServices = new InsuredOtherServices();

        insuredOtherServices.setId(source.getId());
        insuredOtherServices.setOtherServices(otherServiceCommandToOtherService.convert(source.getOtherServiceCommand()));
        insuredOtherServices.setPercentageIncured(source.getPercentageIncurred());
        insuredOtherServices.setPrograms(programCommandToProgram.convert(source.getProgramsCommand()));

        return insuredOtherServices;
    }
}
