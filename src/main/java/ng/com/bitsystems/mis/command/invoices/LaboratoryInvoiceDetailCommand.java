package ng.com.bitsystems.mis.command.invoices;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;
import ng.com.bitsystems.mis.command.laboratories.LaboratoryInvestigationCommand;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class LaboratoryInvoiceDetailCommand {
    private Long id;
    private LaboratoryInvestigationCommand laboratoryInvestigationCommand;
    private Long invoiceId;
    private ServicePriceCodeCommand servicePriceCodeCommand;
    private Integer userDiscount;
    private Integer frequency;
    private Integer useDiscountPrice;
    private String comment;
    private Date timeOfTransaction;
    private Integer reversal;
    private Long referralSettlementId;
}
