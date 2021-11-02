package ng.com.bitsystems.mis.command.referrals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.Sales;
import ng.com.bitsystems.mis.models.transactions.ServiceTransaction;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class ReferralCommand {
    private Long id;
    private String middleName;
    private Long referral_id;
    private String firstName;
    private String lastName;
    private String sex;
    private String email;
    private String phone;
    private String organisation;
    private String bank;
    private String account;
    private Set<ServiceTransaction> services= new HashSet<>();
    private Set<Sales> sales = new HashSet<>();
}
