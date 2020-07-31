package ng.com.bitsystems.mis.models.pharmacy;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.MappedSuperclass;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Prescription extends BaseEntity {
    private PharmacyProducts pharmacyProducts;
    private Users users;
    private Date form;
    private String administrationMode;
    private int duration;
    private int frequency;
    private int dose;
    private String measure;
}
