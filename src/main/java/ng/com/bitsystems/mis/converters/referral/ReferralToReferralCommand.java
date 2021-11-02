package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralCommand;
import ng.com.bitsystems.mis.converters.accounts.OtherServiceToOtherServiceCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnToLabTxnCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank.BBTxnToBBTxnCommand;
import ng.com.bitsystems.mis.converters.transaction.vaccination.VaccTxnToVaccTxnCommand;
import ng.com.bitsystems.mis.models.referrals.Referrals;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ReferralToReferralCommand implements Converter<Referrals, ReferralCommand> {
    private BBTxnToBBTxnCommand bbTxnToBBTxnCommand;
    private OtherServiceToOtherServiceCommand otherServiceToOtherServiceCommand;
    private LabTxnToLabTxnCommand labTxnToLabTxnCommand;
    private VaccTxnToVaccTxnCommand vaccTxnToVaccTxnCommand;

    public ReferralToReferralCommand(BBTxnToBBTxnCommand bbTxnToBBTxnCommand,
                                     OtherServiceToOtherServiceCommand otherServiceToOtherServiceCommand,
                                     LabTxnToLabTxnCommand labTxnToLabTxnCommand,
                                     VaccTxnToVaccTxnCommand vaccTxnToVaccTxnCommand) {
        this.bbTxnToBBTxnCommand = bbTxnToBBTxnCommand;
        this.otherServiceToOtherServiceCommand = otherServiceToOtherServiceCommand;
        this.labTxnToLabTxnCommand = labTxnToLabTxnCommand;
        this.vaccTxnToVaccTxnCommand = vaccTxnToVaccTxnCommand;
    }

    @Nullable
    @Override
    public ReferralCommand convert(Referrals source) {

        if(source==null){
            return null;
        }
        final ReferralCommand command=new ReferralCommand();
        command.setAccount(source.getAccount());
        command.setBank(source.getBank());
        command.setEmail(source.getEmail());
        command.setId(source.getId());
        command.setFirstName(source.getFirstName());
        command.setMiddleName(source.getMiddleName());
        command.setOrganisation(source.getOrganisation());
        command.setLastName(source.getLastName());
        command.setPhone(source.getPhone());
        command.setSex(source.getSex());

//        if(source.getOtherServices()!=null && source.getOtherServices().size()>0)
//            source.getOtherServices().forEach(otherServices ->
//                    command.getOtherServiceCommands().add(
//                            otherServiceToOtherServiceCommand.convert(otherServices)
//                    ));

//        if(source.getVaccinationTransactions().size()>0 && source.getVaccinationTransactions()!=null)
//            source.getVaccinationTransactions().forEach(vaccinationTransaction ->
//                    command.getVaccinationTransactionCommand().add(
//                            vaccTxnToVaccTxnCommand.convert(
//                                    vaccinationTransaction
//                            )
//                    ));

//        if(source.getPharmacyTransactions().size()>0 && source.getPharmacyTransactions()!=null)
//            source.getLaboratoryTransactions().forEach(laboratoryTransaction ->
//                    command.getLaboratoryTransactionCommand().add(
//                            labTxnToLabTxnCommand.convert(laboratoryTransaction)
//                    ));

//        if(source.getBloodbankTransactions().size()>0 && source.getBloodbankTransactions()!=null)
//            source.getBloodbankTransactions().forEach(bloodbankTransaction ->
//                    command.getBloodBankTransactionCommand().add(
//                            bbTxnToBBTxnCommand.convert(bloodbankTransaction)
//                    ));


        return command;
    }
}
