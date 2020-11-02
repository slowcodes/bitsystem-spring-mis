package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.PharmacyProductCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.SalesPriceCodeCommandToSalesPriceCode;
import ng.com.bitsystems.mis.converters.reward.promo.PromoProductCommandToPromoProduct;
import ng.com.bitsystems.mis.converters.reward.promo.RewardPromoCommandToRewardPromo;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.PharmSalesTxnDetailCommandToPharmSalesTxnDetail;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.PharmSupplyTxnDetailCommandToPharmSupplyTxnDetail;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class PharmacyProductCommandToPharmacyProduct implements Converter<PharmacyProductCommand, PharmacyProducts> {
    private BarcodeCommandToBarcode barcodeCommandToBarcode;
    private CategoryCommandToCategory categoryCommandToCategory;
    private PharmSalesTxnDetailCommandToPharmSalesTxnDetail pharmSalesTxnDetailCommandToPharmSalesTxnDetail;
    private PharmSupplyTxnDetailCommandToPharmSupplyTxnDetail pharmSupplyTxnDetailCommandToPharmSupplyTxnDetail;
    private PromoProductCommandToPromoProduct promoProductCommandToPromoProduct;
    private RetailMeasureCommandToRetailMeasure retailMeasureCommandToRetailMeasure;
    private RewardPromoCommandToRewardPromo rewardPromoCommandToRewardPromo;
    private SupplierCommandToSupplier supplierCommandToSupplier;
    private SalesPriceCodeCommandToSalesPriceCode salesPriceCodeCommandToSalesPriceCode;

    @Nullable
    @Override
    public PharmacyProducts convert(PharmacyProductCommand source) {

        if(source==null){
            return null;
        }

        PharmacyProducts pharmacyProducts = new PharmacyProducts();
        pharmacyProducts.setId(source.getId());

        if(source.getBarcodeCommands().size()>0 && source.getBarcodeCommands()!=null)
            source.getBarcodeCommands().forEach(barcodeCommand ->
                    pharmacyProducts.getBarcodes().add(barcodeCommandToBarcode.convert(barcodeCommand)));

        if(source.getCategoryCommands().size()> 0 && source.getCategoryCommands()!=null)
            source.getCategoryCommands().forEach(categoryCommand ->
                    pharmacyProducts.getCategories().add(categoryCommandToCategory.convert(categoryCommand)));

        if( source.getPharmacySalesTransactionDetailCommands()!=null &&
        source.getPharmacySalesTransactionDetailCommands().size()>0){
            source.getPharmacySalesTransactionDetailCommands().forEach(pharmacySalesTransactionDetailCommand ->
                    pharmacyProducts.getPharmacyTransactions().add(pharmSalesTxnDetailCommandToPharmSalesTxnDetail.convert(
                            pharmacySalesTransactionDetailCommand
                    )));
        }

        if(source.getPharmacySupplyTransactionDetailCommands().size()>0 && source.getPharmacySupplyTransactionDetailCommands()!=null)
            source.getPharmacySupplyTransactionDetailCommands().forEach(pharmacySupplyTransactionDetailCommand ->
                    pharmacyProducts.getTransactionsSupplies().add(
                            pharmSupplyTxnDetailCommandToPharmSupplyTxnDetail.convert(
                                    pharmacySupplyTransactionDetailCommand
                            )
                    ));

//        if(source.getPromoProductCommands().size()>0 && source.getPromoProductCommands()!=null)
//            source.getPromoProductCommands().forEach(promoProductCommand ->
//                    pharmacyProducts.getPharmacyPromosProductses().forEach(
//                            promoProductCommandToPromoProduct.convert(promoProductCommand)
//                    ));
        if(source.getRetailMeasureCommands().size()>0 && source.getRetailMeasureCommands()!=null)
            source.getRetailMeasureCommands().forEach(retailMeasureCommand ->
                    pharmacyProducts.getRetailMeasure().add(
                            retailMeasureCommandToRetailMeasure.convert(retailMeasureCommand)
                    ));

        if(source.getRewardBasedPromoCommands().size()>0 && source.getRewardBasedPromoCommands()!=null)
            source.getRewardBasedPromoCommands().forEach(rewardBasedPromoCommand ->
                    pharmacyProducts.getPharmacyRewardBasedPromos().add(
                            rewardPromoCommandToRewardPromo.convert(rewardBasedPromoCommand)
                    ));

        if(source.getSupplierCommands().size()>0 && source.getSupplierCommands()!=null)
            source.getSupplierCommands().forEach(supplierCommand ->
                    pharmacyProducts.getSuppliers().add(supplierCommandToSupplier.convert(
                            supplierCommand
                    )));

        pharmacyProducts.setId(source.getId());
        pharmacyProducts.setChangePrice(source.getChangePrice());
        pharmacyProducts.setDescription(source.getDescription());
        pharmacyProducts.setImage(source.getImage());
        pharmacyProducts.setProduct(source.getProduct());
        pharmacyProducts.setSalesPriceCode(salesPriceCodeCommandToSalesPriceCode.convert(source.getSalesPriceCodeCommand()));

        return pharmacyProducts;
    }
}
