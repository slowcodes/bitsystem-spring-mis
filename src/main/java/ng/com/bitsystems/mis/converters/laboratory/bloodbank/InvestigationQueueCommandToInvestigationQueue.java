package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.InvestigationQueueCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnDetailCommandToLabTxnDetail;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.InvestigationQueue;
import org.springframework.core.convert.converter.Converter;

public class InvestigationQueueCommandToInvestigationQueue implements Converter<InvestigationQueueCommand, InvestigationQueue> {
    private LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail;
    private BleedingScheduleCommandToBleedingSchedule bleedingScheduleCommandToBleedingSchedule;

    @Override
    public InvestigationQueue convert(InvestigationQueueCommand source) {
        if(source ==null){
            return null;
        }
        InvestigationQueue investigationQueue = new InvestigationQueue();
        investigationQueue.setId(source.getId());
        if(source.getLaboratoryTransactionDetailCommands().size()>0 && source.getLaboratoryTransactionDetailCommands()!=null)
            source.getLaboratoryTransactionDetailCommands().forEach(laboratoryInvestigationCommand ->
                    investigationQueue.getLaboratoryTransactionDetails().add(labTxnDetailCommandToLabTxnDetail.convert(laboratoryInvestigationCommand)));

        investigationQueue.setBleedingSchedule(bleedingScheduleCommandToBleedingSchedule.convert(source.getBleedingScheduleCommand()));

        return investigationQueue;
    }
}
