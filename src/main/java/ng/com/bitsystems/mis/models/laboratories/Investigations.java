package ng.com.bitsystems.mis.models.laboratories;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Investigations extends BaseEntity {

    @OneToOne
    private ServicePriceCode servicePriceCode;
    private String title;
    private String inv_desc;
    private Integer estimatedTurnaround;

    @Enumerated(value = EnumType.STRING)
    private InvestigationType investigationType;

    @JsonIgnore
    @ManyToMany(mappedBy = "investigations")
    private Set<LabPackages> labPackages = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "investigations")
    private Set<ExperimentParameters> experimentResultParameters = new HashSet<>();

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "inv_grp_id", insertable = false, updatable = false)
    private InvestigationGroups investigationGroups;

    public Investigations addExperimentParameter(ExperimentParameters experimentParameters) {
        this.experimentResultParameters.add(experimentParameters);
        experimentParameters.setInvestigations(this);
        return this;
    }

//    public Investigations addTransactions(LaboratoryTransactionDetail transaction) {
//        return this;
//    }
//
//    public Investigations addLabInvDetails(LaboratoryInvoiceDetails laboratoryInvoiceDetails) {
//        return this;
//    }
//
//    public Investigations addInvPerLabTxn(InventoryPerLaboratoryTransaction inventoryPerLaboratoryTransaction) {
//        return this;
//    }
}


