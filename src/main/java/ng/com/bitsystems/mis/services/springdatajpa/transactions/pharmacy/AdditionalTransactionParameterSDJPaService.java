package ng.com.bitsystems.mis.services.springdatajpa.transactions.pharmacy;

import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionParameters;
import ng.com.bitsystems.mis.repositories.transactions.pharmacy.AdditionalTransactionParameterRepository;
import ng.com.bitsystems.mis.services.transactions.pharmacy.AdditionalTransactionParamterService;

import java.util.HashSet;
import java.util.Set;

public class AdditionalTransactionParameterSDJPaService implements AdditionalTransactionParamterService {
    private AdditionalTransactionParameterRepository parameterRepository;

    public AdditionalTransactionParameterSDJPaService(AdditionalTransactionParameterRepository parameterRepository) {
        this.parameterRepository = parameterRepository;
    }

    @Override
    public Set<AdditionalTransactionParameters> findAll() {
        Set<AdditionalTransactionParameters> parameters=new HashSet<>();
        parameterRepository.findAll().forEach(parameters::add);

        return parameters;
    }

    @Override
    public AdditionalTransactionParameters findByID(Long aLong) {
        return parameterRepository.findById(aLong).get();
    }

    @Override
    public AdditionalTransactionParameters add(AdditionalTransactionParameters object) {
        return parameterRepository.save(object);
    }

    @Override
    public void delete(AdditionalTransactionParameters object) {
        parameterRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        parameterRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(AdditionalTransactionParameters object) {

    }
}
