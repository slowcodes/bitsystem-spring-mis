package ng.com.bitsystems.mis.repositories.accounts.pricing;

import ng.com.bitsystems.mis.models.accounts.pricing.Rate;
import org.springframework.data.repository.CrudRepository;

public interface RateRepository extends CrudRepository<Rate, Long> {
}
