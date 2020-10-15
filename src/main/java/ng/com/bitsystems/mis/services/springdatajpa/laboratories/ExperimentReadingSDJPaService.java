package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.ExperimentReadings;
import ng.com.bitsystems.mis.repositories.laboratories.ExperimentReadingsRepository;
import ng.com.bitsystems.mis.services.laboratories.ExperimentReadingService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class ExperimentReadingSDJPaService implements ExperimentReadingService {

    private ExperimentReadingsRepository experimentReadingsRepository;

    public ExperimentReadingSDJPaService(ExperimentReadingsRepository experimentReadingsRepository) {
        this.experimentReadingsRepository = experimentReadingsRepository;
    }

    @Override
    public Set<ExperimentReadings> findAll() {
        Set<ExperimentReadings> experimentReadings = new HashSet<>();
        experimentReadingsRepository.findAll().forEach(experimentReadings::add);
        return experimentReadings;
    }

    @Override
    public ExperimentReadings findByID(Long aLong) {
        return experimentReadingsRepository.findById(aLong).get();
    }

    @Override
    public ExperimentReadings add(ExperimentReadings object) {
        return experimentReadingsRepository.save(object);
    }

    @Override
    public void delete(ExperimentReadings object) {
        experimentReadingsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        experimentReadingsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ExperimentReadings object) {

    }
}
