package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralSettlementCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralSettlements;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ReferralSettlementToReferralSettlementCommand
implements Converter<ReferralSettlements, ReferralSettlementCommand> {

    private ReferralLabSettlementToReferralLabSettlementCommand referralLabSettlementToReferralLabSettlementCommand;
    private ReferralBBSettlementToReferralBBSettlementCommand referralBBSettlementToReferralBBSettlementCommand;
    private ReferralOtherServiceToOtherServiceSettlementCommand referralOtherServiceToOtherServiceSettlementCommand;
    private ReferralPharmSettlementToReferralPharmSettlementCommand referralPharmSettlementToReferralPharmSettlementCommand;
    private ReferralVaccSettlementToReferralVaccSettlementCommand referralVaccSettlementToReferralVaccSettlementCommand;

    public ReferralSettlementToReferralSettlementCommand(ReferralLabSettlementToReferralLabSettlementCommand referralLabSettlementToReferralLabSettlementCommand, ReferralBBSettlementToReferralBBSettlementCommand referralBBSettlementToReferralBBSettlementCommand, ReferralOtherServiceToOtherServiceSettlementCommand referralOtherServiceToOtherServiceSettlementCommand, ReferralPharmSettlementToReferralPharmSettlementCommand referralPharmSettlementToReferralPharmSettlementCommand, ReferralVaccSettlementToReferralVaccSettlementCommand referralVaccSettlementToReferralVaccSettlementCommand) {
        this.referralLabSettlementToReferralLabSettlementCommand = referralLabSettlementToReferralLabSettlementCommand;
        this.referralBBSettlementToReferralBBSettlementCommand = referralBBSettlementToReferralBBSettlementCommand;
        this.referralOtherServiceToOtherServiceSettlementCommand = referralOtherServiceToOtherServiceSettlementCommand;
        this.referralPharmSettlementToReferralPharmSettlementCommand = referralPharmSettlementToReferralPharmSettlementCommand;
        this.referralVaccSettlementToReferralVaccSettlementCommand = referralVaccSettlementToReferralVaccSettlementCommand;
    }

    @Nullable
    @Override
    public ReferralSettlementCommand convert(ReferralSettlements source) {
        if(source==null)
            return null;

        final ReferralSettlementCommand command=new ReferralSettlementCommand();
        command.setId(source.getId());
        command.setCommission(source.getCommission());
        command.setDatePrepared(source.getDatePrepared());

        if(source.getPreparedBy()!=null){
            command.setPreparedById(source.getPreparedBy().getId());
        }

        if(source.getVaccinationSettlements().size()>0 && source.getVaccinationSettlements()!=null)
            source.getVaccinationSettlements().forEach(referralVaccinationSettlement ->
                    command.getVaccinationSettlementCommands().add(
                            referralVaccSettlementToReferralVaccSettlementCommand.convert(referralVaccinationSettlement)
                    ));

        if(source.getPharmacySettlement().size()>0 && source.getPharmacySettlement()!=null)
            source.getPharmacySettlement().forEach(referralPharmacySettlement ->
                    command.getPharmacySettlementCommands().add(
                            referralPharmSettlementToReferralPharmSettlementCommand.convert(
                                    referralPharmacySettlement
                            )
                    ));

        if(source.getOtherServiceSettlements().size()>0 && source.getOtherServiceSettlements()!=null)
            source.getOtherServiceSettlements().forEach(referralOtherServiceSettlement ->
                    command.getOtherServiceSettlementCommands().add(
                            referralOtherServiceToOtherServiceSettlementCommand.convert(
                                    referralOtherServiceSettlement
                            )
                    ));

        if(source.getBloodBankSettlement().size()>0 && source.getBloodBankSettlement()!=null)
            source.getBloodBankSettlement().forEach(referralBloodBankSettlement ->
                    command.getBloodBankSettlementCommands().add(
                            referralBBSettlementToReferralBBSettlementCommand.convert(
                                    referralBloodBankSettlement
                            )
                    ));

        if(source.getLaboratorySettlement().size()>0 && source.getLaboratorySettlement()!=null)
            source.getLaboratorySettlement().forEach(referralLaboratorySettlements ->
                    command.getLaboratorySettlementCommands().add(
                            referralLabSettlementToReferralLabSettlementCommand.convert(
                                    referralLaboratorySettlements
                            )
                    ));
        return command;

    }
}
