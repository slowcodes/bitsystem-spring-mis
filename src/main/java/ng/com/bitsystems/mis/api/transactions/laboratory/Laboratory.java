package ng.com.bitsystems.mis.api.transactions.laboratory;

import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionCommand;
import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionDetailCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnDetailCommandToLabTxnDetail;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnDetailToLabTxnDetailCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnToLabTxnCommand;
import ng.com.bitsystems.mis.models.laboratories.QueueStatus;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;
import ng.com.bitsystems.mis.services.transactions.laboratory.LaboaratoryTransactionDetailService;
import ng.com.bitsystems.mis.services.transactions.laboratory.LaboratoryTransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/transactions/laboratory/")
public class Laboratory {
    private LaboratoryTransactionService laboratoryTransactionService;
    private LabTxnToLabTxnCommand labTxnToLabTxnCommand;
    private LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand;
    private LaboaratoryTransactionDetailService laboaratoryTransactionDetailService;
    private LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail;
    private static List<LaboratoryTransactionDetailCommand> laboratoryTransactionDetailCommands = new ArrayList<>();

    public Laboratory(LaboratoryTransactionService laboratoryTransactionService,
                      LabTxnToLabTxnCommand labTxnToLabTxnCommand,
                      LabTxnDetailToLabTxnDetailCommand labTxnDetailToLabTxnDetailCommand,
                      LaboaratoryTransactionDetailService laboaratoryTransactionDetailService,
                      LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail) {
        this.laboratoryTransactionService = laboratoryTransactionService;
        this.labTxnToLabTxnCommand = labTxnToLabTxnCommand;
        this.labTxnDetailToLabTxnDetailCommand = labTxnDetailToLabTxnDetailCommand;
        this.laboaratoryTransactionDetailService = laboaratoryTransactionDetailService;
        this.labTxnDetailCommandToLabTxnDetail = labTxnDetailCommandToLabTxnDetail;
    }


    @PostMapping("/add")
    LaboratoryTransactionCommand addLabTxn(@RequestBody LaboratoryTransactionCommand laboratoryTransactionCommand){
        return labTxnToLabTxnCommand.convert(laboratoryTransactionService.add(laboratoryTransactionCommand));
    }

    @GetMapping("/")
    List<LaboratoryTransactionCommand> allLabTxn(){
        List<LaboratoryTransactionCommand> laboratoryTransactionCommands = new ArrayList<>();
        laboratoryTransactionService.findAll()
                .stream()
                .map(s->laboratoryTransactionCommands.add(labTxnToLabTxnCommand.convert(s)));
        return new ArrayList<>(laboratoryTransactionCommands);
    }

    @GetMapping("/{id}")
    List<LaboratoryTransactionDetailCommand> labDetails(@PathVariable(value = "id") Long labTxnId){
        List<LaboratoryTransactionDetailCommand> response = new ArrayList<>();
        laboaratoryTransactionDetailService.findAll()
                .stream()
                .filter(t -> t.getLaboratoryTransaction().getId()==labTxnId)
                .map(s -> response.add(labTxnDetailToLabTxnDetailCommand.convert(s)));
        return new ArrayList<>(response);
    }

    @PostMapping("/details/add")
    LaboratoryTransactionDetailCommand addDetail(@RequestBody LaboratoryTransactionDetailCommand laboratoryTransactionDetailCommand){
        laboratoryTransactionDetailCommand.getQueueCommand().setQueueStatus(QueueStatus.PENDING);
        LaboratoryTransactionDetail model = labTxnDetailCommandToLabTxnDetail.convert(laboratoryTransactionDetailCommand);
        model = laboaratoryTransactionDetailService.add(model);
        LaboratoryTransactionDetailCommand command = labTxnDetailToLabTxnDetailCommand.convert(model);
        return command;
    }

    @GetMapping("/details/{id}")
    LaboratoryTransactionDetailCommand getLabTxns(@PathVariable(value = "id") Long txnDetailId){
        return labTxnDetailToLabTxnDetailCommand.convert(laboaratoryTransactionDetailService.findByID(txnDetailId));
    }

    @GetMapping("/details/")
    List<LaboratoryTransactionDetailCommand> getLabTxnsDetails(){
        return laboaratoryTransactionDetailService.findAll().stream().map(
                laboratoryTransactionDetail ->
                        labTxnDetailToLabTxnDetailCommand.convert(laboratoryTransactionDetail)).collect(Collectors.toList());
    }
}
