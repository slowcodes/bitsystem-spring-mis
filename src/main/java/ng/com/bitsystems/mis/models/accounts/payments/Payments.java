package ng.com.bitsystems.mis.models.accounts.payments;

import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.Transaction;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Payments extends BaseEntity {

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private AppUsers appUsers;

    @Column(name="payment_method")
    @Enumerated(EnumType.STRING)
    private PaymentMethods paymentMethod;

    @Column(name="amount_paid")
    private double amountPaid;

    @Column(name="date_of_payment", columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private LocalDate dateOfPayment;

    @Column(name="time_of_payment")
    @CreationTimestamp
    private LocalDateTime timeOfPayment;

    @Column(name = "comment")
    private String comment;

    @Enumerated(value = EnumType.STRING)
    private PaymentType paymentType;

    @ManyToOne
    @JoinColumn(name = "transaction_id")
    private Transaction transaction;
}