package ng.com.bitsystems.mis.converters.transaction;

import ng.com.bitsystems.mis.command.transactions.SalesTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.ProductPrice;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SalesTxnToSalesTxnCommand implements Converter<ProductPrice, SalesTransactionCommand> {
    @Override
    public SalesTransactionCommand convert(ProductPrice source) {
        if(source==null)
            return null;

        SalesTransactionCommand salesTransactionCommand = new SalesTransactionCommand();
        salesTransactionCommand.setId(source.getId());
        salesTransactionCommand.setQauntity(source.getQuantity());
        salesTransactionCommand.setSalesPriceCodeId(source.getSalesPriceCode().getId());
        salesTransactionCommand.setTransactionId(source.getTransaction().getId());
        return salesTransactionCommand;
    }
}
