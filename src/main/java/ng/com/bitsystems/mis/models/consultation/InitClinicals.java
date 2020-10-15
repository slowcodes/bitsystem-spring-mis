package ng.com.bitsystems.mis.models.consultation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class InitClinicals  extends BaseEntity {
    private String presentingComplaints;
    private String historyPresentingComplaints;
    private String clinicalExamination;
    private Integer provisionalDiagnosis;
}
