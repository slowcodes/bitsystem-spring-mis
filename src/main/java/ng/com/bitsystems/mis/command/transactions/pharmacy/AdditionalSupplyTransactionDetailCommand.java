package ng.com.bitsystems.mis.command.transactions.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class AdditionalSupplyTransactionDetailCommand {
    private Long id;
    private Long pharmSupplyTxnDetailId;
    private Long parameterId;
    private Integer showInReciept;
    private String value;
}
