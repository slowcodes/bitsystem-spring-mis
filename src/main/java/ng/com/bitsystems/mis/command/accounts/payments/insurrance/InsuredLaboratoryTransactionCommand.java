package ng.com.bitsystems.mis.command.accounts.payments.insurrance;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionCommand;

@Setter
@Getter
@NoArgsConstructor
public class InsuredLaboratoryTransactionCommand {
    private Long id;
    private ProgramsCommand program;
    private Double percentageIncurred;
    private LaboratoryTransactionCommand laboratoryTransactionCommand;
}
