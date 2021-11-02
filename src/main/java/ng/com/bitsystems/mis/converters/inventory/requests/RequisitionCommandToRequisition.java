package ng.com.bitsystems.mis.converters.inventory.requests;

import ng.com.bitsystems.mis.command.inventory.request.RequisitionCommand;
import ng.com.bitsystems.mis.models.inventory.requests.Requisitions;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;

public class RequisitionCommandToRequisition implements Converter<RequisitionCommand, Requisitions> {
    private RequisitionDetailCommandToRequisitionDetail requisitionDetailCommandToRequisitionDetail;

    public RequisitionCommandToRequisition(RequisitionDetailCommandToRequisitionDetail requisitionDetailCommandToRequisitionDetail) {
        this.requisitionDetailCommandToRequisitionDetail = requisitionDetailCommandToRequisitionDetail;
    }

    @Override
    public Requisitions convert(RequisitionCommand source) {
        if(source==null){
            return null;
        }
        final Requisitions requisitions=new Requisitions();
        requisitions.setId(source.getId());
        if(source.getUsers_id()!=null){
            AppUsers appUsers = new AppUsers();
            appUsers.setId(source.getUsers_id());
            requisitions.setAppUsers(appUsers);
            AppUsers urs = appUsers.addRequisition(requisitions);
        }

        requisitions.setDateOfRequisition(source.getDateOfRequisition());
        if(source.getRequisitionDetailCommands()!=null && source.getRequisitionDetailCommands().size()>0)
            source.getRequisitionDetailCommands().forEach(requisitionDetailCommand -> requisitions.getRequistionDetails().add(requisitionDetailCommandToRequisitionDetail.convert(requisitionDetailCommand)));

        return requisitions;
    }
}
