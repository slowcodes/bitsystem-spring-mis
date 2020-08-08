package ng.com.bitsystems.mis.repositories.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.OtherServicePayments;
import org.springframework.data.repository.CrudRepository;

public interface OtherServicePaymentRepository extends CrudRepository<OtherServicePayments, Long> {
}
