package ng.com.bitsystems.mis.models.laboratories;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryServiceTransactionDetail;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Results extends BaseEntity {
    LaboratoryServiceTransactionDetail laboratoryTransactionDetail;
    private int user;
    private String footNote;
    private Date logTime;
    private String resultNote;
    private String commentColor;
    private String signatoryColor;
    private Set laboratoryInvestigationResultVerifieds = new HashSet(0);
    private Set laboratoryInvestigationResultCollectionLogses = new HashSet(0);
}
