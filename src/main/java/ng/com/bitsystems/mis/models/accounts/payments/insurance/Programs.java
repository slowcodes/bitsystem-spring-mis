package ng.com.bitsystems.mis.models.accounts.payments.insurance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Programs extends BaseEntity {
     @Column(name="insurance_company")
     private String insuranceCompany;

     @Column(name="service_discount")
     private Double serviceDiscount;

     @Column(name="company_email")
     private String companyEmail;

     @Column(name="company_phone")
     private Integer companyPhone;
}


