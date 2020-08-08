package ng.com.bitsystems.mis.models.admissions.facilities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FacilityTypeCategory extends BaseEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facilityTypeCategory")
    private Set<Facilities> facilities = new HashSet<>();

    private String category;
}
