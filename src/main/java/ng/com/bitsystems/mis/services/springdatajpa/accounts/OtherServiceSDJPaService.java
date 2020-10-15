package ng.com.bitsystems.mis.services.springdatajpa.accounts;

import ng.com.bitsystems.mis.models.accounts.OtherServices;
import ng.com.bitsystems.mis.repositories.accounts.OtherServiceRepository;
import ng.com.bitsystems.mis.services.accounts.OtherServiceService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class OtherServiceSDJPaService implements OtherServiceService {
    private OtherServiceRepository otherServiceRepository;

    public OtherServiceSDJPaService(OtherServiceRepository otherServiceRepository) {
        this.otherServiceRepository = otherServiceRepository;
    }

    @Override
    public Set<OtherServices> findAll() {
        Set<OtherServices> otherServices = new HashSet<>();
        otherServiceRepository.findAll().forEach(otherServices::add);
        return otherServices;
    }

    @Override
    public OtherServices findByID(Long aLong) {
        return otherServiceRepository.findById(aLong).get();
    }

    @Override
    public OtherServices add(OtherServices object) {
        return otherServiceRepository.save(object);
    }

    @Override
    public void delete(OtherServices object) {
        otherServiceRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        otherServiceRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(OtherServices object) {

    }
}
