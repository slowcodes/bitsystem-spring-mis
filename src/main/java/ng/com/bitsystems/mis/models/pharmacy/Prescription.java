package ng.com.bitsystems.mis.models.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.AppUsers;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Prescription extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "pharmacyproducts_id")
    private PharmacyProducts pharmacyProducts;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private AppUsers appUsers;

    @Enumerated(value = EnumType.STRING)
    private Form form;
    private String administrationMode;

    private int duration;

    private int frequency;
    private int dose;
    private String measure;

    @OneToMany(mappedBy = "prescription", cascade = CascadeType.ALL)
    private Set<PrescriptionSchedule> prescriptionSchedules = new HashSet<>();

    public Prescription addSchedule(PrescriptionSchedule prescriptionSchedule) {
        this.prescriptionSchedules.add(prescriptionSchedule);
        prescriptionSchedule.setPrescription(this);
        return this;
    }
}
