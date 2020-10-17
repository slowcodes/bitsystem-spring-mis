package ng.com.bitsystems.mis.command.pharmacy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SupplierCommand {
    private Long id;
    private String companyName;
    private String middleName;
    private String firstName;
    private String lastName;
    private String sex;
    private String email;
    private String phone;
}
