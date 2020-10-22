package ng.com.bitsystems.mis.command.accounts.payments.insurrance;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank.BloodBankTransactionCommand;

@Setter
@Getter
@NoArgsConstructor
public class InsuredBloodBankTransactionCommand {

    private Long id;
    private Long programCommandId;
    private Double percentageIncurred;
    private BloodBankTransactionCommand bloodBankTransactionCommand;
}
