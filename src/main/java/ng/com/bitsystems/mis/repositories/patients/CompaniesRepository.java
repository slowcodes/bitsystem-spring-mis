package ng.com.bitsystems.mis.repositories.patients;

import ng.com.bitsystems.mis.models.patients.CompanyFolder;
import org.springframework.data.repository.CrudRepository;

public interface CompaniesRepository extends CrudRepository<CompanyFolder, Long> {
}
