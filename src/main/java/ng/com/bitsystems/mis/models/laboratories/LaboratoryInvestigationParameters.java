package ng.com.bitsystems.mis.models.laboratories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LaboratoryInvestigationParameters  extends BaseEntity {
     @ManyToOne
     @JoinColumn(name = "experimentReading_id")
     private ExperimentReadings experimentReadings;
     private String variableName;
     private String value;
}


