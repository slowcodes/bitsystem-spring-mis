package ng.com.bitsystems.mis.models.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class AccountHolder extends Person {
    private String username;
    private String password;
    private String email;
    private byte[] signature;
    private String accountStatus;
    private byte[] image;
    private Date regDay;
    private String title;


}
