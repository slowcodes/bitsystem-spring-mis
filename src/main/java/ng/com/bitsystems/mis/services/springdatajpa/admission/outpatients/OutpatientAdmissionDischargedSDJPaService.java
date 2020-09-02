package ng.com.bitsystems.mis.services.springdatajpa.admission.outpatients;

import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmissionDischarged;
import ng.com.bitsystems.mis.repositories.admissions.outpatients.OutpatientAdmissionDischargedRepository;
import ng.com.bitsystems.mis.services.admission.outpatients.OutpatientAdmissionDischargedService;

import java.util.HashSet;
import java.util.Set;

public class OutpatientAdmissionDischargedSDJPaService implements OutpatientAdmissionDischargedService {
    private OutpatientAdmissionDischargedRepository dischargedRepository;

    public OutpatientAdmissionDischargedSDJPaService(OutpatientAdmissionDischargedRepository dischargedRepository) {
        this.dischargedRepository = dischargedRepository;
    }

    @Override
    public Set<OutpatientAdmissionDischarged> findAll() {
        Set<OutpatientAdmissionDischarged> admissionDischarged = new HashSet<>();
        dischargedRepository.findAll().forEach(admissionDischarged::add);

        return admissionDischarged;
    }

    @Override
    public OutpatientAdmissionDischarged findByID(Long aLong) {
        return dischargedRepository.findById(aLong).get();
    }

    @Override
    public OutpatientAdmissionDischarged add(OutpatientAdmissionDischarged object) {
        return dischargedRepository.save(object);
    }

    @Override
    public void delete(OutpatientAdmissionDischarged object) {
        dischargedRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        dischargedRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(OutpatientAdmissionDischarged object) {

    }
}
