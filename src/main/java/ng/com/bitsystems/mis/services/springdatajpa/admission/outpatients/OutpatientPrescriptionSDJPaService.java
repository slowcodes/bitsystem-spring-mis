package ng.com.bitsystems.mis.services.springdatajpa.admission.outpatients;

import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptions;
import ng.com.bitsystems.mis.repositories.admissions.outpatients.OutpatientPrescriptionsRepository;
import ng.com.bitsystems.mis.services.admission.outpatients.OutpatientPrescriptionService;

import java.util.HashSet;
import java.util.Set;

public class OutpatientPrescriptionSDJPaService implements OutpatientPrescriptionService {
    private OutpatientPrescriptionsRepository prescriptionsRepository;

    public OutpatientPrescriptionSDJPaService(OutpatientPrescriptionsRepository prescriptionsRepository) {
        this.prescriptionsRepository = prescriptionsRepository;
    }

    @Override
    public Set<OutpatientPrescriptions> findAll() {
        Set<OutpatientPrescriptions> outpatientPrescriptions = new HashSet<>();
        prescriptionsRepository.findAll().forEach(outpatientPrescriptions::add);
        return outpatientPrescriptions;
    }

    @Override
    public OutpatientPrescriptions findByID(Long aLong) {
        return prescriptionsRepository.findById(aLong).get();
    }

    @Override
    public OutpatientPrescriptions add(OutpatientPrescriptions object) {
        return prescriptionsRepository.save(object);
    }

    @Override
    public void delete(OutpatientPrescriptions object) {
        prescriptionsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        prescriptionsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(OutpatientPrescriptions object) {

    }
}
