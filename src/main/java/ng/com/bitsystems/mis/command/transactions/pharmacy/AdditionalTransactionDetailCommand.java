package ng.com.bitsystems.mis.command.transactions.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class AdditionalTransactionDetailCommand {
    private Long id;
    private PharmacySalesTransactionDetailCommand pharmacySalesTransactionDetailCommand;
    private Integer showInReciept;
    private String value;
}
