package ng.com.bitsystems.mis.converters.transaction.laboratory;

import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;
import org.springframework.core.convert.converter.Converter;

public class LabTxnDetailToLabTxnDetailCommand implements Converter<LaboratoryTransactionDetail, LaboratoryTransactionDetailCommand> {
    @Override
    public LaboratoryTransactionDetailCommand convert(LaboratoryTransactionDetail source) {
        return null;
    }
}
