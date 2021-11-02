package ng.com.bitsystems.mis.services.springdatajpa.admission;

import ng.com.bitsystems.mis.models.admissions.Admission;
import ng.com.bitsystems.mis.repositories.admissions.AdmissionRepository;
import ng.com.bitsystems.mis.services.admission.AdmissionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class AdmissionSJPaService implements AdmissionService {
    private AdmissionRepository admissionRepository;

    public AdmissionSJPaService(AdmissionRepository admissionRepository) {
        this.admissionRepository = admissionRepository;
    }

    @Override
    public Set<Admission> findAll() {
        Set<Admission> admissions = new HashSet<>();
        admissionRepository.findAll().forEach(admissions::add);
        return admissions;
    }

    @Override
    public Admission findByID(Long aLong) {
        return admissionRepository.findById(aLong).get();
    }

    @Override
    public Admission add(Admission object) {
        return admissionRepository.save(object);
    }

    @Override
    public void delete(Admission object) {
        admissionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        admissionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Admission object) {

    }
}
