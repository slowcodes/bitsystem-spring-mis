package ng.com.bitsystems.mis.command.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.SalesPriceCodeCommand;
import ng.com.bitsystems.mis.command.rewards.promo.PromoProductCommand;
import ng.com.bitsystems.mis.command.rewards.promo.RewardBasedPromoCommand;
import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacyTransactionDetailCommand;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class PharmacyProductCommand {
    private Long id;
    private String product;
    private String description;
    private byte[] image;
    private Byte changePrice;
    private SalesPriceCodeCommand salesPriceCodeCommand;

    private Set<RetailMeasureCommand> retailMeasureCommands = new HashSet<>();
    private Set<CategoryCommand> categoryCommands = new HashSet<>();
    private Set<PromoProductCommand> promoProductCommands = new HashSet<>();
    private Set<SupplierCommand> supplierCommands = new HashSet<>();
    private Set<RewardBasedPromoCommand> rewardBasedPromoCommands = new HashSet<>();
    private Set<BarcodeCommand> barcodeCommands = new HashSet<>();
    private Set<PharmacyTransactionDetailCommand> pharmacyTransactionDetailCommands = new HashSet<>();
}
