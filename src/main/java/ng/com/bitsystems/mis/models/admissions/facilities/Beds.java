package ng.com.bitsystems.mis.models.admissions.facilities;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Beds extends Facilities {

     @Enumerated(value = EnumType.STRING)
     private BedCategory bedCategory;

     @ManyToOne
     @JoinColumn(name = "wards_id")
     private Wards ward;
}


