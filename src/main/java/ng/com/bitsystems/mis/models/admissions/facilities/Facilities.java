package ng.com.bitsystems.mis.models.admissions.facilities;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.Rate;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Facilities extends BaseEntity {
    private Wards wards;
    private String locationDescription;
    private Rate rate;
}
