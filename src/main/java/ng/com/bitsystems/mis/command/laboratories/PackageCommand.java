package ng.com.bitsystems.mis.command.laboratories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class PackageCommand {
    private Long id;
    private String packageName;
    private Double discount;
    private String packageDesc;
    private Set<LaboratoryPackageDetailCommand> laboratoryPackageDetailCommand = new HashSet<>();
}
