package ng.com.bitsystems.mis.services.accounts.payments;

import ng.com.bitsystems.mis.models.accounts.payments.Payments;
import ng.com.bitsystems.mis.services.CrudService;
import org.springframework.stereotype.Service;

@Service
public interface PaymentsService extends CrudService<Payments, Long> {
}
