package ng.com.bitsystems.mis.command.vaccination;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionDetailCommand;

@Setter
@Getter
@NoArgsConstructor
public class VaccineScheduleCommand {
    private Long id;
    private VaccinationTransactionDetailCommand vaccinationTransactionDetailCommand;
    private Long vaccineId;
}
