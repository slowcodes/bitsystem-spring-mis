package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.ExperimentParameters;
import ng.com.bitsystems.mis.repositories.laboratories.ExperimentParametersRepository;
import ng.com.bitsystems.mis.services.laboratories.ExperimentParametersService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class ExperimentParameterSDJPaService implements ExperimentParametersService {

    private ExperimentParametersRepository experimentParametersRepository;

    public ExperimentParameterSDJPaService(ExperimentParametersRepository experimentParametersRepository) {
        this.experimentParametersRepository = experimentParametersRepository;
    }

    @Override
    public Set<ExperimentParameters> findAll() {
        Set<ExperimentParameters> experimentParameters = new HashSet<>();
        experimentParametersRepository.findAll().forEach(experimentParameters::add);
        return experimentParameters;
    }

    @Override
    public ExperimentParameters findByID(Long aLong) {
        return experimentParametersRepository.findById(aLong).get();
    }

    @Override
    public ExperimentParameters add(ExperimentParameters object) {
        return experimentParametersRepository.save(object);
    }

    @Override
    public void delete(ExperimentParameters object) {
        experimentParametersRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        experimentParametersRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ExperimentParameters object) {

    }
}
