package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.SupplyCommand;
import ng.com.bitsystems.mis.converters.transaction.TransactionToTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.Supplies;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SupplyToSupplyCommand implements Converter<Supplies, SupplyCommand> {
    private TransactionToTransactionCommand transactionToTransactionCommand;

    public SupplyToSupplyCommand(TransactionToTransactionCommand transactionToTransactionCommand) {
        this.transactionToTransactionCommand = transactionToTransactionCommand;
    }
    @Override
    public SupplyCommand convert(Supplies source) {
        if(source==null)
            return null;

        SupplyCommand supplyCommand=new SupplyCommand();
        supplyCommand.setId(source.getId());

        if(source.getSupplier()!=null){
            supplyCommand.setSupplierId(source.getSupplier().getId());
        }

        supplyCommand.setTransactionCommand(transactionToTransactionCommand.convert(source.getTransaction()));
        return supplyCommand;
    }
}
