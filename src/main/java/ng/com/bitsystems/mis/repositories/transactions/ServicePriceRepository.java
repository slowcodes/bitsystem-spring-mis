package ng.com.bitsystems.mis.repositories.transactions;

import ng.com.bitsystems.mis.models.transactions.ServiceDetailPricing;
import org.springframework.data.repository.CrudRepository;

public interface ServicePriceRepository extends CrudRepository<ServiceDetailPricing, Long> {
}
