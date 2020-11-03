package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralCommand;
import ng.com.bitsystems.mis.converters.accounts.OtherServiceCommandToOtherService;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnCommandToLabTxn;
import ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank.BBTxnCommandToBBTxn;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.PharmSalesTxnCommandToPharmSaleTxn;
import ng.com.bitsystems.mis.converters.transaction.vaccination.VaccTxnCommandToVaccTxn;
import ng.com.bitsystems.mis.models.referrals.Referrals;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ReferralCommandToReferral implements Converter<ReferralCommand, Referrals> {
    private BBTxnCommandToBBTxn bbTxnCommandToBBTxn;
    private OtherServiceCommandToOtherService otherServiceCommandToOtherService;
    private LabTxnCommandToLabTxn labTxnCommandToLabTxn;
    private PharmSalesTxnCommandToPharmSaleTxn pharmSalesTxnCommandToPharmSaleTxn;
    private ReferralCommandToReferral referralCommandToReferral;
    private VaccTxnCommandToVaccTxn vaccTxnCommandToVaccTxn;

    public ReferralCommandToReferral(BBTxnCommandToBBTxn bbTxnCommandToBBTxn, OtherServiceCommandToOtherService otherServiceCommandToOtherService, LabTxnCommandToLabTxn labTxnCommandToLabTxn, PharmSalesTxnCommandToPharmSaleTxn pharmSalesTxnCommandToPharmSaleTxn, ReferralCommandToReferral referralCommandToReferral, VaccTxnCommandToVaccTxn vaccTxnCommandToVaccTxn) {
        this.bbTxnCommandToBBTxn = bbTxnCommandToBBTxn;
        this.otherServiceCommandToOtherService = otherServiceCommandToOtherService;
        this.labTxnCommandToLabTxn = labTxnCommandToLabTxn;
        this.pharmSalesTxnCommandToPharmSaleTxn = pharmSalesTxnCommandToPharmSaleTxn;
        this.referralCommandToReferral = referralCommandToReferral;
        this.vaccTxnCommandToVaccTxn = vaccTxnCommandToVaccTxn;
    }

    @Nullable
    @Override
    public Referrals convert(ReferralCommand source) {
        if(source==null)
            return null;
        final Referrals referrals = new Referrals();
        referrals.setId(source.getId());
        referrals.setAccount(source.getAccount());
        referrals.setBank(source.getBank());
        referrals.setEmail(source.getEmail());
        referrals.setOrganisation(source.getOrganisation());
        referrals.setFirstName(source.getFirstName());
        referrals.setLastName(source.getLastName());
        referrals.setMiddleName(source.getMiddleName());
        referrals.setPhone(source.getPhone());
        referrals.setSex(source.getSex());



        if(source.getBloodBankTransactionCommand().size()>0 && source.getBloodBankTransactionCommand()!=null)
            source.getBloodBankTransactionCommand().forEach(bloodBankTransactionCommand ->
                    referrals.getBloodbankTransactions().add(
                            bbTxnCommandToBBTxn.convert(bloodBankTransactionCommand)
                    ));

        if(source.getOtherServiceCommands().size()>0 && source.getOtherServiceCommands()!=null)
            source.getOtherServiceCommands().forEach(otherService ->
                    referrals.getOtherServices().add(
                            otherServiceCommandToOtherService.convert(otherService)
                    ));

        if(source.getLaboratoryTransactionCommand().size()>0 && source.getLaboratoryTransactionCommand()!=null)
            source.getLaboratoryTransactionCommand().forEach(laboratoryTransactionCommand ->
                    referrals.getLaboratoryTransactions().add(
                            labTxnCommandToLabTxn.convert(laboratoryTransactionCommand)
                    ));

        if(source.getPharmacySalesTransactionCommand().size()>0 && source.getPharmacySalesTransactionCommand()!=null)
            source.getPharmacySalesTransactionCommand().forEach(pharmacySalesTransactionCommand ->
                    referrals.getPharmacySalesTransactions().add(
                            pharmSalesTxnCommandToPharmSaleTxn.convert(pharmacySalesTransactionCommand)
                    ));

        if(source.getVaccinationTransactionCommand().size()>0 && source.getVaccinationTransactionCommand()!=null)
            source.getVaccinationTransactionCommand().forEach(vaccinationTransactionCommand ->
                    referrals.getVaccinationTransactions().add(
                            vaccTxnCommandToVaccTxn.convert(vaccinationTransactionCommand)
                    ));
        return referrals;
    }
}
