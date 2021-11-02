package ng.com.bitsystems.mis.models.consultation;


import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;


@Getter
@Setter
@Entity
public class SymptomsDirectory extends BaseEntity {

     private String symptoms;

}


