package ng.com.bitsystems.mis.repositories.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.BloodbankDonationPayments;
import org.springframework.data.repository.CrudRepository;

public interface BloodBankDonationPaymentRepository
        extends CrudRepository<BloodbankDonationPayments, Long> {
}
