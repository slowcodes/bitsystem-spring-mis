package ng.com.bitsystems.mis.command.transactions.laboratory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationCommand;
import ng.com.bitsystems.mis.command.laboratories.PackageCommand;
import ng.com.bitsystems.mis.command.laboratories.QueueCommand;
import ng.com.bitsystems.mis.command.transactions.ServicePriceCommand;

@Setter
@Getter
@NoArgsConstructor
public class LaboratoryTransactionDetailCommand {
    private Long id;
    private LaboratoryInvestigationCommand laboratoryInvestigationCommand;
    private Long laboratoryTransactionId;
    private ServicePriceCommand servicePriceCommand;
    private PackageCommand packageCommand;
    private QueueCommand queueCommand;
}
