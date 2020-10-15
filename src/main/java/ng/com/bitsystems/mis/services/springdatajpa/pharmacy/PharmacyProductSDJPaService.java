package ng.com.bitsystems.mis.services.springdatajpa.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.repositories.pharmacy.PharmacyProductRepository;
import ng.com.bitsystems.mis.services.pharmacy.PharmacyProductService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PharmacyProductSDJPaService implements PharmacyProductService {
    private PharmacyProductRepository pharmacyProductRepository;

    public PharmacyProductSDJPaService(PharmacyProductRepository pharmacyProductRepository) {
        this.pharmacyProductRepository = pharmacyProductRepository;
    }

    @Override
    public Set<PharmacyProducts> findAll() {
        Set<PharmacyProducts> pharmacyProducts = new HashSet<>();
        pharmacyProductRepository.findAll().forEach(pharmacyProducts::add);
        return pharmacyProducts;
    }

    @Override
    public PharmacyProducts findByID(Long aLong) {
        return pharmacyProductRepository.findById(aLong).get();
    }

    @Override
    public PharmacyProducts add(PharmacyProducts object) {
        return pharmacyProductRepository.save(object);
    }

    @Override
    public void delete(PharmacyProducts object) {
        pharmacyProductRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        pharmacyProductRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PharmacyProducts object) {

    }
}
