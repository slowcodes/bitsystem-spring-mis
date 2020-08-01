package ng.com.bitsystems.mis.models.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GeneratedAdministration extends BaseEntity {
    private PharmacyProducts pharmacyProducts;
    private Integer extimatedAdminTime;
}
