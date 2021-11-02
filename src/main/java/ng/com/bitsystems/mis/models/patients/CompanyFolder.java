package ng.com.bitsystems.mis.models.patients;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.payments.CompanyPayments;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CompanyFolder extends BaseEntity {
    private String companyName;
    private String address;
    private String phone;
    private String email;

    @ManyToMany
    @JoinTable(name = "company_patients",
            joinColumns = @JoinColumn(name = "patients_id"),
            inverseJoinColumns = @JoinColumn(name = "companies_id"))
    private Set<Patients> patients = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<CompanyPayments> companyPayments = new HashSet<>();

    public CompanyFolder addCompanyPayments(CompanyPayments companyPayments) {
        this.companyPayments.add(companyPayments);
        companyPayments.setCompany(this);
        return this;
    }
}
