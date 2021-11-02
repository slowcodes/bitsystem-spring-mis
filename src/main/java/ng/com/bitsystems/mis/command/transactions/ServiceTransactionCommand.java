package ng.com.bitsystems.mis.command.transactions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ServiceTransactionCommand {
    private Long id;
    private TransactionCommand transactionCommand;
    private Long referralId;
    private Long patientId;
    private Integer userDiscount;
}
