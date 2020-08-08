package ng.com.bitsystems.mis.repositories.transactions.vaccinations;

import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;
import org.springframework.data.repository.CrudRepository;

public interface VaccinationTransactionDetailsRepository extends CrudRepository<VaccinationTransactionsDetails, Long> {
}
