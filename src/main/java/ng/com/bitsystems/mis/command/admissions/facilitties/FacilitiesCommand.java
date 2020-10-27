package ng.com.bitsystems.mis.command.admissions.facilitties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.RateCommand;

@Setter
@Getter
@NoArgsConstructor
public class FacilitiesCommand {
    private Long id;
    private String locationDescription;
    private Long facilityTypeCommandId;
    private Long facilityTypeCategoryCommandId;
    private RateCommand rateCommand;
}
