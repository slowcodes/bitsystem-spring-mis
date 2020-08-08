package ng.com.bitsystems.mis.repositories.laboratories.bloodbank;

import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonationQueue;
import org.springframework.data.repository.CrudRepository;

public interface DonationQueueRepository extends CrudRepository<DonationQueue, Long> {
}
