package ng.com.bitsystems.mis.converters.transaction;

import ng.com.bitsystems.mis.command.transactions.SalesTransactionCommand;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;
import ng.com.bitsystems.mis.models.transactions.ProductPrice;
import ng.com.bitsystems.mis.models.transactions.Transaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SalesTxnCommandToSalesTxn implements Converter<SalesTransactionCommand, ProductPrice> {
    @Override
    public ProductPrice convert(SalesTransactionCommand source) {

        if(source ==null)
            return null;

        ProductPrice goodsTransaction = new ProductPrice();
        goodsTransaction.setQuantity(source.getQauntity());
        if(source.getTransactionId()!=null){
            Transaction transaction = new Transaction();
            transaction.setId(source.getTransactionId());
            goodsTransaction.setTransaction(transaction);
        }

        if(source.getSalesPriceCodeId()!=null){
            SalesPriceCode salesPriceCode = new SalesPriceCode();
            salesPriceCode.setId(source.getSalesPriceCodeId());
            goodsTransaction.setSalesPriceCode(salesPriceCode);
        }

        return goodsTransaction;
    }
}
