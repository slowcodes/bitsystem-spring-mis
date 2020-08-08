package ng.com.bitsystems.mis.repositories.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.Barcodes;
import org.springframework.data.repository.CrudRepository;

public interface BarcodeRepository extends CrudRepository<Barcodes, Long> {
}
