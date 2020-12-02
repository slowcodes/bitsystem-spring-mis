package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.PharmacyInvoiceDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.SalesPriceCodeToSalesPriceCodeCommand;
import ng.com.bitsystems.mis.converters.pharmacy.PharmacyProductToPharmacyProductCommand;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.AdditionSaleTnxDetailToAdditionalTxnDetailCommand;
import ng.com.bitsystems.mis.models.invoice.PharmacyInvoiceDetailsSale;
import org.springframework.core.convert.converter.Converter;

public class PharmacyInvoiceDetailToPharmacyInvoiceDetailCommand
implements Converter<PharmacyInvoiceDetailsSale, PharmacyInvoiceDetailCommand> {
    private SalesPriceCodeToSalesPriceCodeCommand salesPriceCodeToSalesPriceCodeCommand;
    private PharmacyProductToPharmacyProductCommand pharmacyProductToPharmacyProductCommand;
    private AdditionSaleTnxDetailToAdditionalTxnDetailCommand additionSaleTnxDetailToAdditionalTxnDetailCommand;

    public PharmacyInvoiceDetailToPharmacyInvoiceDetailCommand(SalesPriceCodeToSalesPriceCodeCommand salesPriceCodeToSalesPriceCodeCommand,
                                                               PharmacyProductToPharmacyProductCommand pharmacyProductToPharmacyProductCommand,
                                                               AdditionSaleTnxDetailToAdditionalTxnDetailCommand additionSaleTnxDetailToAdditionalTxnDetailCommand) {
        this.salesPriceCodeToSalesPriceCodeCommand = salesPriceCodeToSalesPriceCodeCommand;
        this.pharmacyProductToPharmacyProductCommand = pharmacyProductToPharmacyProductCommand;
        this.additionSaleTnxDetailToAdditionalTxnDetailCommand = additionSaleTnxDetailToAdditionalTxnDetailCommand;
    }

    @Override
    public PharmacyInvoiceDetailCommand convert(PharmacyInvoiceDetailsSale source) {
        if(source==null){
            return null;
        }
        PharmacyInvoiceDetailCommand command=new PharmacyInvoiceDetailCommand();

        command.setId(source.getId());
        command.setComment(source.getComment());

        if(source.getAdditionalSaleTransactionDetails().size()>0 && source.getAdditionalSaleTransactionDetails()!=null)
            source.getAdditionalSaleTransactionDetails().forEach(additionalTransactionDetails ->
                    command.getAdditionalSalesTransactionDetailCommands().add(additionSaleTnxDetailToAdditionalTxnDetailCommand.convert(additionalTransactionDetails)));

        command.setDateTransaction(source.getTransactionDate());

        if(source.getInvoice()!=null)
            command.setInvoiceId(source.getInvoice().getId());

        command.setDiscount(source.getUserDiscount());
        command.setPharmacyProductCommand(pharmacyProductToPharmacyProductCommand.convert(source.getPharmacyProducts()));
        command.setStatus(source.getStatus());
        command.setSalesPriceCodeCommand(salesPriceCodeToSalesPriceCodeCommand.convert(source.getSalesPriceCode()));
        command.setTimeOfTransaction(source.getTimeOfTransaction());
        command.setUseDiscountPrice(source.getUserDiscount());

        return command;
    }
}
