package ng.com.bitsystems.mis.command.transactions.laboratory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;
import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationCommand;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor

public class LaboratoryTransactionDetailCommand {
    private Long id;
    private LaboratoryInvestigationCommand laboratoryInvestigationCommand;
    private Long laboratoryTransactionId;
    private SalesPriceCodeCommand salesPriceCodeCommand;
    private Integer userDiscount;
    private Integer useDiscountPrice;
    private String comment;
    private Date timeOfTransaction;
    private Integer reversal;
    private Long referralId;
}
