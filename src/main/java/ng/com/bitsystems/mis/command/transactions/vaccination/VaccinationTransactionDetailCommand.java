package ng.com.bitsystems.mis.command.transactions.vaccination;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class VaccinationTransactionDetailCommand {
    private Long id;
    private Integer userDiscount;
    private Integer useDiscountPrice;
    private String comment;
    private Date timeOfTransaction;
    private Integer reversal;
    private Long referralId;
    private Long vaccinationTransactionId;
    private Long vaccineId;
    private ServicePriceCodeCommand servicePriceCodeCommand;
}
