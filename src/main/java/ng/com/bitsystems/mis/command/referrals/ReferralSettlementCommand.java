package ng.com.bitsystems.mis.command.referrals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class ReferralSettlementCommand {
    private Long id;
    private Long preparedById;
    private LocalDate datePrepared;
    private Double commission;

    private Set<ReferralPharmacySettlementCommand> pharmacySettlementCommands=new HashSet<>();
    private Set<ReferralLaboratorySettlementCommand> laboratorySettlementCommands=new HashSet<>();
    private Set<ReferralBloodBankSettlementCommand> bloodBankSettlementCommands=new HashSet<>();
    private Set<ReferralOtherServiceSettlementCommand> otherServiceSettlementCommands=new HashSet<>();
    private Set<ReferralVaccinationSettlementCommand> vaccinationSettlementCommands=new HashSet<>();
}
