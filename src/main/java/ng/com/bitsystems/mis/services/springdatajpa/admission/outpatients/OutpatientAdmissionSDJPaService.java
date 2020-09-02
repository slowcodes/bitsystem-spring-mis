package ng.com.bitsystems.mis.services.springdatajpa.admission.outpatients;

import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmission;
import ng.com.bitsystems.mis.repositories.admissions.outpatients.OutpatientAdmissionRepository;
import ng.com.bitsystems.mis.services.admission.outpatients.OutpatientAdmissionService;

import java.util.HashSet;
import java.util.Set;

public class OutpatientAdmissionSDJPaService implements OutpatientAdmissionService {
    private OutpatientAdmissionRepository admissionRepository;

    public OutpatientAdmissionSDJPaService(OutpatientAdmissionRepository admissionRepository) {
        this.admissionRepository = admissionRepository;
    }

    @Override
    public Set<OutpatientAdmission> findAll() {
        Set<OutpatientAdmission> outpatientAdmissions = new HashSet<>();
        admissionRepository.findAll().forEach(outpatientAdmissions::add);

        return outpatientAdmissions;
    }

    @Override
    public OutpatientAdmission findByID(Long aLong) {
        return admissionRepository.findById(aLong).get();
    }

    @Override
    public OutpatientAdmission add(OutpatientAdmission object) {
        return admissionRepository.save(object);
    }

    @Override
    public void delete(OutpatientAdmission object) {
        admissionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        admissionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(OutpatientAdmission object) {

    }
}
