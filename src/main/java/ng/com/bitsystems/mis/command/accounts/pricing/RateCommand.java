package ng.com.bitsystems.mis.command.accounts.pricing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.pricing.RateTypes;

@Setter
@Getter
@NoArgsConstructor
public class RateCommand {
    private Long id;
    private RateTypes rateTypes;
    private Double cost;
    private String serviceDescription;
    private Double tax;
}
