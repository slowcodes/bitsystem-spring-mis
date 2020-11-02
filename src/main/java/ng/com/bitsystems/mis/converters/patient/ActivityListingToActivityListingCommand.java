package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientMedicalActivityListingCommand;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalActivityListing;
import org.springframework.core.convert.converter.Converter;

public class ActivityListingToActivityListingCommand implements Converter<PatientsMedicalActivityListing,
        PatientMedicalActivityListingCommand> {


    @Override
    public PatientMedicalActivityListingCommand convert(PatientsMedicalActivityListing source) {
        if(source==null)
            return null;

        final PatientMedicalActivityListingCommand command=new PatientMedicalActivityListingCommand();
        command.setId(source.getId());
        command.setMedicalActivity(source.getMedicalActivity());

        return command;
    }
}
