package ng.com.bitsystems.mis.services.springdatajpa.laboratories.bloodbank;

import ng.com.bitsystems.mis.models.laboratories.bloodbank.Donations;
import ng.com.bitsystems.mis.repositories.laboratories.bloodbank.DonationRepository;
import ng.com.bitsystems.mis.services.laboratories.bloodbank.DonationService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class DonationSDJPaService implements DonationService {
    private DonationRepository donationRepository;

    public DonationSDJPaService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Override
    public Set<Donations> findAll() {
        Set<Donations> donations = new HashSet<>();
        donationRepository.findAll().forEach(donations::add);
        return donations;
    }

    @Override
    public Donations findByID(Long aLong) {
        return donationRepository.findById(aLong).get();
    }

    @Override
    public Donations add(Donations object) {
        return donationRepository.save(object);
    }

    @Override
    public void delete(Donations object) {
        donationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        donationRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Donations object) {

    }
}
