package ng.com.bitsystems.mis.command.laboratories.bloodbank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class StorageCommand {
    private Long id;
    private SalesPriceCodeCommand salesPriceCodeCommand;
    private String location;
    private String description;
    private Set<DonationCommand> donationCommand = new HashSet<>();
    private Set<IssueLogCommand> issuanceLogs = new HashSet<>();
}
