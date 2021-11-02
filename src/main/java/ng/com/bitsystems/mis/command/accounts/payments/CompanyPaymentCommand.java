package ng.com.bitsystems.mis.command.accounts.payments;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.payments.TransactionType;

@Setter
@Getter
@NoArgsConstructor
public class CompanyPaymentCommand {
    private Long id;
    private Long transactionId;
    private TransactionType transactionType;
    private PaymentCommand paymentCommand;
    private Long companyId;
}
