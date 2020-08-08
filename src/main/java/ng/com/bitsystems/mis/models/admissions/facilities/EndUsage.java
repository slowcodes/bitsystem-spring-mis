package ng.com.bitsystems.mis.models.admissions.facilities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EndUsage extends BaseEntity {

    @OneToOne
    private StartUsage startUsage;

    private LocalDateTime stopTime;

    private String comment;
}
