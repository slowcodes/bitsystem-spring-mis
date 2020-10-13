package ng.com.bitsystems.mis.services.springdatajpa.referrals;

import ng.com.bitsystems.mis.models.referrals.ReferralLaboratorySettlements;
import ng.com.bitsystems.mis.repositories.referrals.ReferralLaboratorySettlementRepository;
import ng.com.bitsystems.mis.services.referrals.ReferralLaboratorySettlementService;

import java.util.HashSet;
import java.util.Set;

public class ReferralLaboratorySettlementSDJPaService implements ReferralLaboratorySettlementService {
    private ReferralLaboratorySettlementRepository referralLaboratorySettlementRepository;

    public ReferralLaboratorySettlementSDJPaService(ReferralLaboratorySettlementRepository referralLaboratorySettlementRepository) {
        this.referralLaboratorySettlementRepository = referralLaboratorySettlementRepository;
    }

    @Override
    public Set<ReferralLaboratorySettlements> findAll() {
        Set<ReferralLaboratorySettlements> referralLaboratorySettlements=new HashSet<>();
        referralLaboratorySettlementRepository.findAll().forEach(referralLaboratorySettlements::add);
        return referralLaboratorySettlements;
    }

    @Override
    public ReferralLaboratorySettlements findByID(Long aLong) {
        return referralLaboratorySettlementRepository.findById(aLong).get();
    }

    @Override
    public ReferralLaboratorySettlements add(ReferralLaboratorySettlements object) {
        return referralLaboratorySettlementRepository.save(object);
    }

    @Override
    public void delete(ReferralLaboratorySettlements object) {
        referralLaboratorySettlementRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        referralLaboratorySettlementRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ReferralLaboratorySettlements object) {

    }
}
