package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;
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
    private Long investigationGroupId;
    private InvestigationType investigationType;
    private Set<PackageCommand> packageCommand= new HashSet<>();
    private Set<ExperimentParametersCommand> experimentParametersCommands = new HashSet<>();
}