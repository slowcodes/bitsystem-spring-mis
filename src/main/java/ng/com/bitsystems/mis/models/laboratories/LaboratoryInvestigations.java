package ng.com.bitsystems.mis.models.laboratories;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.models.inventory.InventoryPerLaboratoryTransaction;
import ng.com.bitsystems.mis.models.invoice.LaboratoryInvoiceDetails;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;

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
    private String inv_desc;
    private Integer estimatedTurnaround;

    @Enumerated(value = EnumType.STRING)
    private InvestigationType investigationType;

    @ManyToMany
    @JoinTable(name = "laboratory_package_detail",
            joinColumns = @JoinColumn(name = "lab_id"),
            inverseJoinColumns = @JoinColumn(name = "package_id"))
    private Set<Packages> packages = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "laboratoryInvestigations")
    private Set<ExperimentParameters> experimentResultParameters = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "inv_grp_id")
    private InvestigationGroups investigationGroups;

    public LaboratoryInvestigations addExperimentParameter(ExperimentParameters experimentParameters) {
        this.experimentResultParameters.add(experimentParameters);
        experimentParameters.setLaboratoryInvestigations(this);
        return this;
    }

    public LaboratoryInvestigations addTransactions(LaboratoryTransactionDetail transaction) {
        return this;
    }

    public LaboratoryInvestigations addLabInvDetails(LaboratoryInvoiceDetails laboratoryInvoiceDetails) {
        return this;
    }

    public LaboratoryInvestigations addInvPerLabTxn(InventoryPerLaboratoryTransaction inventoryPerLaboratoryTransaction) {
        return this;
    }
}


