package ng.com.bitsystems.mis.models.accounts.pricing;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Rate extends BaseEntity {
    private RateTypes rateTypes;
    private Double cost;
}
