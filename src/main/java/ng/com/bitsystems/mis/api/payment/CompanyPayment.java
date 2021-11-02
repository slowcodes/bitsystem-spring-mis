package ng.com.bitsystems.mis.api.payment;


import ng.com.bitsystems.mis.command.accounts.payments.CompanyPaymentCommand;
import ng.com.bitsystems.mis.converters.accounts.payment.CompanyPaymentCommandToCompanyPayment;
import ng.com.bitsystems.mis.converters.accounts.payment.CompanyPaymentToCompanyPaymentCommand;
import ng.com.bitsystems.mis.services.accounts.payments.CompanyPaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment/company/")
public class CompanyPayment {

    private CompanyPaymentService companyPaymentService;
    private CompanyPaymentToCompanyPaymentCommand companyPaymentToCompanyPaymentCommand;
    private CompanyPaymentCommandToCompanyPayment companyPaymentCommandToCompanyPayment;

    public CompanyPayment(CompanyPaymentService companyPaymentService,
                          CompanyPaymentToCompanyPaymentCommand companyPaymentToCompanyPaymentCommand,
                          CompanyPaymentCommandToCompanyPayment companyPaymentCommandToCompanyPayment) {
        this.companyPaymentService = companyPaymentService;
        this.companyPaymentToCompanyPaymentCommand = companyPaymentToCompanyPaymentCommand;
        this.companyPaymentCommandToCompanyPayment = companyPaymentCommandToCompanyPayment;
    }

    @PostMapping("add")
    ResponseEntity<CompanyPaymentCommand> add(@RequestBody CompanyPaymentCommand companyPaymentCommand){

        return ResponseEntity.ok(companyPaymentToCompanyPaymentCommand.convert(
                companyPaymentService.add(companyPaymentCommandToCompanyPayment.convert(
                        companyPaymentCommand
                ))
        ));
    }
}
