package ng.com.bitsystems.mis.services.springdatajpa.rewards.promos;

import ng.com.bitsystems.mis.models.rewards.promos.PharmacyRewardBasedPromo;
import ng.com.bitsystems.mis.repositories.rewards.promos.PharmacyRewardBasedPromoRepository;
import ng.com.bitsystems.mis.services.rewards.promos.PharmacyRewardBasedPromoService;

import java.util.HashSet;
import java.util.Set;

public class PharmacyRewardBasedPromoSDJPaService implements PharmacyRewardBasedPromoService {
    private PharmacyRewardBasedPromoRepository pharmacyRewardBasedPromoRepository;

    public PharmacyRewardBasedPromoSDJPaService(PharmacyRewardBasedPromoRepository pharmacyRewardBasedPromoRepository) {
        this.pharmacyRewardBasedPromoRepository = pharmacyRewardBasedPromoRepository;
    }

    @Override
    public Set<PharmacyRewardBasedPromo> findAll() {
        Set<PharmacyRewardBasedPromo> pharmacyRewardBasedPromos = new HashSet<>();
        pharmacyRewardBasedPromoRepository.findAll().forEach(pharmacyRewardBasedPromos::add);
        return pharmacyRewardBasedPromos;
    }

    @Override
    public PharmacyRewardBasedPromo findByID(Long aLong) {
        return pharmacyRewardBasedPromoRepository.findById(aLong).get();
    }

    @Override
    public PharmacyRewardBasedPromo add(PharmacyRewardBasedPromo object) {
        return pharmacyRewardBasedPromoRepository.save(object);
    }

    @Override
    public void delete(PharmacyRewardBasedPromo object) {
        pharmacyRewardBasedPromoRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        pharmacyRewardBasedPromoRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PharmacyRewardBasedPromo object) {

    }
}
