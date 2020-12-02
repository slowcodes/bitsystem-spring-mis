package ng.com.bitsystems.mis.command.referrals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.OtherServiceCommand;
import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionCommand;
import ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank.BloodBankTransactionCommand;
import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySalesTransactionCommand;
import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionCommand;

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
    private Set<LaboratoryTransactionCommand> laboratoryTransactionCommand = new HashSet<>();
    private Set<BloodBankTransactionCommand> bloodBankTransactionCommand= new HashSet<>();
    private Set<OtherServiceCommand> otherServiceCommands= new HashSet<>();
    private Set<PharmacySalesTransactionCommand> pharmacySalesTransactionCommand = new HashSet<>();
    private Set<VaccinationTransactionCommand> vaccinationTransactionCommand = new HashSet<>();
}
