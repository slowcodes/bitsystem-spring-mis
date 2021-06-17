package ng.com.bitsystems.mis.api.payment;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredTransactionCommand;
import ng.com.bitsystems.mis.command.accounts.payments.insurrance.ProgramsCommand;
import ng.com.bitsystems.mis.converters.accounts.payment.insurance.InsuredTransactionCommandToInsuredTransaction;
import ng.com.bitsystems.mis.converters.accounts.payment.insurance.InsuredTransactionToInsuredTransactionCommand;
import ng.com.bitsystems.mis.converters.accounts.payment.insurance.ProgramCommandToProgram;
import ng.com.bitsystems.mis.converters.accounts.payment.insurance.ProgramToProgramCommand;
import ng.com.bitsystems.mis.services.accounts.payments.insurance.InsuredTransactionService;
import ng.com.bitsystems.mis.services.accounts.payments.insurance.ProgramsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/insurance")
public class Insurance {
    private ProgramsService programsService;
    private InsuredTransactionService insuredTransactionService;
    private InsuredTransactionCommandToInsuredTransaction insuredTransactionCommandToInsuredTransaction;
    private InsuredTransactionToInsuredTransactionCommand insuredTransactionToInsuredTransactionCommand;
    private ProgramToProgramCommand programToProgramCommand;
    private ProgramCommandToProgram programCommandToProgram;

    public Insurance(ProgramsService programsService, InsuredTransactionService insuredTransactionService, InsuredTransactionCommandToInsuredTransaction insuredTransactionCommandToInsuredTransaction, InsuredTransactionToInsuredTransactionCommand insuredTransactionToInsuredTransactionCommand, ProgramToProgramCommand programToProgramCommand, ProgramCommandToProgram programCommandToProgram) {
        this.programsService = programsService;
        this.insuredTransactionService = insuredTransactionService;
        this.insuredTransactionCommandToInsuredTransaction = insuredTransactionCommandToInsuredTransaction;
        this.insuredTransactionToInsuredTransactionCommand = insuredTransactionToInsuredTransactionCommand;
        this.programToProgramCommand = programToProgramCommand;
        this.programCommandToProgram = programCommandToProgram;
    }

    @PostMapping("/add")
    InsuredTransactionCommand addLabTxn(@RequestBody InsuredTransactionCommand insuredTransactionCommand ){
        return insuredTransactionToInsuredTransactionCommand.convert(
                insuredTransactionService.add(insuredTransactionCommandToInsuredTransaction.convert(
                        insuredTransactionCommand
                        )
                )
        );
    }

    @GetMapping("/programs")
    List<ProgramsCommand> insurancePrograma(){

        List <ProgramsCommand> programsCommands = programsService.findAll().stream().map(programs -> (
                programToProgramCommand.convert(programs)
        )).collect(Collectors.toList());
        return programsCommands;
    }
}
