package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.ConsultantCommands;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeCommandToServicePriceCode;
import ng.com.bitsystems.mis.models.users.Consultants;
import org.springframework.core.convert.converter.Converter;

public class ConsultantCommandToConsultant implements Converter<ConsultantCommands, Consultants> {
    private SpecializationCommandToSpecialization specializationCommandToSpecialization;
    private BookConsultationCommandToBookConsultation bookConsultationCommandToBookConsultation;
    private ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode;


    @Override
    public Consultants convert(ConsultantCommands source) {
        if(source==null){
            return null;
        }
        Consultants consultants=new Consultants();
        consultants.setId(source.getId());
        if(source.getSpecializationCommand().size()>0 && source.getSpecializationCommand()!=null){
            source.getSpecializationCommand().forEach(specializationCommand -> consultants.getSpecializations().add(specializationCommandToSpecialization.convert(specializationCommand)));
        }
//        if(source.getBookConsultations()!=null && source.getBookConsultations().size()>0)
//            source.getBookConsultations().forEach(bookConsultation -> consultants.getBookConsultations().add(bookConsultationCommandToBookConsultation.convert(bookConsultation)));
        consultants.setConsultation_fee(servicePriceCodeCommandToServicePriceCode.convert(source.getConsultation_fee()));
        consultants.setEmail(source.getEmail());
        consultants.setFirstName(source.getFirstName());
        consultants.setLastLoginDay(source.getLastLogin());
        consultants.setLastName(source.getLastName());
        consultants.setMiddleName(source.getMiddleName());
        consultants.setPhone(source.getPhone());
        consultants.setRegDay(source.getRegDay());
        consultants.setSex(source.getSex());
        consultants.setStatus(source.getStatus());
        return consultants;
    }
}
