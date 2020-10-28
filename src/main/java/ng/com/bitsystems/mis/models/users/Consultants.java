package ng.com.bitsystems.mis.models.users;

import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.models.consultation.BookConsultation;
import ng.com.bitsystems.mis.models.consultation.Specializations;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Consultants extends Person {

    @ManyToMany
    @JoinTable(name = "consultants_specializations",
            joinColumns = @JoinColumn(name = "consultants_id"),
            inverseJoinColumns = @JoinColumn(name = "specializations_id"))
    private Set<Specializations> specializations = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    private ServicePriceCode consultation_fee;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consultants")
    private Set<BookConsultation> bookConsultations = new HashSet<>();
}
