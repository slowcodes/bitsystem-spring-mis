package ng.com.bitsystems.mis.services.springdatajpa.referrals;

import ng.com.bitsystems.mis.models.referrals.ReferralVaccinationSettlement;
import ng.com.bitsystems.mis.repositories.referrals.ReferralVaccinationSettlementRepository;
import ng.com.bitsystems.mis.services.referrals.ReferralVaccinationSettlementService;

import java.util.HashSet;
import java.util.Set;

public class ReferralVaccinationSettlementSDPJaService implements ReferralVaccinationSettlementService {

    private ReferralVaccinationSettlementRepository referralVaccinationSettlementRepository;

    public ReferralVaccinationSettlementSDPJaService(ReferralVaccinationSettlementRepository referralVaccinationSettlementRepository) {
        this.referralVaccinationSettlementRepository = referralVaccinationSettlementRepository;
    }

    @Override
    public Set<ReferralVaccinationSettlement> findAll() {
        Set<ReferralVaccinationSettlement> referralVaccinationSettlements = new HashSet<>();
        referralVaccinationSettlementRepository.findAll().forEach(referralVaccinationSettlements::add);
        return referralVaccinationSettlements;
    }

    @Override
    public ReferralVaccinationSettlement findByID(Long aLong) {
        return referralVaccinationSettlementRepository.findById(aLong).get();
    }

    @Override
    public ReferralVaccinationSettlement add(ReferralVaccinationSettlement object) {
        return referralVaccinationSettlementRepository.save(object);
    }

    @Override
    public void delete(ReferralVaccinationSettlement object) {
        referralVaccinationSettlementRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        referralVaccinationSettlementRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ReferralVaccinationSettlement object) { }
}
