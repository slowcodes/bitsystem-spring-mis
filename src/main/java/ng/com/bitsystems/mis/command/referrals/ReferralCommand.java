package ng.com.bitsystems.mis.command.referrals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ReferralCommand {
    private Long id;
    private String middleName;
    private String firstName;
    private String lastName;
    private String sex;
    private String email;
    private String phone;
    private String organisation;
    private String bank;
    private String account;
}
