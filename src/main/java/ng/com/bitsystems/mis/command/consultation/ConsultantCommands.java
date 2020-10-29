package ng.com.bitsystems.mis.command.consultation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class ConsultantCommands {
    private Long Id;
    private String middleName;
    private String firstName;
    private String lastName;
    private String sex;
    private String email;
    private LocalDate regDay;
    private String status;
    private String phone;
    private LocalDate lastLogin;
    private ServicePriceCodeCommand servicePriceCodeCommand;
    private Set<SpecializationCommand> specializationCommand = new HashSet<>();
    private Set<BookConsultationCommand> bookConsultations = new HashSet<>();
    private ServicePriceCodeCommand consultation_fee;
}
