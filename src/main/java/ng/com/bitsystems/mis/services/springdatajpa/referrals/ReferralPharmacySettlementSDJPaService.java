package ng.com.bitsystems.mis.services.springdatajpa.referrals;

import ng.com.bitsystems.mis.models.referrals.ReferralPharmacySettlement;
import ng.com.bitsystems.mis.repositories.referrals.ReferralPharmacySettlementRepository;
import ng.com.bitsystems.mis.services.referrals.ReferralPharmacySettlementService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ReferralPharmacySettlementSDJPaService implements ReferralPharmacySettlementService {

    private ReferralPharmacySettlementRepository referralPharmacySettlementRepository;

    public ReferralPharmacySettlementSDJPaService(ReferralPharmacySettlementRepository referralPharmacySettlementRepository) {
        this.referralPharmacySettlementRepository = referralPharmacySettlementRepository;
    }

    @Override
    public Set<ReferralPharmacySettlement> findAll() {
        Set<ReferralPharmacySettlement> referralPharmacySettlements = new HashSet<>();
        referralPharmacySettlementRepository.findAll().forEach(referralPharmacySettlements::add);
        return referralPharmacySettlements ;
    }

    @Override
    public ReferralPharmacySettlement findByID(Long aLong) {
        return referralPharmacySettlementRepository.findById(aLong).get();
    }

    @Override
    public ReferralPharmacySettlement add(ReferralPharmacySettlement object) {
        return referralPharmacySettlementRepository.save(object);
    }

    @Override
    public void delete(ReferralPharmacySettlement object) {
        referralPharmacySettlementRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        referralPharmacySettlementRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ReferralPharmacySettlement object) {

    }
}
