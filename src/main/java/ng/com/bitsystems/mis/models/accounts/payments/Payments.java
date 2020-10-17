package ng.com.bitsystems.mis.models.accounts.payments;

import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class Payments extends BaseEntity {

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private Users users;

    @Column(name="payment_method")
    @Enumerated(EnumType.STRING)
    private PaymentMethods paymentMethod;

    @Column(name="amount_paid")
    private double amountPaid;

    @Column(name="date_of_payment")
    private LocalDate dateOfPayment;

    @Column(name="time_of_payment")
    private LocalDateTime timeOfPayment;

    @Column(name = "comment")
    private String comment;

    @Enumerated(value = EnumType.STRING)
    private PaymentType paymentType;

}
