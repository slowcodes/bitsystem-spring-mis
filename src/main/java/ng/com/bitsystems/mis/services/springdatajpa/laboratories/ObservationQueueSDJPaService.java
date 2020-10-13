package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.ObservationQueue;
import ng.com.bitsystems.mis.repositories.laboratories.ObservationQueueRepository;
import ng.com.bitsystems.mis.services.laboratories.ObservationQueueService;

import java.util.HashSet;
import java.util.Set;

public class ObservationQueueSDJPaService implements ObservationQueueService {

    private ObservationQueueRepository  observationQueueRepository;

    public ObservationQueueSDJPaService(ObservationQueueRepository observationQueueRepository) {
        this.observationQueueRepository = observationQueueRepository;
    }

    @Override
    public Set<ObservationQueue> findAll() {
        Set<ObservationQueue> observationQueues = new HashSet<>();
        observationQueueRepository.findAll().forEach(observationQueues::add);
        return observationQueues;
    }

    @Override
    public ObservationQueue findByID(Long aLong) {
        return observationQueueRepository.findById(aLong).get();
    }

    @Override
    public ObservationQueue add(ObservationQueue object) {
        return observationQueueRepository.save(object);
    }

    @Override
    public void delete(ObservationQueue object) {
        observationQueueRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        observationQueueRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ObservationQueue object) {

    }
}
