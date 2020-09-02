package ng.com.bitsystems.mis.services.springdatajpa.admission.facilities;

import ng.com.bitsystems.mis.models.admissions.facilities.Wards;
import ng.com.bitsystems.mis.repositories.admissions.facilities.WardRepository;
import ng.com.bitsystems.mis.services.admission.facilities.WardService;

import java.util.HashSet;
import java.util.Set;

public class WardSDJPaService implements WardService {
    private WardRepository wardRepository;

    public WardSDJPaService(WardRepository wardRepository) {
        this.wardRepository = wardRepository;
    }

    @Override
    public Set<Wards> findAll() {
        Set<Wards> wards = new HashSet<>();
        wardRepository.findAll().forEach(wards::add);
        return wards;
    }

    @Override
    public Wards findByID(Long aLong) {
        return wardRepository.findById(aLong).get();
    }

    @Override
    public Wards add(Wards object) {
        return wardRepository.save(object);
    }

    @Override
    public void delete(Wards object) {
        wardRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        wardRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Wards object) {

    }
}
