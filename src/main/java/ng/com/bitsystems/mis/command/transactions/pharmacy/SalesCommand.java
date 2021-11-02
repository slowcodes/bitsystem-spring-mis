package ng.com.bitsystems.mis.command.transactions.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.TransactionCommand;

@Setter
@Getter
@NoArgsConstructor
public class SalesCommand {
    private Long id;
    private TransactionCommand transactionCommand;
    private Long patientId;
    private Long referralId;

}
