package ng.com.bitsystems.mis.models.transactions.laboratory;


import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.laboratories.Investigations;
import ng.com.bitsystems.mis.models.laboratories.LabPackages;
import ng.com.bitsystems.mis.models.transactions.ServiceDetailPricing;

import javax.persistence.*;
@Getter
@Setter
@MappedSuperclass
public class BaseLabTxnDetail extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "labInvestigationId")
    private Investigations investigations;

    @ManyToOne
    @JoinColumn(name = "packageId")
    private LabPackages labPackages;

    @OneToOne(cascade = CascadeType.PERSIST)
    private ServiceDetailPricing serviceDetailPricing;
}
