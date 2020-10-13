package ng.com.bitsystems.mis.services.springdatajpa.vaccination;

import ng.com.bitsystems.mis.models.vaccination.VaccineDoses;
import ng.com.bitsystems.mis.repositories.vaccinations.VaccineDosageRepository;
import ng.com.bitsystems.mis.services.vaccination.VaccineDoseService;

import java.util.HashSet;
import java.util.Set;

public class VaccineDoseSDJPaService implements VaccineDoseService {

    private VaccineDosageRepository vaccineDosageRepository;

    public VaccineDoseSDJPaService(VaccineDosageRepository vaccineDosageRepository) {
        this.vaccineDosageRepository = vaccineDosageRepository;
    }

    @Override
    public Set<VaccineDoses> findAll() {
        Set<VaccineDoses> vaccineDoses = new HashSet<>();
        vaccineDosageRepository.findAll().forEach(vaccineDoses::add);
        return vaccineDoses;
    }

    @Override
    public VaccineDoses findByID(Long aLong) {
        return vaccineDosageRepository.findById(aLong).get();
    }

    @Override
    public VaccineDoses add(VaccineDoses object) {
        return vaccineDosageRepository.save(object);
    }

    @Override
    public void delete(VaccineDoses object) {
        vaccineDosageRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vaccineDosageRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(VaccineDoses object) {

    }
}
