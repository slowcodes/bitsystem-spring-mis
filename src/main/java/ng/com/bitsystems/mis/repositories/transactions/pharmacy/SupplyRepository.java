package ng.com.bitsystems.mis.repositories.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.Supplies;
import org.springframework.data.repository.CrudRepository;

public interface SupplyRepository extends CrudRepository<Supplies, Long> {
}
