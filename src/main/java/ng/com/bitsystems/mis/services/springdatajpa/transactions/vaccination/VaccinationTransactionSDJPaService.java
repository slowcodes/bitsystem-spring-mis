package ng.com.bitsystems.mis.services.springdatajpa.transactions.vaccination;

import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;
import ng.com.bitsystems.mis.repositories.transactions.vaccinations.VaccinationTransactionRepository;
import ng.com.bitsystems.mis.services.transactions.vaccination.VaccinationTransactionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VaccinationTransactionSDJPaService implements VaccinationTransactionService {

    private VaccinationTransactionRepository vaccinationTransactionRepository;

    public VaccinationTransactionSDJPaService(VaccinationTransactionRepository vaccinationTransactionRepository) {
        this.vaccinationTransactionRepository = vaccinationTransactionRepository;
    }

    @Override
    public Set<VaccinationTransaction> findAll() {
        Set<VaccinationTransaction> vaccinationTransactions= new HashSet<>();
        vaccinationTransactionRepository.findAll().forEach(vaccinationTransactions::add);
        return vaccinationTransactions;
    }

    @Override
    public VaccinationTransaction findByID(Long aLong) {
        return vaccinationTransactionRepository.findById(aLong).get();
    }

    @Override
    public VaccinationTransaction add(VaccinationTransaction object) {
        return vaccinationTransactionRepository.save(object);
    }

    @Override
    public void delete(VaccinationTransaction object) {
        vaccinationTransactionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vaccinationTransactionRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(VaccinationTransaction object) {

    }
}
