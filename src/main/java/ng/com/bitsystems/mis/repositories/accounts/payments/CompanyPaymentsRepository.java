package ng.com.bitsystems.mis.repositories.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.CompanyPayments;
import org.springframework.data.repository.CrudRepository;

public interface CompanyPaymentsRepository extends CrudRepository<CompanyPayments, Long> {
}
