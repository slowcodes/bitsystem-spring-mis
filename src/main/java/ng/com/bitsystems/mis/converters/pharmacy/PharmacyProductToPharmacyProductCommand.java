package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.PharmacyProductCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.SalesPriceCodeToSalesPriceCodeCommand;
import ng.com.bitsystems.mis.converters.reward.promo.PromoProductToPromoProductCommand;
import ng.com.bitsystems.mis.converters.reward.promo.RewardPromoToRewardPromoCommand;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.PharmTxnDetailToPharmTxnDetailCommand;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class PharmacyProductToPharmacyProductCommand
implements Converter<PharmacyProducts, PharmacyProductCommand> {

    private BarcodeToBarcodeCommand barcodeToBarcodeCommand;
    private CategoryToCategoryCommand categoryToCategoryCommand;
    private PharmTxnDetailToPharmTxnDetailCommand pharmTxnDetailToPharmTxnDetailCommand;
    private PromoProductToPromoProductCommand promoProductToPromoProductCommand;
    private RetailMeasureToRetailMeasureCommand retailMeasureToRetailMeasureCommand;
    private RewardPromoToRewardPromoCommand rewardPromoToRewardPromoCommand;
    private SupplierToSupplierCommand supplierToSupplierCommand;
    private SalesPriceCodeToSalesPriceCodeCommand salesPriceCodeToSalesPriceCodeCommand;

    public PharmacyProductToPharmacyProductCommand(BarcodeToBarcodeCommand barcodeToBarcodeCommand,
                                                   CategoryToCategoryCommand categoryToCategoryCommand,
                                                   PharmTxnDetailToPharmTxnDetailCommand pharmTxnDetailToPharmTxnDetailCommand,
                                                   PromoProductToPromoProductCommand promoProductToPromoProductCommand,
                                                   RetailMeasureToRetailMeasureCommand retailMeasureToRetailMeasureCommand,
                                                   RewardPromoToRewardPromoCommand rewardPromoToRewardPromoCommand,
                                                   SupplierToSupplierCommand supplierToSupplierCommand, SalesPriceCodeToSalesPriceCodeCommand salesPriceCodeToSalesPriceCodeCommand) {
        this.barcodeToBarcodeCommand = barcodeToBarcodeCommand;
        this.categoryToCategoryCommand = categoryToCategoryCommand;
        this.pharmTxnDetailToPharmTxnDetailCommand = pharmTxnDetailToPharmTxnDetailCommand;
        this.promoProductToPromoProductCommand = promoProductToPromoProductCommand;
        this.retailMeasureToRetailMeasureCommand = retailMeasureToRetailMeasureCommand;
        this.rewardPromoToRewardPromoCommand = rewardPromoToRewardPromoCommand;
        this.supplierToSupplierCommand = supplierToSupplierCommand;
        this.salesPriceCodeToSalesPriceCodeCommand = salesPriceCodeToSalesPriceCodeCommand;
    }

    @Nullable
    @Override
    public PharmacyProductCommand convert(PharmacyProducts source) {
        if (source==null)
            return null;

        PharmacyProductCommand pharmacyProductCommand = new PharmacyProductCommand();
        pharmacyProductCommand.setId(source.getId());
        pharmacyProductCommand.setChangePrice(source.getChangePrice());
        pharmacyProductCommand.setDescription(source.getDescription());
        pharmacyProductCommand.setImage(source.getImage());
        pharmacyProductCommand.setProduct(source.getProduct());
        pharmacyProductCommand.setSalesPriceCodeCommand(salesPriceCodeToSalesPriceCodeCommand.convert(source.getSalesPriceCode()));

        if(source.getSuppliers().size()>0 && source.getSuppliers()!=null)
            source.getSuppliers().forEach(suppliers ->
                    pharmacyProductCommand.getSupplierCommands().add(
                            supplierToSupplierCommand.convert(suppliers)
                    ));

//        if (source.getPharmacyRewardBasedPromos()!=null && source.getPharmacyRewardBasedPromos().size()>0)
//            source.getPharmacyRewardBasedPromos().forEach(pharmacyRewardBasedPromo ->
//                    pharmacyProductCommand.getRewardBasedPromoCommands().add(
//                            rewardPromoToRewardPromoCommand.convert(source.getPharmacyRewardBasedPromos())
//                    ));

        if (source.getRetailMeasure().size()>0 && source.getRetailMeasure()!=null)
            source.getRetailMeasure().forEach(retailMeasure ->
                    pharmacyProductCommand.getRetailMeasureCommands().add(
                            retailMeasureToRetailMeasureCommand.convert(retailMeasure)
                    ));

        if(source.getPharmacyPromosProductses().size()>0 && source.getPharmacyPromosProductses()!= null)
            source.getPharmacyPromosProductses().forEach(pharmacyPromosProducts ->
                    pharmacyProductCommand.getPromoProductCommands().add(
                            promoProductToPromoProductCommand.convert(pharmacyPromosProducts)
                    ));


        if (source.getPharmacyTransactions().size()>0 && source.getPharmacyTransactions()!=null)
            source.getPharmacyTransactions().forEach(pharmacyTransactionDetails ->
                    pharmacyProductCommand.getPharmacyTransactionDetailCommands().add(
                            pharmTxnDetailToPharmTxnDetailCommand.convert(pharmacyTransactionDetails)
                    ));

        if (source.getCategories().size()>0 && source.getCategories()!=null)
            source.getCategories().forEach(category ->
                    pharmacyProductCommand.getCategoryCommands().add(
                            categoryToCategoryCommand.convert(category)
                    ));
        if (source.getBarcodes().size()>0 && source.getBarcodes()!=null)
            source.getBarcodes().forEach(barcodes ->
                    pharmacyProductCommand.getBarcodeCommands().add(
                            barcodeToBarcodeCommand.convert(barcodes)
                    ));

        pharmacyProductCommand.setSalesPriceCodeCommand(salesPriceCodeToSalesPriceCodeCommand.convert(source.getSalesPriceCode()));
        return pharmacyProductCommand;
    }
}
