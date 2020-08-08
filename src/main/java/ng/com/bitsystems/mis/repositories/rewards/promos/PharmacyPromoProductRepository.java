package ng.com.bitsystems.mis.repositories.rewards.promos;

import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromosProducts;
import org.springframework.data.repository.CrudRepository;

public interface PharmacyPromoProductRepository extends CrudRepository<PharmacyPromosProducts, Long> {
}
