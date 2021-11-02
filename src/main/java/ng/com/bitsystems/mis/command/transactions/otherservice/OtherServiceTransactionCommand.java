package ng.com.bitsystems.mis.command.transactions.otherservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.TransactionCommand;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class OtherServiceTransactionCommand {
    private Long id;
    private TransactionCommand transactionCommand;
    private Long patientId;
    private Long referralId;
    private Set<OtherServiceTransactionDetailsCommand> otherServiceTransactionDetailsCommands = new HashSet<>();
}
