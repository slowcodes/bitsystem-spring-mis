package ng.com.bitsystems.mis.services.springdatajpa.referrals;

import ng.com.bitsystems.mis.models.referrals.ReferralSettlements;
import ng.com.bitsystems.mis.repositories.referrals.ReferralSettlementRepository;
import ng.com.bitsystems.mis.services.referrals.ReferralSettlementService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ReferralSettlementSDJPaService implements ReferralSettlementService {
    private ReferralSettlementRepository referralSettlementRepository;

    public ReferralSettlementSDJPaService(ReferralSettlementRepository referralSettlementRepository) {
        this.referralSettlementRepository = referralSettlementRepository;
    }

    @Override
    public Set<ReferralSettlements> findAll() {
        Set<ReferralSettlements> referralSettlements = new HashSet<>();
        referralSettlementRepository.findAll().forEach(referralSettlements::add);

        return referralSettlements;
    }

    @Override
    public ReferralSettlements findByID(Long aLong) {
        return referralSettlementRepository.findById(aLong).get();
    }

    @Override
    public ReferralSettlements add(ReferralSettlements object) {
        return referralSettlementRepository.save(object);
    }

    @Override
    public void delete(ReferralSettlements object) {
        referralSettlementRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        referralSettlementRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ReferralSettlements object) {

    }
}
