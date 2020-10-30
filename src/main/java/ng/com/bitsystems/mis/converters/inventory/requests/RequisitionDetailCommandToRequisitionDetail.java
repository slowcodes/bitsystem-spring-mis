package ng.com.bitsystems.mis.converters.inventory.requests;

import ng.com.bitsystems.mis.command.inventory.request.RequisitionDetailCommand;
import ng.com.bitsystems.mis.converters.inventory.InventoryCommandToInventory;
import ng.com.bitsystems.mis.models.inventory.requests.RequisitionDetails;
import ng.com.bitsystems.mis.models.inventory.requests.Requisitions;
import org.springframework.core.convert.converter.Converter;

public class RequisitionDetailCommandToRequisitionDetail implements Converter<RequisitionDetailCommand, RequisitionDetails> {

    private InventoryCommandToInventory inventoryCommandToInventory;

    public RequisitionDetailCommandToRequisitionDetail(InventoryCommandToInventory inventoryCommandToInventory) {
        this.inventoryCommandToInventory = inventoryCommandToInventory;
    }

    @Override
    public RequisitionDetails convert(RequisitionDetailCommand source) {
        if(source==null){
            return null;
        }

        final RequisitionDetails requisitionDetails = new RequisitionDetails();
        requisitionDetails.setId(source.getId());
        requisitionDetails.setInventory(inventoryCommandToInventory.convert(source.getInventoryCommand()));
        requisitionDetails.setEstimatedCost(source.getEstimatedCost());
        requisitionDetails.setReason(source.getReason());
        requisitionDetails.setReqQty(source.getReqQty());
        if(source.getRequisitionId()!=null){
            Requisitions requisitions =new Requisitions();
            requisitions.setId(source.getRequisitionId());
            requisitionDetails.setRequisitions(requisitions);
            Requisitions requisition = requisitions.addRequisitionDetails(requisitionDetails);
        }
        requisitionDetails.setStatus(source.getStatus());
        return requisitionDetails;
    }
}
