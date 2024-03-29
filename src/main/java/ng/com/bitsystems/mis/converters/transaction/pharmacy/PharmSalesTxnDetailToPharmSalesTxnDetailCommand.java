package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySalesTransactionDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.SalesPriceCodeToSalesPriceCodeCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class PharmSalesTxnDetailToPharmSalesTxnDetailCommand implements Converter<PharmacyTransactionDetails, PharmacySalesTransactionDetailCommand> {
    private AdditionSaleTnxDetailToAdditionalTxnDetailCommand additionSaleTnxDetailToAdditionalTxnDetailCommand;
    private SalesPriceCodeToSalesPriceCodeCommand salesPriceCodeToSalesPriceCodeCommand;

    public PharmSalesTxnDetailToPharmSalesTxnDetailCommand(AdditionSaleTnxDetailToAdditionalTxnDetailCommand additionSaleTnxDetailToAdditionalTxnDetailCommand, SalesPriceCodeToSalesPriceCodeCommand salesPriceCodeToSalesPriceCodeCommand) {
        this.additionSaleTnxDetailToAdditionalTxnDetailCommand = additionSaleTnxDetailToAdditionalTxnDetailCommand;
        this.salesPriceCodeToSalesPriceCodeCommand = salesPriceCodeToSalesPriceCodeCommand;
    }

    @Nullable
    @Override
    public PharmacySalesTransactionDetailCommand convert(PharmacyTransactionDetails source) {

        if(source==null)
            return null;

        final PharmacySalesTransactionDetailCommand command = new PharmacySalesTransactionDetailCommand();
        command.setId(source.getId());

        if(source.getPharmacyProducts()!=null){
            command.setPharmacyProductId(source.getPharmacyProducts().getId());
        }

        if(source.getAdditionalSaleTransactionDetails().size()>0 && source.getAdditionalSaleTransactionDetails()!=null)
            source.getAdditionalSaleTransactionDetails().forEach(additionalTransactionDetail ->
                    command.getAdditionalSalesTransactionDetailCommands().add(
                            additionSaleTnxDetailToAdditionalTxnDetailCommand.convert(
                                    additionalTransactionDetail
                            )
                    ));

        if(source.getPharmacySalesTransaction()!=null){
            command.setPharmacySalesTransactionId(source.getPharmacySalesTransaction().getId());
        }

        command.setComment(source.getComment());
        command.setReversal(source.getReversal());
        command.setSalesPriceCodeCommand(salesPriceCodeToSalesPriceCodeCommand.convert(source.getSalesPriceCode()));
        //command.setTimeOfTransaction(source.getTimeOfTransaction());
        //command.getTimeOfTransaction(source.getTimeOfTransaction());
        command.setUseDiscountPrice(source.getUseDiscountPrice());
        command.setUserDiscount(source.getUserDiscount());


        return command;
    }
}
