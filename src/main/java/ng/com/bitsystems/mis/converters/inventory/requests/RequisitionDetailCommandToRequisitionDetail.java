package ng.com.bitsystems.mis.converters.inventory.requests;

import ng.com.bitsystems.mis.command.inventory.request.RequisitionDetailCommand;
import ng.com.bitsystems.mis.models.inventory.requests.RequisitionDetails;
import org.springframework.core.convert.converter.Converter;

public class RequisitionDetailCommandToRequisitionDetail implements Converter<RequisitionDetailCommand, RequisitionDetails> {
    @Override
    public RequisitionDetails convert(RequisitionDetailCommand source) {
        return null;
    }
}
