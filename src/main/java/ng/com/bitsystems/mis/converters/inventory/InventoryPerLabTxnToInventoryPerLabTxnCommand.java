package ng.com.bitsystems.mis.converters.inventory;

import ng.com.bitsystems.mis.command.inventory.InventoryPerLaboratoryTransactionCommand;
import ng.com.bitsystems.mis.models.inventory.InventoryPerLaboratoryTransaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class InventoryPerLabTxnToInventoryPerLabTxnCommand
implements Converter<InventoryPerLaboratoryTransaction, InventoryPerLaboratoryTransactionCommand> {
    @Override
    public InventoryPerLaboratoryTransactionCommand convert(InventoryPerLaboratoryTransaction source) {
        if(source==null){
            return null;
        }
        final InventoryPerLaboratoryTransactionCommand transactionCommand=new InventoryPerLaboratoryTransactionCommand();
        transactionCommand.setId(transactionCommand.getId());
        if(source.getInventory() !=null){
            transactionCommand.setInventoryId(source.getInventory().getId());
        }

        if(source.getInvestigations() !=null){
            transactionCommand.setLaboratoryInvestigationsId(source.getInvestigations().getId());
        }
        return transactionCommand;
    }
}
