package ng.com.bitsystems.mis.models.invoice;

import lombok.*;
import ng.com.bitsystems.mis.models.accounts.OtherServices;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class OtherServiceInvoiceDetails extends OtherServices {
    private String status;
}
