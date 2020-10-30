package ng.com.bitsystems.mis.command.laboratories.bloodbank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.patients.PatientCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.BloodGroups;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class DonationRegistryCommand {
    private Long id;
    private PatientCommand patient;
    private BloodGroups bloodGroup;
    private Set<DonationCommand> donationCommands = new HashSet<>();
}
