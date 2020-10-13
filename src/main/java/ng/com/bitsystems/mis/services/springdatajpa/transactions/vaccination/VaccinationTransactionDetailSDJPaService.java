package ng.com.bitsystems.mis.services.springdatajpa.transactions.vaccination;

import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;
import ng.com.bitsystems.mis.repositories.transactions.vaccinations.VaccinationTransactionDetailsRepository;
import ng.com.bitsystems.mis.services.transactions.vaccination.VaccinationTransactionDetailService;

import java.util.HashSet;
import java.util.Set;

public class VaccinationTransactionDetailSDJPaService implements VaccinationTransactionDetailService {

    private VaccinationTransactionDetailsRepository transactionDetailsRepository;

    public VaccinationTransactionDetailSDJPaService(VaccinationTransactionDetailsRepository transactionDetailsRepository) {
        this.transactionDetailsRepository = transactionDetailsRepository;
    }

    @Override
    public Set<VaccinationTransactionsDetails> findAll() {
        Set<VaccinationTransactionsDetails> vaccinationTransactionsDetails=new HashSet<>();
        return vaccinationTransactionsDetails;
    }

    @Override
    public VaccinationTransactionsDetails findByID(Long aLong) {
        return transactionDetailsRepository.findById(aLong).get();
    }

    @Override
    public VaccinationTransactionsDetails add(VaccinationTransactionsDetails object) {
        return transactionDetailsRepository.save(object);
    }

    @Override
    public void delete(VaccinationTransactionsDetails object) {
        transactionDetailsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        transactionDetailsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(VaccinationTransactionsDetails object) {

    }
}
