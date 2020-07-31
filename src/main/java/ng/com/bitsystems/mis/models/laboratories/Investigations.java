package ng.com.bitsystems.mis.models.laboratories;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.MappedSuperclass;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Investigations extends BaseEntity {

    private ServicePriceCode servicePriceCode;
    private String title;
    private String desc;
    private Integer estimatedTurnaround;
    private Set<Invoice> invoices= new HashSet<>();
    private Set<Transaction> transactions= new HashSet<>();

}
