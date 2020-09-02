package ng.com.bitsystems.mis.services.springdatajpa.admission.inpatients;

import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientAdmission;
import ng.com.bitsystems.mis.repositories.admissions.inpatients.InpatientAdmissionRepository;
import ng.com.bitsystems.mis.services.admission.inpatients.InpatientAdmissionService;

import java.util.HashSet;
import java.util.Set;

public class InpatientAdmissionSJPaService implements InpatientAdmissionService {
    private InpatientAdmissionRepository inpatientAdmissionRepository;

    public InpatientAdmissionSJPaService(InpatientAdmissionRepository inpatientAdmissionRepository) {
        this.inpatientAdmissionRepository = inpatientAdmissionRepository;
    }

    @Override
    public Set<InpatientAdmission> findAll() {
        Set<InpatientAdmission> inpatientAdmissions = new HashSet<>();
        inpatientAdmissionRepository.findAll().forEach(inpatientAdmissions::add);
        return inpatientAdmissions;
    }

    @Override
    public InpatientAdmission findByID(Long aLong) {
        return inpatientAdmissionRepository.findById(aLong).get();
    }

    @Override
    public InpatientAdmission add(InpatientAdmission object) {
        return inpatientAdmissionRepository.save(object);
    }

    @Override
    public void delete(InpatientAdmission object) {
        inpatientAdmissionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        inpatientAdmissionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InpatientAdmission object) {

    }
}
