package ng.com.bitsystems.mis.services.springdatajpa.admission.inpatients;

import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientDischarged;
import ng.com.bitsystems.mis.repositories.admissions.inpatients.InpatientDischargeRepository;
import ng.com.bitsystems.mis.services.admission.inpatients.InpatientDischargedService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class InpatientDischargedSDJPaService implements InpatientDischargedService {
    private InpatientDischargeRepository dischargeRepository;

    public InpatientDischargedSDJPaService(InpatientDischargeRepository dischargeRepository) {
        this.dischargeRepository = dischargeRepository;
    }

    @Override
    public Set<InpatientDischarged> findAll() {
        Set<InpatientDischarged> inpatientDischarged = new HashSet<>();
        dischargeRepository.findAll().forEach(inpatientDischarged::add);

        return inpatientDischarged;
    }

    @Override
    public InpatientDischarged findByID(Long aLong) {
        return dischargeRepository.findById(aLong).get();
    }

    @Override
    public InpatientDischarged add(InpatientDischarged object) {
        return dischargeRepository.save(object);
    }

    @Override
    public void delete(InpatientDischarged object) {
        dischargeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        dischargeRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InpatientDischarged object) {

    }
}
