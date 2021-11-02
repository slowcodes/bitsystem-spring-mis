package ng.com.bitsystems.mis.repositories.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payments, Long> {
}
