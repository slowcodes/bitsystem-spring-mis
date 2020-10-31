package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.StorageCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.SalesPriceCodeToSalesPriceCodeCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Storage;
import org.springframework.core.convert.converter.Converter;

public class StorageToStorageCommand implements Converter<Storage, StorageCommand> {
    private DonationToDonationCommand donationToDonationCommand;
    private SalesPriceCodeToSalesPriceCodeCommand salesPriceCodeToSalesPriceCodeCommand;
    private IssueLogToIssueLogCommand issueLogToIssueLogCommand;

    public StorageToStorageCommand(DonationToDonationCommand donationToDonationCommand,
                                   SalesPriceCodeToSalesPriceCodeCommand salesPriceCodeToSalesPriceCodeCommand,
                                   IssueLogToIssueLogCommand issueLogToIssueLogCommand) {
        this.donationToDonationCommand = donationToDonationCommand;
        this.salesPriceCodeToSalesPriceCodeCommand = salesPriceCodeToSalesPriceCodeCommand;
        this.issueLogToIssueLogCommand=issueLogToIssueLogCommand;
    }

    @Override
    public StorageCommand convert(Storage source) {
        if(source==null)
            return null;
        final StorageCommand storageCommand= new StorageCommand();
        storageCommand.setId(source.getId());

        if(source.getDonations().size()>0 && source.getDonations()!=null)
            source.getDonations().forEach(donations -> storageCommand.getDonationCommand().add(donationToDonationCommand.convert(donations)));

        storageCommand.setDescription(source.getDescription());
        storageCommand.setLocation(source.getLocation());
        storageCommand.setSalesPriceCodeCommand(salesPriceCodeToSalesPriceCodeCommand.convert(source.getSalesPriceCode()));

        if(source.getIssuanceLogs().size()>0 && source.getIssuanceLogs()!=null)
            source.getIssuanceLogs().forEach(issuanceLogs -> storageCommand.getIssuanceLogs().add(issueLogToIssueLogCommand.convert(issuanceLogs)));

        return storageCommand;
    }
}
