package ng.com.bitsystems.mis.models.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AccountHolder extends BaseEntity {
    private String username;
    private String password;
    private String email;
    private byte[] signature;
    private String accountStatus;
    private byte[] image;
    private String title;
    private LocalDateTime lastLoginDate;


    //private Set<Users> users = new HashSet<>();
}
