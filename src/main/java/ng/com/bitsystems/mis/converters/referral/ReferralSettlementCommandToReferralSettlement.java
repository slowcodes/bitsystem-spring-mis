package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralSettlementCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralSettlements;
import org.springframework.core.convert.converter.Converter;

public class ReferralSettlementCommandToReferralSettlement
        implements Converter<ReferralSettlementCommand, ReferralSettlements> {
    private ReferralLabSettlementCommandToReferralLabSettlement referralLabSettlementCommandToReferralLabSettlement;
    private ReferralBBSettlementCommandToReferralBBSettlement referralBBSettlementCommandToReferralBBSettlement;
    private ReferralOtherServiceCommandToOtherServiceSettlement referralOtherServiceCommandToOtherServiceSettlement;
    private ReferralPharmSettlementCommandToReferralPharmSettlement referralPharmSettlementCommandToReferralPharmSettlement;
    private ReferralVaccSettlementCommandToReferralVaccSettlement referralVaccSettlementCommandToReferralVaccSettlement;

    public ReferralSettlementCommandToReferralSettlement(ReferralLabSettlementCommandToReferralLabSettlement referralLabSettlementCommandToReferralLabSettlement, ReferralBBSettlementCommandToReferralBBSettlement referralBBSettlementCommandToReferralBBSettlement, ReferralOtherServiceCommandToOtherServiceSettlement referralOtherServiceCommandToOtherServiceSettlement, ReferralPharmSettlementCommandToReferralPharmSettlement referralPharmSettlementCommandToReferralPharmSettlement, ReferralVaccSettlementCommandToReferralVaccSettlement referralVaccSettlementCommandToReferralVaccSettlement) {
        this.referralLabSettlementCommandToReferralLabSettlement = referralLabSettlementCommandToReferralLabSettlement;
        this.referralBBSettlementCommandToReferralBBSettlement = referralBBSettlementCommandToReferralBBSettlement;
        this.referralOtherServiceCommandToOtherServiceSettlement = referralOtherServiceCommandToOtherServiceSettlement;
        this.referralPharmSettlementCommandToReferralPharmSettlement = referralPharmSettlementCommandToReferralPharmSettlement;
        this.referralVaccSettlementCommandToReferralVaccSettlement = referralVaccSettlementCommandToReferralVaccSettlement;
    }

    @Override
    public ReferralSettlements convert(ReferralSettlementCommand source) {
        if(source==null)
            return null;

        final ReferralSettlements referralSettlements=new ReferralSettlements();
        referralSettlements.setId(source.getId());
        referralSettlements.setCommission(source.getCommission());
        referralSettlements.setDatePrepared(source.getDatePrepared());

        if(source.getLaboratorySettlementCommands().size()>0 && source.getLaboratorySettlementCommands()!=null)
            source.getLaboratorySettlementCommands().forEach(referralLaboratorySettlementCommand ->
                    referralSettlements.getLaboratorySettlement().add(
                            referralLabSettlementCommandToReferralLabSettlement.convert(referralLaboratorySettlementCommand)
                    ));

        if(source.getBloodBankSettlementCommands().size()>0 && source.getBloodBankSettlementCommands()!=null)
            source.getBloodBankSettlementCommands().forEach(referralBloodBankSettlementCommand ->
                    referralSettlements.getBloodBankSettlement().add(
                            referralBBSettlementCommandToReferralBBSettlement.convert(referralBloodBankSettlementCommand)
                    ));

        if(source.getOtherServiceSettlementCommands().size()>0 && source.getOtherServiceSettlementCommands()!=null)
            source.getOtherServiceSettlementCommands().forEach(referralOtherServiceSettlementCommand ->
                    referralSettlements.getOtherServiceSettlements().add(referralOtherServiceCommandToOtherServiceSettlement.convert(
                            referralOtherServiceSettlementCommand
                    )));

        if(source.getPharmacySettlementCommands().size()>0 && source.getPharmacySettlementCommands()!=null)
            source.getPharmacySettlementCommands().forEach(referralPharmacySettlementCommand ->
                    referralSettlements.getPharmacySettlement().add(
                            referralPharmSettlementCommandToReferralPharmSettlement.convert(referralPharmacySettlementCommand)
                    ));

        if(source.getVaccinationSettlementCommands().size()>0 && source.getVaccinationSettlementCommands()!=null){
            source.getVaccinationSettlementCommands().forEach(referralVaccinationSettlementCommand ->
                    referralSettlements.getVaccinationSettlements().add(
                            referralVaccSettlementCommandToReferralVaccSettlement.convert(referralVaccinationSettlementCommand)
                    ));
        }
        return referralSettlements;
    }
}
