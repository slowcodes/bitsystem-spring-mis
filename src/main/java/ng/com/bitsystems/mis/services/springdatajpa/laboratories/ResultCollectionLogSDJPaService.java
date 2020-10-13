package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.ResultCollectionLog;
import ng.com.bitsystems.mis.repositories.laboratories.ResultCollectionLogRepository;
import ng.com.bitsystems.mis.services.laboratories.ResultCollectionLogService;

import java.util.HashSet;
import java.util.Set;

public class ResultCollectionLogSDJPaService implements ResultCollectionLogService {
    private ResultCollectionLogRepository resultCollectionLogRepository;

    public ResultCollectionLogSDJPaService(ResultCollectionLogRepository resultCollectionLogRepository) {
        this.resultCollectionLogRepository = resultCollectionLogRepository;
    }

    @Override
    public Set<ResultCollectionLog> findAll() {
        Set<ResultCollectionLog> resultCollectionLogs = new HashSet<>();
        resultCollectionLogRepository.findAll().forEach(resultCollectionLogs::add);
        return resultCollectionLogs;
    }

    @Override
    public ResultCollectionLog findByID(Long aLong) {
        return resultCollectionLogRepository.findById(aLong).get();
    }

    @Override
    public ResultCollectionLog add(ResultCollectionLog object) {
        return resultCollectionLogRepository.save(object);
    }

    @Override
    public void delete(ResultCollectionLog object) {
        resultCollectionLogRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        resultCollectionLogRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ResultCollectionLog object) {

    }
}
