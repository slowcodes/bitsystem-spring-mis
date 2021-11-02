package ng.com.bitsystems.mis.command.transactions.otherservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.OtherServiceCommand;
import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class OtherServiceTransactionDetailsCommand {
    private Long id;
    private ServicePriceCodeCommand servicePriceCodeCommand;
    private OtherServiceCommand otherServiceCommand;
    private Integer userDiscount;
    private Integer useDiscountPrice;
    private String comment;
    private LocalDateTime timeOfTransaction;
    private Long otherServiceTransactionId;
}
