package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.QueueCommand;
import ng.com.bitsystems.mis.models.laboratories.Queue;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class QueueCommandToQueue
implements Converter<QueueCommand, Queue> {

    //private LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail;

//    public QueueCommandToQueue(LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail) {
//        this.labTxnDetailCommandToLabTxnDetail = labTxnDetailCommandToLabTxnDetail;
//    }

    @Nullable
    @Override
    public Queue convert(QueueCommand source) {

        if(source==null)
            return null;

        final Queue queue =new Queue();

        queue.setQueueStatus(source.getQueueStatus());
        queue.setId(source.getId());
        queue.setRequestTime(source.getRequestTime());
//        queue.setLaboratoryTransactionDetail(
//                labTxnDetailCommandToLabTxnDetail.convert(source.getLaboratoryTransactionDetailCommand()
//                ));
//        if(source.getLaboratoryTransactionDetailId()!=null){
//
//            LaboratoryTransactionDetail detail = new LaboratoryTransactionDetail();
//            detail.setId(source.getLaboratoryTransactionDetailId());
//            queue.setLaboratoryTransactionDetail(detail);
//            detail.setQueue(queue);
//        }
        return queue;
    }
}
