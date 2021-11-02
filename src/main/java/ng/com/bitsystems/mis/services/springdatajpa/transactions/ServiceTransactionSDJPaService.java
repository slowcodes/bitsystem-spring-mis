package ng.com.bitsystems.mis.services.springdatajpa.transactions;

import ng.com.bitsystems.mis.models.transactions.ServiceTransaction;
import ng.com.bitsystems.mis.repositories.transactions.ServiceTransactionRepository;
import ng.com.bitsystems.mis.services.transactions.ServiceTransactionService;

import java.util.HashSet;
import java.util.Set;

@org.springframework.stereotype.Service
public class ServiceTransactionSDJPaService implements ServiceTransactionService {
    private ServiceTransactionRepository serviceTransactionRepository;

    public ServiceTransactionSDJPaService(ServiceTransactionRepository serviceTransactionRepository) {
        this.serviceTransactionRepository = serviceTransactionRepository;
    }

    @Override
    public Set<ServiceTransaction> findAll() {
        Set<ServiceTransaction> services = new HashSet<>();
        serviceTransactionRepository.findAll().forEach(services::add);
        return services;
    }

    @Override
    public ServiceTransaction findByID(Long aLong) {
        return serviceTransactionRepository.findById(aLong).get();
    }

    @Override
    public ServiceTransaction add(ServiceTransaction object) {
        return serviceTransactionRepository.save(object);
    }

    @Override
    public void delete(ServiceTransaction object) {
        serviceTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        serviceTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ServiceTransaction object) {

    }
}
