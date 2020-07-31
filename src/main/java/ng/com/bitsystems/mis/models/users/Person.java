package ng.com.bitsystems.mis.models.users;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "sex")
    private String sex;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile")
    private String phone;
    @Column(name = "dateCreated")
    private Date regDay;
    @Column(name = "status")
    private String status;
    @Column(name = "lastLoginDate")
    private Date lastLoginDay;

    public Person(Long id, String firstName, String lastName){
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
