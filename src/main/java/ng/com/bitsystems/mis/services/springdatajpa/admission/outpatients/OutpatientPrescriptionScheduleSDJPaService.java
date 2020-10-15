package ng.com.bitsystems.mis.services.springdatajpa.admission.outpatients;

import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptionSchedule;
import ng.com.bitsystems.mis.repositories.admissions.outpatients.OutpatientPrescriptionScheduleRepository;
import ng.com.bitsystems.mis.services.admission.outpatients.OutpatientPrescriptionScheduleService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class OutpatientPrescriptionScheduleSDJPaService implements OutpatientPrescriptionScheduleService {
    private OutpatientPrescriptionScheduleRepository prescriptionScheduleRepository;

    public OutpatientPrescriptionScheduleSDJPaService(OutpatientPrescriptionScheduleRepository prescriptionScheduleRepository) {
        this.prescriptionScheduleRepository = prescriptionScheduleRepository;
    }

    @Override
    public Set<OutpatientPrescriptionSchedule> findAll() {
        Set<OutpatientPrescriptionSchedule> outpatientPrescriptionSchedules = new HashSet<>();
        prescriptionScheduleRepository.findAll().forEach(outpatientPrescriptionSchedules::add);
        return outpatientPrescriptionSchedules;
    }

    @Override
    public OutpatientPrescriptionSchedule findByID(Long aLong) {
        return prescriptionScheduleRepository.findById(aLong).get();
    }

    @Override
    public OutpatientPrescriptionSchedule add(OutpatientPrescriptionSchedule object) {
        return prescriptionScheduleRepository.save(object);
    }

    @Override
    public void delete(OutpatientPrescriptionSchedule object) {
        prescriptionScheduleRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        prescriptionScheduleRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(OutpatientPrescriptionSchedule object) {

    }
}
