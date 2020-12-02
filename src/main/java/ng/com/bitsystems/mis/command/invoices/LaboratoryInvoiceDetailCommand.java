package ng.com.bitsystems.mis.command.invoices;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class LaboratoryInvoiceDetailCommand {
    private Long id;
    private Long laboratoryInvestigationId;
    private Long invoiceId;
    private ServicePriceCodeCommand servicePriceCodeCommand;
    private Integer userDiscount;
    private Integer frequency;
    private Integer useDiscountPrice;
    private String comment;
    private LocalDate timeOfTransaction;
    private Integer reversal;
//    private Long referralSettlementId;
}
