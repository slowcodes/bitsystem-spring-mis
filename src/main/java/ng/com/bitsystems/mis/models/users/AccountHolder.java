package ng.com.bitsystems.mis.models.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AccountHolder extends BaseEntity {
    private String username;
    private String password;
    private byte[] signature;
    @OneToOne
    private AppUsers usersId;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    private LocalDateTime lastLoginDate;
}
