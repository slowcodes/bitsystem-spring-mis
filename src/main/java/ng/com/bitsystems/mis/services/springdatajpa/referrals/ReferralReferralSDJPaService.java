package ng.com.bitsystems.mis.services.springdatajpa.referrals;

import ng.com.bitsystems.mis.repositories.referrals.ReferralReferralRepository;
import ng.com.bitsystems.mis.services.referrals.ReferralReferralService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ReferralReferralSDJPaService implements ReferralReferralService {
    private ReferralReferralRepository referralReferralRepository;

    public ReferralReferralSDJPaService(ReferralReferralRepository referralReferralRepository) {
        this.referralReferralRepository = referralReferralRepository;
    }

    @Override
    public Set<ReferralsReferal> findAll() {
        Set<ReferralsReferal> referralsReferals = new HashSet<>();
        referralReferralRepository.findAll().forEach(referralsReferals::add);
        return referralsReferals;
    }

    @Override
    public ReferralsReferal findByID(Long aLong) {
        return referralReferralRepository.findById(aLong).get();
    }

    @Override
    public ReferralsReferal add(ReferralsReferal object) {
        return referralReferralRepository.save(object);
    }

    @Override
    public void delete(ReferralsReferal object) {
        referralReferralRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        referralReferralRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(ReferralsReferal object) {

    }
}
