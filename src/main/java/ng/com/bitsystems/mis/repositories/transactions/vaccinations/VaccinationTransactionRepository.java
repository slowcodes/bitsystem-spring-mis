package ng.com.bitsystems.mis.repositories.transactions.vaccinations;

import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;
import org.springframework.data.repository.CrudRepository;

public interface VaccinationTransactionRepository extends CrudRepository<VaccinationTransaction, Long> {
}
