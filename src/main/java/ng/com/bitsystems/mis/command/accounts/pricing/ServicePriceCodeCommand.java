package ng.com.bitsystems.mis.command.accounts.pricing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ServicePriceCodeCommand {
    private Long id;
    private Double servicePrice;
    private Double discountPrice;
    private Double tax;
}
