package ng.com.bitsystems.mis.command.transactions.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;
import ng.com.bitsystems.mis.command.pharmacy.PharmacyProductCommand;

import java.time.LocalDate;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class PharmacySupplyTransactionDetailCommand {
    private Long id;
    private SalesPriceCodeCommand salesPriceCodeCommand;
    private Integer userDiscount;
    private Integer useDiscountPrice;
    private Date timeOfTransaction;
    private Integer reversal;
    private Long referralId;
    private Long pharmacySupplyTransactionId;
    private Double qty;
    private PharmacyProductCommand pharmacyProductCommand;
    private String batchNumber;
    private String comment;
    private LocalDate expiryDate;
}
