package ng.com.bitsystems.mis.command.accounts.payments;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionCommand;
import ng.com.bitsystems.mis.models.accounts.payments.PaymentMethods;
import ng.com.bitsystems.mis.models.accounts.payments.PaymentType;

@Setter
@Getter
@NoArgsConstructor
public class VaccinationTransactionPaymentCommand {
    private Long userId;
    private PaymentMethods paymentMethod;
    private double amountPaid;
    private String comment;
    private PaymentType paymentType;
    private VaccinationTransactionCommand vaccinationTransactionCommand;
}
