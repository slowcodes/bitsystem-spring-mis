package ng.com.bitsystems.mis.command.laboratories.bloodbank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationCommand;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class InvestigationQueueCommand {
    private Long id;
    private Set<LaboratoryInvestigationCommand> laboratoryInvestigationCommand = new HashSet<>();
    private DonationQueueCommand donationQueueCommand;
}
