package ng.com.bitsystems.mis.models.users;

import lombok.*;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class AccountHolder extends Person {
    private String username;
    private String password;
    private String email;
    private byte[] signature;
    private String accountStatus;
}
