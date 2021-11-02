package ng.com.bitsystems.mis.command.transactions.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class AdditionalTransactionDetailCommand {
    private Long id;
    private Long pharmSalesTxnDetailId;
    private Long parameterId;
    private Integer showInReciept;
    private String value;
}
