package ng.com.bitsystems.mis.command.accounts.payments.insurrance;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySalesTransactionCommand;

@Setter
@Getter
@NoArgsConstructor
public class InsuredPharmacyTransactionCommand {
    private Long id;
    private ProgramsCommand programsCommand;
    private Double percentageIncurred;
    private PharmacySalesTransactionCommand pharmacySalesTransactionCommand;
}
