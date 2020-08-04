package ng.com.bitsystems.mis.models.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Prescription extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "pharmacyproducts_id")
    private PharmacyProducts pharmacyProducts;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    @Enumerated(value = EnumType.STRING)
    private Form form;
    private String administrationMode;

    private int duration;

    private int frequency;
    private int dose;
    private String measure;
}
