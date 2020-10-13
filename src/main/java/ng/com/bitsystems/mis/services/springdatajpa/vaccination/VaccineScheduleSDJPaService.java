package ng.com.bitsystems.mis.services.springdatajpa.vaccination;

import ng.com.bitsystems.mis.models.vaccination.VaccineSchedule;
import ng.com.bitsystems.mis.repositories.vaccinations.VaccineScheduleRepository;
import ng.com.bitsystems.mis.services.vaccination.VaccineScheduleService;

import java.util.HashSet;
import java.util.Set;

public class VaccineScheduleSDJPaService implements VaccineScheduleService {

    private VaccineScheduleRepository vaccineScheduleRepository;

    public VaccineScheduleSDJPaService(VaccineScheduleRepository vaccineScheduleRepository) {
        this.vaccineScheduleRepository = vaccineScheduleRepository;
    }

    @Override
    public Set<VaccineSchedule> findAll() {
        Set<VaccineSchedule> vaccineSchedules = new HashSet<>();
        vaccineScheduleRepository.findAll().forEach(vaccineSchedules::add);
        return vaccineSchedules;
    }

    @Override
    public VaccineSchedule findByID(Long aLong) {
        return vaccineScheduleRepository.findById(aLong).get();
    }

    @Override
    public VaccineSchedule add(VaccineSchedule object) {
        return vaccineScheduleRepository.save(object);
    }

    @Override
    public void delete(VaccineSchedule object) {
        vaccineScheduleRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vaccineScheduleRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(VaccineSchedule object) {

    }
}
