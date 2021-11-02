package ng.com.bitsystems.mis.repositories.laboratories;

import ng.com.bitsystems.mis.models.laboratories.LabPackages;
import org.springframework.data.repository.CrudRepository;

public interface PackageRepository extends CrudRepository<LabPackages, Long> {
}
