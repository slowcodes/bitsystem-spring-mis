package ng.com.bitsystems.mis.services.springdatajpa.admission;

import ng.com.bitsystems.mis.models.admissions.Discharged;
import ng.com.bitsystems.mis.repositories.admissions.DischargeRepository;
import ng.com.bitsystems.mis.services.admission.DischargedService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class DischargedSDJPaService implements DischargedService {
    private DischargeRepository dischargeRepository;

    public DischargedSDJPaService(DischargeRepository dischargeRepository) {
        this.dischargeRepository = dischargeRepository;
    }

    @Override
    public Set<Discharged> findAll() {
        Set<Discharged> inpatientDischarged = new HashSet<>();
        dischargeRepository.findAll().forEach(inpatientDischarged::add);

        return inpatientDischarged;
    }

    @Override
    public Discharged findByID(Long aLong) {
        return dischargeRepository.findById(aLong).get();
    }

    @Override
    public Discharged add(Discharged object) {
        return dischargeRepository.save(object);
    }

    @Override
    public void delete(Discharged object) {
        dischargeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        dischargeRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Discharged object) {

    }
}
