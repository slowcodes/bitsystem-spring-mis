package ng.com.bitsystems.mis.models.accounts.pricing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rate extends BaseEntity {

    @Column(name = "rate_type")
    @Enumerated(value = EnumType.STRING)
    private RateTypes rateTypes;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "service_description")
    private String service_description;

    private Double tax;

}
