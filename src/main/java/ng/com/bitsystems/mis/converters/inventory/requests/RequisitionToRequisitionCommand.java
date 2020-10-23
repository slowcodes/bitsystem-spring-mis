package ng.com.bitsystems.mis.converters.inventory.requests;

import ng.com.bitsystems.mis.command.inventory.request.RequisitionCommand;
import ng.com.bitsystems.mis.models.inventory.requests.Requisitions;
import org.springframework.core.convert.converter.Converter;

public class RequisitionToRequisitionCommand implements Converter<Requisitions, RequisitionCommand> {
    @Override
    public RequisitionCommand convert(Requisitions source) {
        return null;
    }
}
