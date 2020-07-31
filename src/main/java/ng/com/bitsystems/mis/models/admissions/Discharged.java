package ng.com.bitsystems.mis.models.admissions;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Discharged extends BaseEntity {

    private Users users;
    private Integer dateDischarged;
    private Integer comment;
}
