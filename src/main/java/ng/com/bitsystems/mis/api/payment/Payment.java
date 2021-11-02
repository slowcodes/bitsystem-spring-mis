package ng.com.bitsystems.mis.api.payment;

import ng.com.bitsystems.mis.command.accounts.payments.PaymentCommand;
import ng.com.bitsystems.mis.converters.accounts.payment.PaymentCommandToPayment;
import ng.com.bitsystems.mis.converters.accounts.payment.PaymentToPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.Payments;
import ng.com.bitsystems.mis.services.accounts.payments.PaymentsService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/payments")
public class Payment {
    private PaymentsService paymentsService;
    private PaymentToPaymentCommand paymentToPaymentCommand;
    private PaymentCommandToPayment paymentCommandToPayment;

    public Payment(PaymentsService paymentsService,
                   PaymentToPaymentCommand paymentToPaymentCommand,
                   PaymentCommandToPayment paymentCommandToPayment) {
        this.paymentsService = paymentsService;
        this.paymentCommandToPayment = paymentCommandToPayment;
        this.paymentToPaymentCommand = paymentToPaymentCommand;
    }

    @GetMapping("/")
    List<Payments> allPayments(){
        return new ArrayList<>(paymentsService.findAll());
    }

    @PostMapping("/add")
    PaymentCommand addPayment(@RequestBody PaymentCommand paymentCommand){
        return paymentToPaymentCommand.convert(
                paymentsService.add(paymentCommandToPayment.convert(paymentCommand))
        );
    }

}
