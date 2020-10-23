package ng.com.bitsystems.mis.converters.inventory.requests;

import ng.com.bitsystems.mis.command.inventory.request.RequisitionCommand;
import ng.com.bitsystems.mis.models.inventory.requests.Requisitions;
import org.springframework.core.convert.converter.Converter;

public class RequisitionCommandToRequisition implements Converter<RequisitionCommand, Requisitions> {
    @Override
    public Requisitions convert(RequisitionCommand source) {
        return null;
    }
}
