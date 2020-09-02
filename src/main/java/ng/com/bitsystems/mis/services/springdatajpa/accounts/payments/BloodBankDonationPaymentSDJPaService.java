package ng.com.bitsystems.mis.services.springdatajpa.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.BloodbankDonationPayments;
import ng.com.bitsystems.mis.repositories.accounts.payments.BloodBankDonationPaymentRepository;
import ng.com.bitsystems.mis.services.accounts.payments.BloodBankDonationPaymentService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BloodBankDonationPaymentSDJPaService implements BloodBankDonationPaymentService {

    private BloodBankDonationPaymentRepository donationPaymentRepository;

    public BloodBankDonationPaymentSDJPaService(BloodBankDonationPaymentRepository donationPaymentRepository) {
        this.donationPaymentRepository = donationPaymentRepository;
    }

    @Override
    public Set<BloodbankDonationPayments> findAll() {
        Set<BloodbankDonationPayments> bloodbankDonationPayments = new HashSet<>();
        donationPaymentRepository.findAll().forEach(bloodbankDonationPayments::add);
        return bloodbankDonationPayments;
    }

    @Override
    public BloodbankDonationPayments findByID(Long aLong) {
        return donationPaymentRepository.findById(aLong).get();
    }

    @Override
    public BloodbankDonationPayments add(BloodbankDonationPayments object) {
        return donationPaymentRepository.save(object);
    }

    @Override
    public void delete(BloodbankDonationPayments object) {
        donationPaymentRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        donationPaymentRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(BloodbankDonationPayments object) {
        //pending implementation until command class are created
    }
}
