package ng.com.bitsystems.mis.command.accounts.payments.insurrance;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionCommand;

@Setter
@Getter
@NoArgsConstructor
public class InsuredVaccinationTransactionCommand {
    private Long id;
    private Long programsId;
    private Double percentageIncurred;
    private VaccinationTransactionCommand vaccinationTransactionCommand;
}
