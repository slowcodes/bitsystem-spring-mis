package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;
import ng.com.bitsystems.mis.command.inventory.InventoryPerLaboratoryTransactionCommand;
import ng.com.bitsystems.mis.command.invoices.LaboratoryInvoiceDetailCommand;
import ng.com.bitsystems.mis.models.laboratories.InvestigationGroups;
import ng.com.bitsystems.mis.models.laboratories.InvestigationType;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class LaboratoryInvestigationCommand {
    private Long id;
    private ServicePriceCodeCommand servicePriceCodeCommand;
    private String title;
    private String desc;
    private Integer estimatedTurnaround;
    private InvestigationGroups investigationGroups;
    private InvestigationType investigationType;
    private Set<InventoryPerLaboratoryTransactionCommand> inventoryPerLaboratoryTransactionCommand = new HashSet<>();
    private Set<LaboratoryPackageDetailCommand> laboratoryPackageDetailCommand= new HashSet<>();
    private Set<ExperimentParametersCommand> experimentParametersCommands = new HashSet<>();
    private Set<LaboratoryInvoiceDetailCommand> laboratoryInvoiceDetailCommands = new HashSet<>();
}
