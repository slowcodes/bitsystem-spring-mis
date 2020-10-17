package ng.com.bitsystems.mis.command.accounts.payments;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.OtherServiceCommand;
import ng.com.bitsystems.mis.models.accounts.payments.PaymentMethods;
import ng.com.bitsystems.mis.models.accounts.payments.PaymentType;

@Setter
@Getter
@NoArgsConstructor
public class OtherServiceTransactionPaymentCommand {
    private Long userId;
    private PaymentMethods paymentMethod;
    private double amountPaid;
    private String comment;
    private PaymentType paymentType;
    private OtherServiceCommand otherServiceCommand;
}
