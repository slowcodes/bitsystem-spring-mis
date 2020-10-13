package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.SampleCollectionQueue;
import ng.com.bitsystems.mis.repositories.laboratories.SampleCollectionQueueRepository;
import ng.com.bitsystems.mis.services.laboratories.SampleCollectionQueueService;

import java.util.HashSet;
import java.util.Set;

public class SampleCollectionQueueSDJPaService implements SampleCollectionQueueService {
    private SampleCollectionQueueRepository sampleCollectionQueueRepository;

    public SampleCollectionQueueSDJPaService(SampleCollectionQueueRepository sampleCollectionQueueRepository) {
        this.sampleCollectionQueueRepository = sampleCollectionQueueRepository;
    }

    @Override
    public Set<SampleCollectionQueue> findAll() {
        Set<SampleCollectionQueue> sampleCollectionQueues = new HashSet<>();
        sampleCollectionQueueRepository.findAll().forEach(sampleCollectionQueues::add);
        return sampleCollectionQueues;
    }


    @Override
    public SampleCollectionQueue findByID(Long aLong) {
        return sampleCollectionQueueRepository.findById(aLong).get();
    }

    @Override
    public SampleCollectionQueue add(SampleCollectionQueue object) {
        return sampleCollectionQueueRepository.save(object);
    }

    @Override
    public void delete(SampleCollectionQueue object) {
        sampleCollectionQueueRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        sampleCollectionQueueRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(SampleCollectionQueue object) {

    }
}
