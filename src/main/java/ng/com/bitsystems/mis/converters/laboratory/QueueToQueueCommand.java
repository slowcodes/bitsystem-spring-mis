package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.QueueCommand;
import ng.com.bitsystems.mis.models.laboratories.Queue;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class QueueToQueueCommand implements Converter<Queue, QueueCommand> {

//    private LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand;
//
//    public QueueToQueueCommand(LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand) {
//        this.labTxnDetailToLabTxnDetailCommand = labTxnDetailToLabTxnDetailCommand;
//    }

    @Nullable
    @Override
    public QueueCommand convert(Queue source) {

        if(source==null){
            return null;
        }

        final QueueCommand queueCommand = new QueueCommand();

        queueCommand.setId(source.getId());
        queueCommand.setQueueStatus(source.getQueueStatus());
        //queueCommand.setLaboratoryTransactionDetailCommand(labTxnDetailToLabTxnDetailCommand.convert(source.getLaboratoryTransactionDetail()));
//        if(source.getLaboratoryTransactionDetail() != null){
//            queueCommand.setLaboratoryTransactionDetailId(source.getLaboratoryTransactionDetail().getId());
//        }
        queueCommand.setRequestTime(source.getRequestTime());

        return queueCommand;
    }
}
