package ng.com.bitsystems.mis.api.transactions;

import ng.com.bitsystems.mis.command.transactions.ServicePriceCommand;
import ng.com.bitsystems.mis.command.transactions.ServiceTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.ServicePriceToServicePriceCommand;
import ng.com.bitsystems.mis.converters.transaction.ServiceTxnCommandToServiceTxn;
import ng.com.bitsystems.mis.converters.transaction.ServiceTxnToServiceTxnCommand;
import ng.com.bitsystems.mis.services.transactions.ServicePriceService;
import ng.com.bitsystems.mis.services.transactions.ServiceTransactionService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/transactions/services")
public class ServiceTransactions {
    private ServiceTransactionService serviceTransactionService;
    private ServiceTxnCommandToServiceTxn serviceTxnCommandToServiceTxn;
    private ServiceTxnToServiceTxnCommand serviceTxnToServiceTxnCommand;
    private ServicePriceToServicePriceCommand servicePriceToServicePriceCommand;
    private ServicePriceService servicePriceService;

    public ServiceTransactions(ServiceTransactionService serviceTransactionService,
                               ServiceTxnToServiceTxnCommand serviceTxnToServiceTxnCommand,
                               ServiceTxnCommandToServiceTxn serviceTxnCommandToServiceTxn,
                               ServicePriceToServicePriceCommand servicePriceToServicePriceCommand,
                               ServicePriceService servicePriceService) {
        this.serviceTransactionService = serviceTransactionService;
        this.serviceTxnCommandToServiceTxn = serviceTxnCommandToServiceTxn;
        this.serviceTxnToServiceTxnCommand = serviceTxnToServiceTxnCommand;
        this.servicePriceToServicePriceCommand =servicePriceToServicePriceCommand;
        this.servicePriceService =servicePriceService;
    }

    @PostMapping("/add")
    ServiceTransactionCommand addTxn(@RequestBody ServiceTransactionCommand serviceTransactionCommand){
        serviceTransactionCommand.getTransactionCommand().setDateTransaction(LocalDate.now());
        return serviceTxnToServiceTxnCommand.convert(
                serviceTransactionService.add(
                        serviceTxnCommandToServiceTxn.convert(serviceTransactionCommand)
        ));
    }

    @GetMapping("/")
    List<ServiceTransactionCommand> getAllServices(){
        return serviceTransactionService.findAll().stream().map(
                serviceTransaction -> (serviceTxnToServiceTxnCommand.convert(serviceTransaction)
        )).collect(Collectors.toList());
    }

    @GetMapping("/service-price-details/")
    List<ServicePriceCommand> getAllServicePriceDetails(){
        return servicePriceService.findAll().stream().map(
                servicePrice -> (servicePriceToServicePriceCommand.convert(servicePrice))
        ).collect(Collectors.toList());
    }
}
