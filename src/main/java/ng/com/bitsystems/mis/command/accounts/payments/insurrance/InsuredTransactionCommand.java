package ng.com.bitsystems.mis.command.accounts.payments.insurrance;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.TransactionCommand;

@Setter
@Getter
@NoArgsConstructor
public class InsuredTransactionCommand {
    private Long id;
    private ProgramsCommand programsCommand;
    private TransactionCommand transactionCommand;
    private Double percentageIncured;

}
