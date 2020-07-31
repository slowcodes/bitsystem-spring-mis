package ng.com.bitsystems.mis.models.pharmacy;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class GeneratedAdministration extends BaseEntity {
    private PharmacyProducts pharmacyProducts;
    private Integer extimatedAdminTime;
}
