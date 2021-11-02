package ng.com.bitsystems.mis.api.transactions;

import ng.com.bitsystems.mis.command.transactions.TransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.TransactionCommandToTransaction;
import ng.com.bitsystems.mis.converters.transaction.TransactionToTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.Transaction;
import ng.com.bitsystems.mis.services.transactions.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/transactions")
public class Transactions {
    private TransactionService transactionService;
    private TransactionCommandToTransaction transactionCommandToTransaction;
    private TransactionToTransactionCommand transactionToTransactionCommand;

    public Transactions(TransactionService transactionService,
                        TransactionCommandToTransaction transactionCommandToTransaction,
                        TransactionToTransactionCommand transactionToTransactionCommand){
        this.transactionCommandToTransaction = transactionCommandToTransaction;
        this.transactionService = transactionService;
        this.transactionToTransactionCommand =transactionToTransactionCommand;
    }

    @GetMapping("/")
    List<TransactionCommand> getAllTransactions(){
        List<TransactionCommand> transactionCommands = transactionService.findAll().stream().map(
                transaction -> transactionToTransactionCommand.convert(transaction)
        ).collect(Collectors.toList());
        return transactionCommands;
    }

    @PostMapping("/add")
    Transaction addTxn(@RequestBody TransactionCommand transactionCommand){
        transactionCommand.setTimeOfTransaction(LocalDateTime.now());
        transactionCommand.setDateTransaction(LocalDate.now());
        Transaction txn = transactionCommandToTransaction.convert(transactionCommand);
        return transactionService.add(txn);
    }
}
