package ng.com.bitsystems.mis.models.insurance;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Insurance extends BaseEntity {
    private Programs programs;
    private Integer percentageIncured;
}
