package ng.com.bitsystems.mis.command.accounts.payments;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySalesTransactionCommand;
import ng.com.bitsystems.mis.models.accounts.payments.PaymentMethods;
import ng.com.bitsystems.mis.models.accounts.payments.PaymentType;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class PharmacyTransactionPaymentCommand {
    private Long id;
    private Long userId;
    private PaymentMethods paymentMethod;
    private double amountPaid;
    private String comment;
    private PaymentType paymentType;
    private LocalDate dateOfPayment;
    private LocalDateTime timeOfPayment;
    private PharmacySalesTransactionCommand pharmacySalesTransactionCommand;
}
