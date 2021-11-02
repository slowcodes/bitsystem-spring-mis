package ng.com.bitsystems.mis.command.transactions.vaccination;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.TransactionCommand;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class VaccinationTransactionCommand {
    private Long id;
    private TransactionCommand transactionCommand;
    private Long patientId;
    private Long referralId;
    private Set<VaccinationTransactionDetailCommand> vaccinationTransactionDetailCommand = new HashSet<>();
}
