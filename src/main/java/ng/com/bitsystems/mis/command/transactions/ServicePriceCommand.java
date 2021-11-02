package ng.com.bitsystems.mis.command.transactions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;

@Setter
@Getter
@NoArgsConstructor
public class ServicePriceCommand {
    private Long id;
    private Integer useDiscountPrice;
    private ServicePriceCodeCommand servicePriceCodeCommand;
}
