package ng.com.bitsystems.mis.services.springdatajpa.pharmacy;

import ng.com.bitsystems.mis.models.pharmacy.PrescriptionSchedule;
import ng.com.bitsystems.mis.repositories.pharmacy.PrescriptionScheduleRepository;
import ng.com.bitsystems.mis.services.pharmacy.PrescriptionScheduleService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PrecriptionScheduleSDJPaService implements PrescriptionScheduleService {
    private PrescriptionScheduleRepository prescriptionScheduleRepository;

    public PrecriptionScheduleSDJPaService(PrescriptionScheduleRepository prescriptionScheduleRepository) {
        this.prescriptionScheduleRepository = prescriptionScheduleRepository;
    }

    @Override
    public Set<PrescriptionSchedule> findAll() {
        Set<PrescriptionSchedule> prescriptionSchedules = new HashSet<>();
        prescriptionScheduleRepository.findAll().forEach(prescriptionSchedules::add);
        return prescriptionSchedules;
    }

    @Override
    public PrescriptionSchedule findByID(Long aLong) {
        return prescriptionScheduleRepository.findById(aLong).get();
    }

    @Override
    public PrescriptionSchedule add(PrescriptionSchedule object) {
        return prescriptionScheduleRepository.save(object);
    }

    @Override
    public void delete(PrescriptionSchedule object) {
        prescriptionScheduleRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        prescriptionScheduleRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PrescriptionSchedule object) {

    }
}
