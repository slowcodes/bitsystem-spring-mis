package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments.insurance;

import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredConsultations;
import ng.com.bitsystems.mis.repositories.accounts.payments.insurance.InsuredConsultationRepository;
import ng.com.bitsystems.mis.services.accounts.payments.insurance.InsuredConsultationService;

import java.util.HashSet;
import java.util.Set;

public class InsuredConsultationTransactionSDJPaService implements InsuredConsultationService {

    private InsuredConsultationRepository insuredConsultationRepository;

    public InsuredConsultationTransactionSDJPaService(InsuredConsultationRepository insuredConsultationRepository) {
        this.insuredConsultationRepository = insuredConsultationRepository;
    }

    @Override
    public Set<InsuredConsultations> findAll() {
        Set<InsuredConsultations> insuredConsultations = new HashSet<>();
        insuredConsultationRepository.findAll().forEach(insuredConsultations::add);
        return insuredConsultations;
    }

    @Override
    public InsuredConsultations findByID(Long aLong) {
        return insuredConsultationRepository.findById(aLong).get();
    }

    @Override
    public InsuredConsultations add(InsuredConsultations object) {
        return insuredConsultationRepository.save(object);
    }

    @Override
    public void delete(InsuredConsultations object) {
        insuredConsultationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        insuredConsultationRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InsuredConsultations object) {

    }
}
