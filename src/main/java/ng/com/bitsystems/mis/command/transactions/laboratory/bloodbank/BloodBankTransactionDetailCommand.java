package ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class BloodBankTransactionDetailCommand {
    private Long id;
    private SalesPriceCodeCommand salesPriceCodeCommand;
    private Integer userDiscount;
    private Integer useDiscountPrice;
    private String comment;
    private LocalDateTime timeOfTransaction;
    private LocalDate dateOfTransaction;
    private Integer reversal;
    private Long storageId;
    private Long bloodBankTransactionId;
}
