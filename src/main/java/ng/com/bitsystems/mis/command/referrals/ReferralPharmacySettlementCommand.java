package ng.com.bitsystems.mis.command.referrals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySalesTransactionCommand;

@Setter
@Getter
@NoArgsConstructor
public class ReferralPharmacySettlementCommand {
    private Long id;
    private Long referralSettlementsId;
    private PharmacySalesTransactionCommand pharmacySalesTransactionCommand;
}
