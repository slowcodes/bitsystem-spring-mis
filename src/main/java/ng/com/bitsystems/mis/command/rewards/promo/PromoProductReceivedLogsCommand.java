package ng.com.bitsystems.mis.command.rewards.promo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PromoProductReceivedLogsCommand {
    private Long id;
    private Long promoId;
    private Long pharmacyTransactionDetailsId;
}
