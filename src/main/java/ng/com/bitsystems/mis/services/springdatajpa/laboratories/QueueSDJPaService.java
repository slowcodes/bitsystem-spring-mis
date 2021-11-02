package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.Queue;
import ng.com.bitsystems.mis.repositories.laboratories.QueueRepository;
import ng.com.bitsystems.mis.services.laboratories.QueueService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class QueueSDJPaService implements QueueService {
    private QueueRepository queueRepository;

    public QueueSDJPaService(QueueRepository queueRepository) {
        this.queueRepository = queueRepository;
    }

    @Override
    public Set<Queue> findAll() {
        Set<Queue> queues = new HashSet<>();
        queueRepository.findAll().forEach(queues::add);
        return queues;
    }


    @Override
    public Queue findByID(Long aLong) {
        return queueRepository.findById(aLong).get();
    }

    @Override
    public Queue add(Queue object) {
        return queueRepository.save(object);
    }

    @Override
    public void delete(Queue object) {
        queueRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        queueRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Queue object) {

    }
}
