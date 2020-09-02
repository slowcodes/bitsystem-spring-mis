package ng.com.bitsystems.mis.services.springdatajpa.admission.facilities;

import ng.com.bitsystems.mis.models.admissions.facilities.EndUsage;
import ng.com.bitsystems.mis.repositories.admissions.facilities.EndUsageRepository;
import ng.com.bitsystems.mis.services.admission.facilities.EndUsageService;

import java.util.HashSet;
import java.util.Set;

public class EndUsageSDJPaService implements EndUsageService {
    private EndUsageRepository endUsageRepository;

    public EndUsageSDJPaService(EndUsageRepository endUsageRepository) {
        this.endUsageRepository = endUsageRepository;
    }

    @Override
    public Set<EndUsage> findAll() {
        Set<EndUsage> endUsage = new HashSet<>();
        endUsageRepository.findAll().forEach(endUsage::add);
        return endUsage;
    }

    @Override
    public EndUsage findByID(Long aLong) {
        return endUsageRepository.findById(aLong).get();
    }

    @Override
    public EndUsage add(EndUsage object) {
        return endUsageRepository.save(object);
    }

    @Override
    public void delete(EndUsage object) {
        endUsageRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        endUsageRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(EndUsage object) {

    }
}
