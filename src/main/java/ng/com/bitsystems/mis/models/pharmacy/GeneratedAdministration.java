package ng.com.bitsystems.mis.models.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@MappedSuperclass
public class GeneratedAdministration extends BaseEntity {

//    @ManyToOne
//    @JoinColumn(name = "presc_id")
//    private Prescription prescription;

    private LocalDateTime extimatedAdminTime;
}
