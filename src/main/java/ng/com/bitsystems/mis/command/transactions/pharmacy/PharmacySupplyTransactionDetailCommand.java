package ng.com.bitsystems.mis.command.transactions.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class PharmacySupplyTransactionDetailCommand {
    private Long id;
    private Double buyingPrice;
    private Integer userDiscount;
    private Integer useDiscountPrice;
    private Date timeOfTransaction;
    private Integer reversal;
    private Long referralId;
    private Long pharmacySupplyTransactionId;
    private Double qty;
    private Long pharmacyProductId;
    private String batchNumber;
    private String comment;
    private LocalDate expiryDate;
    private Set<AdditionalTransactionDetailCommand> additionalTransactionDetailCommands = new HashSet<>();
}
