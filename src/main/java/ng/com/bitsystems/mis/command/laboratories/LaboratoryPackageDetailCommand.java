package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class LaboratoryPackageDetailCommand {
    private Long id;
    private Long packageId;
    private Set<LaboratoryInvestigationCommand> laboratoryInvestigationCommands;
    private Set<ObservationQueueCommand> observationQueueCommands = new HashSet<>();
    private  Set<SampleCollectionQueueCommand> sampleCollectionQueueCommands = new HashSet<>();
}
