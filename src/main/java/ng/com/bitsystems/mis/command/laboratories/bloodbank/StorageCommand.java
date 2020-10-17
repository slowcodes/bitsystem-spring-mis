package ng.com.bitsystems.mis.command.laboratories.bloodbank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;
import ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank.BloodBankTransactionDetailCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.IssuanceLogs;

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
    private Set<BloodBankTransactionDetailCommand> bloodBankTransactionDetailCommands = new HashSet<>();
    private DonationCommand donationCommand;
    private IssuanceLogs issuanceLogs;
}
