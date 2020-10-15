package ng.com.bitsystems.mis.services.springdatajpa.laboratories.bloodbank;

import ng.com.bitsystems.mis.models.laboratories.bloodbank.ClearedQueue;
import ng.com.bitsystems.mis.repositories.laboratories.bloodbank.ClearedQueueRepository;
import ng.com.bitsystems.mis.services.laboratories.bloodbank.ClearedQueueService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class ClearedQueueSDJPaService implements ClearedQueueService {
    private ClearedQueueRepository clearedQueueRepository;

    public ClearedQueueSDJPaService(ClearedQueueRepository clearedQueueRepository) {
        this.clearedQueueRepository = clearedQueueRepository;
    }

    @Override
    public Set<ClearedQueue> findAll() {
        Set<ClearedQueue> clearedQueues = new HashSet<>();
        clearedQueueRepository.findAll().forEach(clearedQueues::add);
        return clearedQueues;
    }

    @Override
    public ClearedQueue findByID(Long aLong) {
        return clearedQueueRepository.findById(aLong).get();
    }

    @Override
    public ClearedQueue add(ClearedQueue object) {
        return clearedQueueRepository.save(object);
    }

    @Override
    public void delete(ClearedQueue object) {
        clearedQueueRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        clearedQueueRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ClearedQueue object) {

    }
}
