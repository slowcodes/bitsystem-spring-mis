package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.OtherServiceInvoiceDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeCommandToServicePriceCode;
import ng.com.bitsystems.mis.models.accounts.AccountBooks;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import ng.com.bitsystems.mis.models.invoice.OtherServiceInvoiceDetails;
import ng.com.bitsystems.mis.models.users.Accountants;
import org.springframework.core.convert.converter.Converter;

public class OtherServiceInvoiceDetailCommandToOtherServiceInvoice
implements Converter<OtherServiceInvoiceDetailCommand, OtherServiceInvoiceDetails> {

    private ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode;
    @Override
    public OtherServiceInvoiceDetails convert(OtherServiceInvoiceDetailCommand source) {
        if(source==null){
            return null;
        }

        final OtherServiceInvoiceDetails otherServiceInvoiceDetails=new OtherServiceInvoiceDetails();
        otherServiceInvoiceDetails.setId(source.getId());

        if(source.getInvoiceId()!=null){
            Invoice invoice=new Invoice();
            invoice.setId(source.getInvoiceId());
            otherServiceInvoiceDetails.setInvoice(invoice);
            Invoice inv = invoice.addOtherServiceInvoiceDetail(otherServiceInvoiceDetails);
        }

        if(source.getExpenseBooksId()!=null){
            AccountBooks accountBooks=new AccountBooks();
            accountBooks.setId(source.getExpenseBooksId());
            otherServiceInvoiceDetails.setAccountBook(accountBooks);
            AccountBooks accountBook = accountBooks.addOtherServiceInvoiceDetails(otherServiceInvoiceDetails);
        }

        otherServiceInvoiceDetails.setStatus(source.getStatus());
        otherServiceInvoiceDetails.setComment(source.getComment());

        if(source.getCreatedById()!=null){
            Accountants accountants = new Accountants();
            accountants.setId(source.getId());
            otherServiceInvoiceDetails.setCreatedBy(accountants);
            Accountants accountant = accountants.addAccountBooks(otherServiceInvoiceDetails);
        }

        otherServiceInvoiceDetails.setDescription(source.getDescription());
        otherServiceInvoiceDetails.setFrequency(source.getFrequency());
        otherServiceInvoiceDetails.setReversal(source.getReversal());
        otherServiceInvoiceDetails.setServicePriceCode(servicePriceCodeCommandToServicePriceCode.convert(source.getServicePriceCodeCommand()));
        otherServiceInvoiceDetails.setTimeOfTransaction(source.getTimeOfTransaction());
        otherServiceInvoiceDetails.setUseDiscountPrice(source.getUseDiscountPrice());
        otherServiceInvoiceDetails.setUserDiscount(source.getUserDiscount());

        return otherServiceInvoiceDetails;
    }
}
