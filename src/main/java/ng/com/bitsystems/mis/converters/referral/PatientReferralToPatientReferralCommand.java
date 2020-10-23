package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.PatientReferralCommand;
import ng.com.bitsystems.mis.models.referrals.PatientsReferrals;
import org.springframework.core.convert.converter.Converter;

public class PatientReferralToPatientReferralCommand implements Converter<PatientsReferrals, PatientReferralCommand> {
    @Override
    public PatientReferralCommand convert(PatientsReferrals source) {
        return null;
    }
}
