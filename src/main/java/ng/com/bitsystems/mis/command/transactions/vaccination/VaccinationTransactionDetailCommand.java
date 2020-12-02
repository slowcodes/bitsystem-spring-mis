package ng.com.bitsystems.mis.command.transactions.vaccination;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class VaccinationTransactionDetailCommand {
    private Long id;
    private Integer userDiscount;
    private Integer useDiscountPrice;
    private String comment;
    private LocalDate timeOfTransaction;
    private Integer reversal;
    private Long referralId;
    private Long vaccinationTransactionId;
    private Long vaccineId;
    private ServicePriceCodeCommand servicePriceCodeCommand;
}
