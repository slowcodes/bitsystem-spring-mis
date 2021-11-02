package ng.com.bitsystems.mis.repositories.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.Sales;
import org.springframework.data.repository.CrudRepository;

public interface SalesRepository extends CrudRepository<Sales, Long> {
}
