package ng.com.bitsystems.mis.services.springdatajpa.laboratories.bloodbank;

import ng.com.bitsystems.mis.models.laboratories.bloodbank.BleedingSchedule;
import ng.com.bitsystems.mis.repositories.laboratories.bloodbank.BleedingScheduleRepository;
import ng.com.bitsystems.mis.services.laboratories.bloodbank.BleedingScheduleService;

import java.util.HashSet;
import java.util.Set;

public class BleedingScheduleSDJPaService implements BleedingScheduleService {
    private BleedingScheduleRepository bleedingScheduleRepository;

    public BleedingScheduleSDJPaService(BleedingScheduleRepository bleedingScheduleRepository) {
        this.bleedingScheduleRepository = bleedingScheduleRepository;
    }

    @Override
    public Set<BleedingSchedule> findAll() {
        Set<BleedingSchedule> bleedingSchedules = new HashSet<>();
        bleedingScheduleRepository.findAll().forEach(bleedingSchedules::add);
        return bleedingSchedules;
    }

    @Override
    public BleedingSchedule findByID(Long aLong) {
        return bleedingScheduleRepository.findById(aLong).get();
    }

    @Override
    public BleedingSchedule add(BleedingSchedule object) {
        return bleedingScheduleRepository.save(object);
    }

    @Override
    public void delete(BleedingSchedule object) {
        bleedingScheduleRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        bleedingScheduleRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(BleedingSchedule object) {

    }
}
