package ng.com.bitsystems.mis.models.consultation;

import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Consultants;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Specializations extends BaseEntity {
    private String specialization;

    @ManyToMany(mappedBy = "specializations")
    private Set<Consultants> consultants = new HashSet<>();
}
