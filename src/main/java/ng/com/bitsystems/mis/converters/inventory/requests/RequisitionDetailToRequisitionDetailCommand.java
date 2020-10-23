package ng.com.bitsystems.mis.converters.inventory.requests;

import ng.com.bitsystems.mis.command.inventory.request.RequisitionDetailCommand;
import ng.com.bitsystems.mis.models.inventory.requests.RequisitionDetails;
import org.springframework.core.convert.converter.Converter;

public class RequisitionDetailToRequisitionDetailCommand implements Converter<RequisitionDetails, RequisitionDetailCommand> {

    @Override
    public RequisitionDetailCommand convert(RequisitionDetails source) {
        return null;
    }
}
