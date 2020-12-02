package ng.com.bitsystems.mis.command.transactions.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;
import ng.com.bitsystems.mis.command.rewards.promo.PromoProductReceivedLogsCommand;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class PharmacySalesTransactionDetailCommand {
    private Long id;
    private Long pharmacyProductId;
    private SalesPriceCodeCommand salesPriceCodeCommand;
    private Integer userDiscount;
    private Integer useDiscountPrice;
    private String comment;
    private LocalDate timeOfTransaction;
    private Integer reversal;
    private Long referralId;
    private Long pharmacySalesTransactionId;
    private PromoProductReceivedLogsCommand promoProductReceivedLogsCommand;
    private Set<AdditionalSalesTransactionDetailCommand> additionalSalesTransactionDetailCommands = new HashSet<>();
}
