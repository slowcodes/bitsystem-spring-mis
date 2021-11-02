package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.PatientReferralCommand;
import ng.com.bitsystems.mis.converters.patient.PatientToPatientCommand;
import ng.com.bitsystems.mis.models.referrals.PatientsReferrals;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PatientReferralToPatientReferralCommand implements Converter<PatientsReferrals,
        PatientReferralCommand> {
    //private ReferralToReferralCommand referralToReferralCommand;
    private PatientToPatientCommand patientToPatientCommand;

    public PatientReferralToPatientReferralCommand(
            //ReferralToReferralCommand referralToReferralCommand,
                                                   PatientToPatientCommand patientToPatientCommand) {
        //this.referralToReferralCommand = referralToReferralCommand;
        this.patientToPatientCommand = patientToPatientCommand;
    }

    @Override
    public PatientReferralCommand convert(PatientsReferrals source) {
        if(source==null)
            return null;


        final PatientReferralCommand referralCommand=new PatientReferralCommand();

        referralCommand.setId(source.getId());
        //referralCommand.setReferrals(referralToReferralCommand.convert(source.getReferrals()));
        referralCommand.setPatientCommand(patientToPatientCommand.convert(source.getPatients()));

        return referralCommand;
    }
}
