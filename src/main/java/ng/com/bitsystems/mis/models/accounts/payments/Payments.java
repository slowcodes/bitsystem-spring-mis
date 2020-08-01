package ng.com.bitsystems.mis.models.accounts.payments;

import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class Payments extends BaseEntity {

    @Column(name="teller")
    @ManyToOne()
    private Users users;

    @Column(name="payment_method")
    private String paymentMethod;

    @Column(name="amount_paid")
    private double amountPaid;

    @Column(name="date_of_payment")
    private Date dateOfPayment;

    @Column(name="time_of_payment")
    private Date timeOfPayment;

    @Column(name = "comment")
    private String comment;

    @Enumerated(value = EnumType.STRING)
    private PaymentType paymentType;

}
