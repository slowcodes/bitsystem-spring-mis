package ng.com.bitsystems.mis.services.springdatajpa.admission.facilities;

import ng.com.bitsystems.mis.models.admissions.facilities.StartUsage;
import ng.com.bitsystems.mis.repositories.admissions.facilities.StartUsageRepository;
import ng.com.bitsystems.mis.services.admission.facilities.StartUsageService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class StartUsageSDJPaService implements StartUsageService {
    private StartUsageRepository startUsageRepository;

    public StartUsageSDJPaService(StartUsageRepository startUsageRepository) {
        this.startUsageRepository = startUsageRepository;
    }

    @Override
    public Set<StartUsage> findAll() {
        Set<StartUsage> startUsage = new HashSet<>();
        startUsageRepository.findAll().forEach(startUsage::add);
        return startUsage;
    }

    @Override
    public StartUsage findByID(Long aLong) {
        return startUsageRepository.findById(aLong).get();
    }

    @Override
    public StartUsage add(StartUsage object) {
        return startUsageRepository.save(object);
    }

    @Override
    public void delete(StartUsage object) {
        startUsageRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        startUsageRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(StartUsage object) {

    }
}
