package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientMedicalActivityListingCommand;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalActivityListing;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ActivityListingCommandToActivityListing
implements Converter<PatientMedicalActivityListingCommand, PatientsMedicalActivityListing> {

    private ActivityListingCommandToActivityListing activityListingCommandToActivityListing;

    public ActivityListingCommandToActivityListing(ActivityListingCommandToActivityListing activityListingCommandToActivityListing) {
        this.activityListingCommandToActivityListing = activityListingCommandToActivityListing;
    }

    @Nullable
    @Override
    public PatientsMedicalActivityListing convert(PatientMedicalActivityListingCommand source) {
        if(source==null)
            return null;

        final PatientsMedicalActivityListing patientsMedicalActivityListing =new PatientsMedicalActivityListing();

        patientsMedicalActivityListing.setId(source.getId());
        patientsMedicalActivityListing.setMedicalActivity(source.getMedicalActivity());
        return patientsMedicalActivityListing;
    }
}
