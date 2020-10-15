package ng.com.bitsystems.mis.services.springdatajpa.laboratories.bloodbank;

import ng.com.bitsystems.mis.models.laboratories.bloodbank.IssuanceLogs;
import ng.com.bitsystems.mis.repositories.laboratories.bloodbank.IssuanceLogRepository;
import ng.com.bitsystems.mis.services.laboratories.bloodbank.IssuanceLogService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class IssueanceLogSDJPaService implements IssuanceLogService {

    private IssuanceLogRepository issuanceLogRepository;

    public IssueanceLogSDJPaService(IssuanceLogRepository issuanceLogRepository) {
        this.issuanceLogRepository = issuanceLogRepository;
    }

    @Override
    public Set<IssuanceLogs> findAll() {
        Set<IssuanceLogs> issuanceLogs = new HashSet<>();
        issuanceLogRepository.findAll().forEach(issuanceLogs::add);
        return issuanceLogs;
    }

    @Override
    public IssuanceLogs findByID(Long aLong) {
        return issuanceLogRepository.findById(aLong).get();
    }

    @Override
    public IssuanceLogs add(IssuanceLogs object) {
        return issuanceLogRepository.save(object);
    }

    @Override
    public void delete(IssuanceLogs object) {
        issuanceLogRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        issuanceLogRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(IssuanceLogs object) {

    }
}
