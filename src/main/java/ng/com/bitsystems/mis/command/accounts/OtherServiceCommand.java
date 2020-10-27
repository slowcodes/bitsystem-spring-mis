package ng.com.bitsystems.mis.command.accounts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class OtherServiceCommand {
    private Long id;
    private Long expenseBooksId;
    private String description;
    private Long createdById;
    private ServicePriceCodeCommand servicePriceCodeCommand;
    private Integer userDiscount;
    private Integer frequency;
    private Integer useDiscountPrice;
    private String comment;
    private Date timeOfTransaction;
    private Integer reversal;
}
