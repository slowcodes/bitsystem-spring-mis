package ng.com.bitsystems.mis.converters.inventory.requests;

import ng.com.bitsystems.mis.command.inventory.request.RequisitionDetailCommand;
import ng.com.bitsystems.mis.converters.inventory.InventoryToInventoryCommand;
import ng.com.bitsystems.mis.models.inventory.requests.RequisitionDetails;
import org.springframework.core.convert.converter.Converter;

public class RequisitionDetailToRequisitionDetailCommand implements Converter<RequisitionDetails, RequisitionDetailCommand> {

    private InventoryToInventoryCommand inventoryToInventoryCommand;

    public RequisitionDetailToRequisitionDetailCommand(InventoryToInventoryCommand inventoryToInventoryCommand) {
        this.inventoryToInventoryCommand = inventoryToInventoryCommand;
    }

    @Override
    public RequisitionDetailCommand convert(RequisitionDetails source) {
        if(source==null){
            return null;
        }
        RequisitionDetailCommand requisitionDetailCommand=new RequisitionDetailCommand();
        requisitionDetailCommand.setId(source.getId());
        requisitionDetailCommand.setEstimatedCost(source.getEstimatedCost());
        requisitionDetailCommand.setInventoryCommand(inventoryToInventoryCommand.convert(source.getInventory()));
        requisitionDetailCommand.setReason(source.getReason());
        requisitionDetailCommand.setReqQty(source.getReqQty());
        requisitionDetailCommand.setStatus(source.getStatus());
        if(source.getRequisitions()!=null)
            requisitionDetailCommand.setRequisitionId(source.getRequisitions().getId());
        return requisitionDetailCommand;
    }
}
