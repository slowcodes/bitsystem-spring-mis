package ng.com.bitsystems.mis.command.rewards.promo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromosProducts;

@Setter
@Getter
@NoArgsConstructor
public class PromoProductReceivedLogsCommand {
    private Long id;
    private PharmacyPromosProducts pharmacyPromosProducts;
    private Long pharmacyTransactionDetailsId;
}
