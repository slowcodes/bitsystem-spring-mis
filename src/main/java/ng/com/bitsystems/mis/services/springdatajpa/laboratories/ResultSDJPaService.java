package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.Results;
import ng.com.bitsystems.mis.repositories.laboratories.ResultRepository;
import ng.com.bitsystems.mis.services.laboratories.ResultService;

import java.util.HashSet;
import java.util.Set;

public class ResultSDJPaService implements ResultService {
    private ResultRepository resultRepository;

    public ResultSDJPaService(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public Set<Results> findAll() {
        Set<Results> results = new HashSet<>();
        resultRepository.findAll().forEach(results::add);
        return results;
    }

    @Override
    public Results findByID(Long aLong) {
        return resultRepository.findById(aLong).get();
    }

    @Override
    public Results add(Results object) {
        return resultRepository.save(object);
    }

    @Override
    public void delete(Results object) {
        resultRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        resultRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Results object) {

    }
}
