package ng.com.bitsystems.mis.converters.inventory.requests;

import ng.com.bitsystems.mis.command.inventory.request.RequisitionCommand;
import ng.com.bitsystems.mis.models.inventory.requests.Requisitions;
import org.springframework.core.convert.converter.Converter;

public class RequisitionToRequisitionCommand implements Converter<Requisitions, RequisitionCommand> {
    private RequisitionDetailToRequisitionDetailCommand requisitionDetailToRequisitionDetailCommand;

    public RequisitionToRequisitionCommand(RequisitionDetailToRequisitionDetailCommand requisitionDetailToRequisitionDetailCommand) {
        this.requisitionDetailToRequisitionDetailCommand = requisitionDetailToRequisitionDetailCommand;
    }

    @Override
    public RequisitionCommand convert(Requisitions source) {
        if(source==null){
            return null;
        }
        final RequisitionCommand requisitionCommand=new RequisitionCommand();
        requisitionCommand.setId(source.getId());
        requisitionCommand.setDateOfRequisition(source.getDateOfRequisition());
        if(source.getRequistionDetails()!=null && source.getRequistionDetails().size()>0)
            source.getRequistionDetails().forEach(requisitionDetails -> requisitionCommand.getRequisitionDetailCommands().add(requisitionDetailToRequisitionDetailCommand.convert(requisitionDetails)));
        if(source.getUsers()!=null)
            requisitionCommand.setUsers_id(source.getUsers().getId());
        return requisitionCommand;
    }
}
