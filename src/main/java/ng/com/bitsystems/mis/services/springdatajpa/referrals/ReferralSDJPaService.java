package ng.com.bitsystems.mis.services.springdatajpa.referrals;

import ng.com.bitsystems.mis.models.referrals.Referrals;
import ng.com.bitsystems.mis.repositories.referrals.ReferralRepository;
import ng.com.bitsystems.mis.services.referrals.ReferralService;

import java.util.HashSet;
import java.util.Set;

public class ReferralSDJPaService implements ReferralService {
    private ReferralRepository referralRepository;

    public ReferralSDJPaService(ReferralRepository referralRepository) {
        this.referralRepository = referralRepository;
    }

    @Override
    public Set<Referrals> findAll() {
        Set<Referrals> referrals = new HashSet<>();
        referralRepository.findAll().forEach(referrals::add);
        return referrals;
    }

    @Override
    public Referrals findByID(Long aLong) {
        return referralRepository.findById(aLong).get();
    }

    @Override
    public Referrals add(Referrals object) {
        return referralRepository.save(object);
    }

    @Override
    public void delete(Referrals object) {
        referralRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        referralRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Referrals object) {

    }
}
