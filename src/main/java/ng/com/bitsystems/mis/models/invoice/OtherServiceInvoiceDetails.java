package ng.com.bitsystems.mis.models.invoice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.OtherServices;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OtherServiceInvoiceDetails extends OtherServices {
    private String status;
}
