package ng.com.bitsystems.mis.command.accounts.payments;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.payments.PaymentMethods;
import ng.com.bitsystems.mis.models.accounts.payments.PaymentType;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySalesTransaction;

@Setter
@Getter
@NoArgsConstructor
public class PharmacyTransactionPaymentCommand {
    private Long userId;
    private PaymentMethods paymentMethod;
    private double amountPaid;
    private String comment;
    private PaymentType paymentType;
    private PharmacySalesTransaction pharmacySalesTransaction;
}
