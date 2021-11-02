package ng.com.bitsystems.mis.command.transactions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SalesTransactionCommand {
    private Long id;
    private Long salesPriceCodeId;
    private Integer userDiscount;
    private Integer qauntity;
    private Long transactionId;
}
