package ng.com.bitsystems.mis.services.springdatajpa.invoices;

import ng.com.bitsystems.mis.models.invoice.OtherServiceInvoiceDetails;
import ng.com.bitsystems.mis.repositories.invoices.OtherServiceInvoiceDetailsRepository;
import ng.com.bitsystems.mis.services.invoices.OtherServicesInvoiceDetailsService;

import java.util.HashSet;
import java.util.Set;

public class OtherServiceInvoiceDetailsSDJPaService implements OtherServicesInvoiceDetailsService {
    private OtherServiceInvoiceDetailsRepository otherServiceInvoiceDetailsRepository;

    public OtherServiceInvoiceDetailsSDJPaService(OtherServiceInvoiceDetailsRepository otherServiceInvoiceDetailsRepository) {
        this.otherServiceInvoiceDetailsRepository = otherServiceInvoiceDetailsRepository;
    }

    @Override
    public Set<OtherServiceInvoiceDetails> findAll() {
        Set<OtherServiceInvoiceDetails> otherServiceInvoiceDetails = new HashSet<>();
        otherServiceInvoiceDetailsRepository.findAll().forEach(otherServiceInvoiceDetails::add);
        return otherServiceInvoiceDetails;
    }

    @Override
    public OtherServiceInvoiceDetails findByID(Long aLong) {
        return otherServiceInvoiceDetailsRepository.findById(aLong).get();
    }

    @Override
    public OtherServiceInvoiceDetails add(OtherServiceInvoiceDetails object) {
        return otherServiceInvoiceDetailsRepository.save(object);
    }

    @Override
    public void delete(OtherServiceInvoiceDetails object) {
        otherServiceInvoiceDetailsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        otherServiceInvoiceDetailsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(OtherServiceInvoiceDetails object) {

    }
}
