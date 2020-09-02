package ng.com.bitsystems.mis.services.springdatajpa.admission.inpatients;

import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptions;
import ng.com.bitsystems.mis.repositories.admissions.inpatients.InpatientPrescriptionRepository;
import ng.com.bitsystems.mis.services.admission.inpatients.InpatientPrescriptionService;

import java.util.HashSet;
import java.util.Set;

public class InpatientPrescriptionSDJPaService implements InpatientPrescriptionService {
    private InpatientPrescriptionRepository inpatientPrescriptionRepository;

    public InpatientPrescriptionSDJPaService(InpatientPrescriptionRepository inpatientPrescriptionRepository) {
        this.inpatientPrescriptionRepository = inpatientPrescriptionRepository;
    }

    @Override
    public Set<InpatientPrescriptions> findAll() {
        Set<InpatientPrescriptions> inpatientPrescriptions = new HashSet<>();
        inpatientPrescriptionRepository.findAll().forEach(inpatientPrescriptions::add);
        return null;
    }

    @Override
    public InpatientPrescriptions findByID(Long aLong) {
        return inpatientPrescriptionRepository.findById(aLong).get();
    }

    @Override
    public InpatientPrescriptions add(InpatientPrescriptions object) {
        return inpatientPrescriptionRepository.save(object);
    }

    @Override
    public void delete(InpatientPrescriptions object) {
        inpatientPrescriptionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        inpatientPrescriptionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InpatientPrescriptions object) {

    }
}
