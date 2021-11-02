package ng.com.bitsystems.mis.services.springdatajpa.transactions;

import ng.com.bitsystems.mis.models.transactions.ServiceDetailPricing;
import ng.com.bitsystems.mis.repositories.transactions.ServicePriceRepository;
import ng.com.bitsystems.mis.services.transactions.ServicePriceService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ServicePriceSDJPaService implements ServicePriceService {
    private ServicePriceRepository servicePriceRepository;

    public ServicePriceSDJPaService(ServicePriceRepository servicePriceRepository) {
        this.servicePriceRepository = servicePriceRepository;
    }

    @Override
    public Set<ServiceDetailPricing> findAll() {
        Set<ServiceDetailPricing> serviceDetailPricings = new HashSet<>();
        servicePriceRepository.findAll().forEach(serviceDetailPricings::add);
        return serviceDetailPricings;
    }

    @Override
    public ServiceDetailPricing findByID(Long aLong) {
        return servicePriceRepository.findById(aLong).get();
    }

    @Override
    public ServiceDetailPricing add(ServiceDetailPricing object) {
        return servicePriceRepository.save(object);
    }

    @Override
    public void delete(ServiceDetailPricing object) {
        servicePriceRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        servicePriceRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ServiceDetailPricing object) {

    }
}
