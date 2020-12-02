package ng.com.bitsystems.mis.command.invoices;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;
import ng.com.bitsystems.mis.command.pharmacy.PharmacyProductCommand;
import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalSalesTransactionDetailCommand;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class PharmacyInvoiceDetailCommand {
    private Long id;
    private LocalDate dateTransaction;
    private LocalDateTime timeOfTransaction;
    private String comment;
    private Integer discount;
    private Long invoiceId;
    private PharmacyProductCommand pharmacyProductCommand;
    private Integer useDiscountPrice;
    private String status;
    private SalesPriceCodeCommand salesPriceCodeCommand;
    private Set<AdditionalSalesTransactionDetailCommand> additionalSalesTransactionDetailCommands;

}
