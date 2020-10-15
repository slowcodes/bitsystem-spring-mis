package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.CollectedSamples;
import ng.com.bitsystems.mis.repositories.laboratories.CollectedSamplesRepository;
import ng.com.bitsystems.mis.services.laboratories.CollectedSamplesServices;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class CollectedSampleSDJPaService implements CollectedSamplesServices {
    private CollectedSamplesRepository collectedSamplesRepository;

    public CollectedSampleSDJPaService(CollectedSamplesRepository collectedSamplesRepository) {
        this.collectedSamplesRepository = collectedSamplesRepository;
    }

    @Override
    public Set<CollectedSamples> findAll() {
        Set<CollectedSamples> collectedSamples = new HashSet<>();
        collectedSamplesRepository.findAll().forEach(collectedSamples::add);
        return collectedSamples;
    }

    @Override
    public CollectedSamples findByID(Long aLong) {

        return collectedSamplesRepository.findById(aLong).get();
    }

    @Override
    public CollectedSamples add(CollectedSamples object) {
        return collectedSamplesRepository.save(object);
    }

    @Override
    public void delete(CollectedSamples object) {
        collectedSamplesRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        collectedSamplesRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(CollectedSamples object) {

    }
}
