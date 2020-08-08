package ng.com.bitsystems.mis.repositories.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import org.springframework.data.repository.CrudRepository;

public interface PharmacyProductRepository extends CrudRepository<PharmacyProducts, Long> {
}
