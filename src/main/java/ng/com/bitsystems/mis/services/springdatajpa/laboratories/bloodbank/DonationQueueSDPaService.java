package ng.com.bitsystems.mis.services.springdatajpa.laboratories.bloodbank;

import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonationQueue;
import ng.com.bitsystems.mis.repositories.laboratories.bloodbank.DonationQueueRepository;
import ng.com.bitsystems.mis.services.laboratories.bloodbank.DonationQueueService;

import java.util.HashSet;
import java.util.Set;

public class DonationQueueSDPaService implements DonationQueueService {

    private DonationQueueRepository donationQueueRepository;

    public DonationQueueSDPaService(DonationQueueRepository donationQueueRepository) {
        this.donationQueueRepository = donationQueueRepository;
    }

    @Override
    public Set<DonationQueue> findAll() {
        Set<DonationQueue> donationQueues = new HashSet<>();
        donationQueueRepository.findAll().forEach(donationQueues::add);
        return donationQueues;
    }

    @Override
    public DonationQueue findByID(Long aLong) {
        return donationQueueRepository.findById(aLong).get();
    }

    @Override
    public DonationQueue add(DonationQueue object) {
        return donationQueueRepository.save(object);
    }

    @Override
    public void delete(DonationQueue object) {
        donationQueueRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        donationQueueRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(DonationQueue object) {

    }
}
