package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.StorageCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.SalesPriceCodeCommandToSalesPriceCode;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Storage;
import org.springframework.core.convert.converter.Converter;

public class StorageCommandToStorage implements Converter<StorageCommand, Storage> {
    private DonationCommandToDonation donationCommandToDonation;
    private SalesPriceCodeCommandToSalesPriceCode salesPriceCodeCommandToSalesPriceCode;
    private IssueLogCommandToIssueLog issueLogCommandToIssueLog;

    public StorageCommandToStorage(DonationCommandToDonation donationCommandToDonation,
                                   SalesPriceCodeCommandToSalesPriceCode salesPriceCodeCommandToSalesPriceCode,
                                   IssueLogCommandToIssueLog issueLogCommandToIssueLog) {
        this.donationCommandToDonation = donationCommandToDonation;
        this.salesPriceCodeCommandToSalesPriceCode = salesPriceCodeCommandToSalesPriceCode;
        this.issueLogCommandToIssueLog = issueLogCommandToIssueLog;
    }

    @Override
    public Storage convert(StorageCommand source) {

        if(source==null){
            return null;
        }
        final Storage storage=new Storage();
        storage.setId(source.getId());
        storage.setDescription(source.getDescription());

        if(source.getDonationCommand().size()>0 && source.getDonationCommand()!=null)
            source.getDonationCommand().forEach(donationCommand -> storage.getDonations().add(donationCommandToDonation.convert(donationCommand)));

        if(source.getIssuanceLogs().size()>0 && source.getDonationCommand() !=null)
            source.getIssuanceLogs().forEach(issuanceLogs ->
                    storage.getIssuanceLogs().add(issueLogCommandToIssueLog.convert(issuanceLogs)));

        storage.setSalesPriceCode(salesPriceCodeCommandToSalesPriceCode.convert(source.getSalesPriceCodeCommand()));
        storage.setLocation(source.getLocation());
        return storage;
    }
}
