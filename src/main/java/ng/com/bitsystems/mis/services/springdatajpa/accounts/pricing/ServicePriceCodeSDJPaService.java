package ng.com.bitsystems.mis.services.springdatajpa.accounts.pricing;

import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.repositories.accounts.pricing.ServicePriceCodeRepository;
import ng.com.bitsystems.mis.services.accounts.pricing.ServicesPriceCodeService;

import java.util.HashSet;
import java.util.Set;

public class ServicePriceCodeSDJPaService implements ServicesPriceCodeService {
    private ServicePriceCodeRepository servicePriceCodeRepository;

    public ServicePriceCodeSDJPaService(ServicePriceCodeRepository servicePriceCodeRepository) {
        this.servicePriceCodeRepository = servicePriceCodeRepository;
    }

    @Override
    public Set<ServicePriceCode> findAll() {
        Set<ServicePriceCode> servicePriceCodes = new HashSet<>();
        servicePriceCodeRepository.findAll().forEach(servicePriceCodes::add);
        return servicePriceCodes;
    }

    @Override
    public ServicePriceCode findByID(Long aLong) {
        return servicePriceCodeRepository.findById(aLong).get();
    }

    @Override
    public ServicePriceCode add(ServicePriceCode object) {
        return servicePriceCodeRepository.save(object);
    }

    @Override
    public void delete(ServicePriceCode object) {
        servicePriceCodeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        servicePriceCodeRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ServicePriceCode object) {

    }
}
