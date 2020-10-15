package ng.com.bitsystems.mis.services.springdatajpa.rewards.promos;

import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromoProductRecivedLogs;
import ng.com.bitsystems.mis.repositories.rewards.promos.PharmacyPromoProductReceivedLogsRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PharmacyPromoProductRecievedLogService implements ng.com.bitsystems.mis.services.rewards.promos.PharmacyPromoProductRecievedLogService {
    private PharmacyPromoProductReceivedLogsRepository receivedLogsRepository;

    public PharmacyPromoProductRecievedLogService(PharmacyPromoProductReceivedLogsRepository receivedLogsRepository) {
        this.receivedLogsRepository = receivedLogsRepository;
    }

    @Override
    public Set<PharmacyPromoProductRecivedLogs> findAll() {
        Set<PharmacyPromoProductRecivedLogs> recivedLogs = new HashSet<>();
        receivedLogsRepository.findAll().forEach(recivedLogs::add);
        return recivedLogs;
    }

    @Override
    public PharmacyPromoProductRecivedLogs findByID(Long aLong) {
        return receivedLogsRepository.findById(aLong).get();
    }

    @Override
    public PharmacyPromoProductRecivedLogs add(PharmacyPromoProductRecivedLogs object) {
        return receivedLogsRepository.save(object);
    }

    @Override
    public void delete(PharmacyPromoProductRecivedLogs object) {
        receivedLogsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        receivedLogsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PharmacyPromoProductRecivedLogs object) {

    }
}
