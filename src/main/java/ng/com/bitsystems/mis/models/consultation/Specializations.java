package ng.com.bitsystems.mis.models.consultation;

import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.AppUsers;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Specializations extends BaseEntity {

    private String specializationArea;
    private String specialistTitle;

    @ManyToMany(mappedBy = "specializations")
    private Set<AppUsers> consultants = new HashSet<>();
}
