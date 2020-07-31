package ng.com.bitsystems.mis.models.laboratories;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LaboratoryInvestigations  extends BaseEntity {

    private ServicePriceCode servicePriceCode;
    private String title;
    private String desc;
    private Integer estimatedTurnaround;
    private Laboratories laboratories;
    private InvestigationType investigationType;
    private InvestigationGroups investigationGroups;
    private Set inventoryPerLaboratoryTransactions = new HashSet(0);
    private Set laboratoryPackageDetailses = new HashSet(0);
    private Set laboratoryInvestigationResultParameterses = new HashSet(0);
    private Set<Invoice> invoices= new HashSet<>();
    private Set<Transaction> transactions= new HashSet<>();

}


