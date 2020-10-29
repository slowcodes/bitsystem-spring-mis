package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.ConsultantCommands;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeToServicePriceCodeCommand;
import ng.com.bitsystems.mis.models.users.Consultants;
import org.springframework.core.convert.converter.Converter;

public class ConsultantToConsultantCommand implements Converter<Consultants, ConsultantCommands> {
    private BookConsultationToBookConsultationCommand bookConsultationToBookConsultationCommand;
    private SpecializationToSpecializationCommand specializationToSpecializationCommand;
    private ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand;


    @Override
    public ConsultantCommands convert(Consultants source) {
        if(source==null){
            return null;
        }
        ConsultantCommands consultantCommands=new ConsultantCommands();
        consultantCommands.setId(source.getId());
        if(source.getBookConsultations()!=null && source.getBookConsultations().size()>0)
            source.getBookConsultations().forEach(bookConsultation -> consultantCommands.getBookConsultations().add(bookConsultationToBookConsultationCommand.convert(bookConsultation)));
        if(source.getSpecializations()!=null && source.getSpecializations().size()>0)
            source.getSpecializations().forEach(specializations -> consultantCommands.getSpecializationCommand().add(specializationToSpecializationCommand.convert(specializations)));
        consultantCommands.setServicePriceCodeCommand(servicePriceCodeToServicePriceCodeCommand.convert(source.getConsultation_fee()));
        consultantCommands.setEmail(source.getEmail());
        consultantCommands.setFirstName(source.getFirstName());
        consultantCommands.setLastName(source.getLastName());
        consultantCommands.setLastLogin(source.getLastLoginDay());
        consultantCommands.setMiddleName(source.getMiddleName());
        consultantCommands.setPhone(source.getPhone());
        consultantCommands.setRegDay(source.getRegDay());
        consultantCommands.setSex(source.getSex());
        consultantCommands.setStatus(source.getStatus());
        return consultantCommands;
    }
}
