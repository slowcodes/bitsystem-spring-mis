package ng.com.bitsystems.mis.models.laboratories;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.models.inventory.InventoryPerLaboratoryTransaction;
import ng.com.bitsystems.mis.models.invoice.LaboratoryInvoiceDetails;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LaboratoryInvestigations  extends BaseEntity {

    @OneToOne
    private ServicePriceCode servicePriceCode;
    private String title;
    private String desc;
    private Integer estimatedTurnaround;

    @OneToOne
    private Laboratories laboratories;

    @Enumerated(value = EnumType.STRING)
    private InvestigationType investigationType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "laboratoryInvestigations")
    private Set<InventoryPerLaboratoryTransaction> inventoryPerLaboratoryTransactions = new HashSet<>();

    @OneToMany(mappedBy = "laboratoryInvestigations")
    private Set<LaboratoryPackageDetails> laboratoryPackageDetails= new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "laboratoryInvestigations")
    private Set<ExperimentParameters> experimentResultParameters = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "laboratoryInvestigations")
    private Set<LaboratoryInvoiceDetails> laboratoryInvoiceDetailsServices = new HashSet<>();

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "laboratoryInvestigations")
//    private Set<LaboratoryInvestigations> laboratoryInvestigations = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "investigationgroups_id")
    private InvestigationGroups investigationGroups;

    public LaboratoryInvestigations addInvPerLabTxn(InventoryPerLaboratoryTransaction
                                                            inventoryPerLaboratoryTransaction) {
        this.inventoryPerLaboratoryTransactions.add(inventoryPerLaboratoryTransaction);
        inventoryPerLaboratoryTransaction.setLaboratoryInvestigations(this);
        return this;
    }

    public LaboratoryInvestigations addLabInvDetails(LaboratoryInvoiceDetails laboratoryInvoiceDetails) {
        this.laboratoryInvoiceDetailsServices.add(laboratoryInvoiceDetails);
        laboratoryInvoiceDetails.setLaboratoryInvestigations(this);
        return this;
    }
}


