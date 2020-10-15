package ng.com.bitsystems.mis.services.springdatajpa.rewards.promos;

import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromosProducts;
import ng.com.bitsystems.mis.repositories.rewards.promos.PharmacyPromoProductRepository;
import ng.com.bitsystems.mis.services.rewards.promos.PharmacyPromoProductService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class PharmacyPromoProductSDJPaService implements PharmacyPromoProductService {

    private PharmacyPromoProductRepository pharmacyPromoProductRepository;

    public PharmacyPromoProductSDJPaService(PharmacyPromoProductRepository pharmacyPromoProductRepository) {
        this.pharmacyPromoProductRepository = pharmacyPromoProductRepository;
    }
    @Override
    public Set<PharmacyPromosProducts> findAll() {
        Set<PharmacyPromosProducts> pharmacyPromosProducts = new HashSet<>();
        pharmacyPromoProductRepository.findAll().forEach(pharmacyPromosProducts::add);
        return pharmacyPromosProducts;
    }

    @Override
    public PharmacyPromosProducts findByID(Long aLong) {
        return pharmacyPromoProductRepository.findById(aLong).get();
    }

    @Override
    public PharmacyPromosProducts add(PharmacyPromosProducts object) {
        return pharmacyPromoProductRepository.save(object);
    }

    @Override
    public void delete(PharmacyPromosProducts object) {
        pharmacyPromoProductRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        pharmacyPromoProductRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PharmacyPromosProducts object) {

    }

}
