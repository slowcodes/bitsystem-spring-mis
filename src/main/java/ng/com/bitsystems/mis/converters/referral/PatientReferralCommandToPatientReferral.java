package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.PatientReferralCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralsReferal;
import org.springframework.core.convert.converter.Converter;

public class PatientReferralCommandToPatientReferral
implements Converter<PatientReferralCommand, ReferralsReferal> {
    @Override
    public ReferralsReferal convert(PatientReferralCommand source) {
        return null;
    }
}
