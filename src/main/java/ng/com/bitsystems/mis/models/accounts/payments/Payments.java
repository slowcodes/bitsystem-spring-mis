package ng.com.bitsystems.mis.models.accounts.payments;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Payments extends BaseEntity {

    private Users users;
    private String paymentMethod;
    private double amountPaid;
    private Date dateOfPayment;
    private Date timeOfPayment;
    private String comment;
    private PaymentType paymentType;

}
