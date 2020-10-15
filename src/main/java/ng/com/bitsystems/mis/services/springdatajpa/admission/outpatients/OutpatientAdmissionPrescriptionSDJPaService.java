package ng.com.bitsystems.mis.services.springdatajpa.admission.outpatients;

import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptions;
import ng.com.bitsystems.mis.repositories.admissions.outpatients.OutpatientAdmissionPrescriptionRepository;
import ng.com.bitsystems.mis.services.admission.outpatients.OutpatientAdmissionPrescriptionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class OutpatientAdmissionPrescriptionSDJPaService implements OutpatientAdmissionPrescriptionService {
    private OutpatientAdmissionPrescriptionRepository outpatientAdmissionPrescriptionRepository;

    public OutpatientAdmissionPrescriptionSDJPaService(OutpatientAdmissionPrescriptionRepository outpatientAdmissionPrescriptionRepository) {
        this.outpatientAdmissionPrescriptionRepository = outpatientAdmissionPrescriptionRepository;
    }

    @Override
    public Set<OutpatientPrescriptions> findAll() {
        Set<OutpatientPrescriptions> outpatientPrescriptions = new HashSet<>();
        outpatientAdmissionPrescriptionRepository.findAll().forEach(outpatientPrescriptions::add);
        return outpatientPrescriptions;
    }

    @Override
    public OutpatientPrescriptions findByID(Long aLong) {
        return outpatientAdmissionPrescriptionRepository.findById(aLong).get();
    }

    @Override
    public OutpatientPrescriptions add(OutpatientPrescriptions object) {
        return outpatientAdmissionPrescriptionRepository.save(object);
    }

    @Override
    public void delete(OutpatientPrescriptions object) {
        outpatientAdmissionPrescriptionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        outpatientAdmissionPrescriptionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(OutpatientPrescriptions object) {

    }
}
