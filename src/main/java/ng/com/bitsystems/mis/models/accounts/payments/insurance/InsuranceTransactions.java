package ng.com.bitsystems.mis.models.accounts.payments.insurance;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class InsuranceTransactions extends BaseEntity {
    private Programs programs;
    private Integer percentageIncured;
}
