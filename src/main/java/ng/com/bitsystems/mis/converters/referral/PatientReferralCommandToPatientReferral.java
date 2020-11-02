package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.PatientReferralCommand;
import ng.com.bitsystems.mis.converters.patient.PatientCommandToPatient;
import ng.com.bitsystems.mis.models.referrals.PatientsReferrals;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class PatientReferralCommandToPatientReferral
implements Converter<PatientReferralCommand, PatientsReferrals> {
    private PatientCommandToPatient patientCommandToPatient;
    private ReferralCommandToReferral referralCommandToReferral;

    @Nullable
    @Override
    public PatientsReferrals convert(PatientReferralCommand source) {
        if(source==null)
            return null;


        final PatientsReferrals patientsReferrals = new PatientsReferrals();

        patientsReferrals.setPatients(patientsReferrals.getPatients());
        patientsReferrals.setReferrals(patientsReferrals.getReferrals());
        patientsReferrals.setId(source.getId());

        return patientsReferrals;
    }
}
