package ng.com.bitsystems.mis.command.referrals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.patients.PatientCommand;

@Setter
@Getter
@NoArgsConstructor
public class PatientReferralCommand {
    private Long id;
    private PatientCommand patientCommand;
    private ReferralCommand referrals;

}
