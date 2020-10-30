package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.InvestigationQueueCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnDetailToLabTxnDetailCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.InvestigationQueue;
import org.springframework.core.convert.converter.Converter;

public class InvestigationQueueToInvestigationQueueCommand implements Converter<InvestigationQueue, InvestigationQueueCommand> {

    private LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand;
    private BleedingScheduleToBleedingScheduleCommand bleedingScheduleToBleedingScheduleCommand;

    public InvestigationQueueToInvestigationQueueCommand(LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand,
                                                         BleedingScheduleToBleedingScheduleCommand bleedingScheduleToBleedingScheduleCommand) {
        this.labTxnDetailToLabTxnDetailCommand = labTxnDetailToLabTxnDetailCommand;
        this.bleedingScheduleToBleedingScheduleCommand = bleedingScheduleToBleedingScheduleCommand;
    }

    @Override
    public InvestigationQueueCommand convert(InvestigationQueue source) {
        if(source==null){
            return null;
        }
        final InvestigationQueueCommand command=new InvestigationQueueCommand();
        command.setId(source.getId());
        if(source.getLaboratoryTransactionDetails().size()>0 && source.getLaboratoryTransactionDetails()!=null)
            source.getLaboratoryTransactionDetails().forEach(laboratoryTransactionDetail ->
                    command.getLaboratoryTransactionDetailCommands().add(labTxnDetailToLabTxnDetailCommand.convert(laboratoryTransactionDetail)));

        command.setBleedingScheduleCommand(bleedingScheduleToBleedingScheduleCommand.convert(source.getBleedingSchedule()));

        return command;
    }
}
