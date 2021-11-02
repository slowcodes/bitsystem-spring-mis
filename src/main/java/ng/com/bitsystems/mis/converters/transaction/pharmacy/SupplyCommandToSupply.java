package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.SupplyCommand;
import ng.com.bitsystems.mis.converters.transaction.TransactionCommandToTransaction;
import ng.com.bitsystems.mis.models.pharmacy.Suppliers;
import ng.com.bitsystems.mis.models.transactions.Supplies;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SupplyCommandToSupply implements Converter<SupplyCommand, Supplies> {
    private TransactionCommandToTransaction transactionCommandToTransaction;

    public SupplyCommandToSupply(TransactionCommandToTransaction transactionCommandToTransaction) {
        this.transactionCommandToTransaction = transactionCommandToTransaction;
    }

    @Override
    public Supplies convert(SupplyCommand source) {

        if(source ==null)
            return null;

        Supplies supplies = new Supplies();
        supplies.setId(source.getId());
        supplies.setTransaction(transactionCommandToTransaction.convert(source.getTransactionCommand()));

        if(source.getSupplierId() != null){
            Suppliers suppliers = new Suppliers();
            suppliers.setId(source.getSupplierId());
            supplies.setSupplier(suppliers);
            Suppliers supplier = suppliers.addSupply(supplies);
        }
        return supplies;
    }
}
