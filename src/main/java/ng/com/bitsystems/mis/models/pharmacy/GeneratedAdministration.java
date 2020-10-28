package ng.com.bitsystems.mis.models.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GeneratedAdministration extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "pharmacyproduct_id")
    private PharmacyProducts pharmacyProducts;
    private LocalDateTime extimatedAdminTime;
}
