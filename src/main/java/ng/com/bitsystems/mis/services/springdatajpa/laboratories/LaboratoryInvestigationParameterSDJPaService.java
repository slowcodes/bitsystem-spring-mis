package ng.com.bitsystems.mis.services.springdatajpa.laboratories;

import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigationParameters;
import ng.com.bitsystems.mis.repositories.laboratories.LaboratoryInvestigationParametersRepository;
import ng.com.bitsystems.mis.services.laboratories.LaboratoryInvestigationParametersService;

import java.util.HashSet;
import java.util.Set;

public class LaboratoryInvestigationParameterSDJPaService implements LaboratoryInvestigationParametersService {

    private LaboratoryInvestigationParametersRepository parametersRepository;

    public LaboratoryInvestigationParameterSDJPaService(LaboratoryInvestigationParametersRepository parametersRepository) {
        this.parametersRepository = parametersRepository;
    }

    @Override
    public Set<LaboratoryInvestigationParameters> findAll() {
        Set<LaboratoryInvestigationParameters> investigationParameters = new HashSet<>();
        parametersRepository.findAll().forEach(investigationParameters::add);
        return investigationParameters;
    }

    @Override
    public LaboratoryInvestigationParameters findByID(Long aLong) {
        return parametersRepository.findById(aLong).get();
    }

    @Override
    public LaboratoryInvestigationParameters add(LaboratoryInvestigationParameters object) {
        return parametersRepository.save(object);
    }

    @Override
    public void delete(LaboratoryInvestigationParameters object) {
        parametersRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        parametersRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(LaboratoryInvestigationParameters object) {

    }
}
