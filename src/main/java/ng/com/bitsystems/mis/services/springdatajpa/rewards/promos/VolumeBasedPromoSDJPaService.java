package ng.com.bitsystems.mis.services.springdatajpa.rewards.promos;

import ng.com.bitsystems.mis.models.rewards.promos.VolumedBasedPromos;
import ng.com.bitsystems.mis.repositories.rewards.promos.VolumeBasedPromoRepository;
import ng.com.bitsystems.mis.services.rewards.promos.VolumeBasedPromoService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VolumeBasedPromoSDJPaService implements VolumeBasedPromoService {
    private VolumeBasedPromoRepository volumeBasedPromoRepository;

    public VolumeBasedPromoSDJPaService(VolumeBasedPromoRepository volumeBasedPromoRepository) {
        this.volumeBasedPromoRepository = volumeBasedPromoRepository;
    }

    @Override
    public Set<VolumedBasedPromos> findAll() {
        Set<VolumedBasedPromos> volumedBasedPromos = new HashSet<>();
        volumeBasedPromoRepository.findAll().forEach(volumedBasedPromos::add);
        return volumedBasedPromos;
    }

    @Override
    public VolumedBasedPromos findByID(Long aLong) {
        return volumeBasedPromoRepository.findById(aLong).get();
    }

    @Override
    public VolumedBasedPromos add(VolumedBasedPromos object) {
        return volumeBasedPromoRepository.save(object);
    }

    @Override
    public void delete(VolumedBasedPromos object) {
        volumeBasedPromoRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        volumeBasedPromoRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(VolumedBasedPromos object) {

    }
}
