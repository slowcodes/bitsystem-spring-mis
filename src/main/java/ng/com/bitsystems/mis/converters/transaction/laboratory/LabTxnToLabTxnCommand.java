package ng.com.bitsystems.mis.converters.transaction.laboratory;

import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import org.springframework.core.convert.converter.Converter;

public class LabTxnToLabTxnCommand implements Converter<LaboratoryTransaction, LaboratoryTransactionCommand> {
    @Override
    public LaboratoryTransactionCommand convert(LaboratoryTransaction source) {
        return null;
    }
}
