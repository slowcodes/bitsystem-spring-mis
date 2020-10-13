package ng.com.bitsystems.mis.repositories.rewards.promos;

import ng.com.bitsystems.mis.models.rewards.promos.VolumedBasedPromos;
import org.springframework.data.repository.CrudRepository;

public interface VolumeBasedPromoRepository extends CrudRepository<VolumedBasedPromos, Long> {
}
