package ng.com.bitsystems.mis.command.admissions.facilitties;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class FacilityTypeCommand {
    private Long id;
    private String facilityType;
    private Set<FacilitiesCommand> facilitiesCommands = new HashSet<>();
}
