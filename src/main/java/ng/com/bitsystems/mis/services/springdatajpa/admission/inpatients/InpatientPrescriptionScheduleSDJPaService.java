package ng.com.bitsystems.mis.services.springdatajpa.admission.inpatients;

import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionSchedule;
import ng.com.bitsystems.mis.repositories.admissions.inpatients.InpatientPrescriptionScheduleRepository;
import ng.com.bitsystems.mis.services.admission.inpatients.InpatientPrescriptionScheduleService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class InpatientPrescriptionScheduleSDJPaService implements InpatientPrescriptionScheduleService {
    private InpatientPrescriptionScheduleRepository prescriptionScheduleRepository;

    public InpatientPrescriptionScheduleSDJPaService(InpatientPrescriptionScheduleRepository prescriptionScheduleRepository) {
        this.prescriptionScheduleRepository = prescriptionScheduleRepository;
    }

    @Override
    public Set<InpatientPrescriptionSchedule> findAll() {
        Set<InpatientPrescriptionSchedule> inpatientPrescriptionSchedules = new HashSet<>();
        prescriptionScheduleRepository.findAll().forEach(inpatientPrescriptionSchedules::add);
        return inpatientPrescriptionSchedules;
    }

    @Override
    public InpatientPrescriptionSchedule findByID(Long aLong) {
        return prescriptionScheduleRepository.findById(aLong).get();
    }

    @Override
    public InpatientPrescriptionSchedule add(InpatientPrescriptionSchedule object) {
        return prescriptionScheduleRepository.save(object);
    }

    @Override
    public void delete(InpatientPrescriptionSchedule object) {
        prescriptionScheduleRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        prescriptionScheduleRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InpatientPrescriptionSchedule object) {

    }
}
