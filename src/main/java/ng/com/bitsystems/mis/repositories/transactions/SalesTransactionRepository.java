package ng.com.bitsystems.mis.repositories.transactions;

import ng.com.bitsystems.mis.models.transactions.ProductPrice;
import org.springframework.data.repository.CrudRepository;

public interface SalesTransactionRepository extends CrudRepository<ProductPrice, Long> {
}
