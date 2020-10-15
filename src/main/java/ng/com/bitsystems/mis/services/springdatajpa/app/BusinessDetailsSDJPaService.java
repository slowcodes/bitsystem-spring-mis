package ng.com.bitsystems.mis.services.springdatajpa.app;

import ng.com.bitsystems.mis.models.app.BusinessDetails;
import ng.com.bitsystems.mis.repositories.app.BusinessDetailsRepository;
import ng.com.bitsystems.mis.services.app.BusinessDetailsService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class BusinessDetailsSDJPaService implements BusinessDetailsService {
    private BusinessDetailsRepository businessDetailsRepository;

    public BusinessDetailsSDJPaService(BusinessDetailsRepository businessDetailsRepository) {
        this.businessDetailsRepository = businessDetailsRepository;
    }

    @Override
    public Set<BusinessDetails> findAll() {
        Set<BusinessDetails> businessDetails = new HashSet<>();
        businessDetailsRepository.findAll().forEach(businessDetails::add);
        return businessDetails;
    }

    @Override
    public BusinessDetails findByID(Long aLong) {
        return businessDetailsRepository.findById(aLong).get();
    }

    @Override
    public BusinessDetails add(BusinessDetails object) {
        return businessDetailsRepository.save(object);
    }

    @Override
    public void delete(BusinessDetails object) {
        businessDetailsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        businessDetailsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(BusinessDetails object) {

    }
}
