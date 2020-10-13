package ng.com.bitsystems.mis.services.springdatajpa.referrals;

import ng.com.bitsystems.mis.models.referrals.ReferralBloodBankSettlement;
import ng.com.bitsystems.mis.repositories.referrals.ReferralBloodBankSettlementRepository;
import ng.com.bitsystems.mis.services.referrals.ReferralBloodBankSettlementService;

import java.util.HashSet;
import java.util.Set;

public class ReferralBloodBankSettlementSDJPaService implements ReferralBloodBankSettlementService {
    ReferralBloodBankSettlementRepository referralBloodBankSettlementRepository;

    public ReferralBloodBankSettlementSDJPaService(ReferralBloodBankSettlementRepository referralBloodBankSettlementRepository) {
        this.referralBloodBankSettlementRepository = referralBloodBankSettlementRepository;
    }

    @Override
    public Set<ReferralBloodBankSettlement> findAll() {
        Set<ReferralBloodBankSettlement> referralBloodBankSettlements=new HashSet<>();
        referralBloodBankSettlementRepository.findAll().forEach(referralBloodBankSettlements::add);
        return referralBloodBankSettlements;
    }

    @Override
    public ReferralBloodBankSettlement findByID(Long aLong) {
        return referralBloodBankSettlementRepository.findById(aLong).get();
    }

    @Override
    public ReferralBloodBankSettlement add(ReferralBloodBankSettlement object) {
        return referralBloodBankSettlementRepository.save(object);
    }

    @Override
    public void delete(ReferralBloodBankSettlement object) {
        referralBloodBankSettlementRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        referralBloodBankSettlementRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ReferralBloodBankSettlement object) {

    }
}
