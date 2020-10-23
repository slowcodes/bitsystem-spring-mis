package ng.com.bitsystems.mis.command.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class GeneratedAdministrationCommand {
    private Long id;
    private PharmacyProductCommand pharmacyProductCommand;
    private Integer extimatedAdminTime;
}
