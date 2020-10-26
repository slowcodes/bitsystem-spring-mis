package ng.com.bitsystems.mis.command.accounts.payments.insurrance;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ProgramsCommand {
    private Long id;
    private String insuranceCompany;
    private Double serviceDiscount;
    private String companyEmail;
    private String companyPhone;
}
