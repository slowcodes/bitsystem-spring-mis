package ng.com.bitsystems.mis.services.springdatajpa.laboratories.bloodbank;

import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonorRegistry;
import ng.com.bitsystems.mis.repositories.laboratories.bloodbank.DonorRegistryRepository;
import ng.com.bitsystems.mis.services.laboratories.bloodbank.DonorRegistryService;

import java.util.HashSet;
import java.util.Set;

public class DonorRegistrySDJPaService implements DonorRegistryService {
    private DonorRegistryRepository donorRegistryRepository;

    public DonorRegistrySDJPaService(DonorRegistryRepository donorRegistryRepository) {
        this.donorRegistryRepository = donorRegistryRepository;
    }

    @Override
    public Set<DonorRegistry> findAll() {
        Set<DonorRegistry> donorRegistry = new HashSet<>();
        donorRegistryRepository.findAll().forEach(donorRegistry::add);
        return donorRegistry;
    }

    @Override
    public DonorRegistry findByID(Long aLong) {
        return donorRegistryRepository.findById(aLong).get();
    }

    @Override
    public DonorRegistry add(DonorRegistry object) {
        return donorRegistryRepository.save(object);
    }

    @Override
    public void delete(DonorRegistry object) {
        donorRegistryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        donorRegistryRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(DonorRegistry object) {

    }
}
