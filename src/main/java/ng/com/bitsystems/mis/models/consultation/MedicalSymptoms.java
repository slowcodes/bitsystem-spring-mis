package ng.com.bitsystems.mis.models.consultation;


import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class MedicalSymptoms extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "specializationId")
    private Specializations specializations;

    private String symptoms;
}
