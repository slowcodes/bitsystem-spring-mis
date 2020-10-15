package ng.com.bitsystems.mis.services.springdatajpa.invoices;

import ng.com.bitsystems.mis.models.invoice.Invoice;
import ng.com.bitsystems.mis.repositories.invoices.InvoiceRepository;
import ng.com.bitsystems.mis.services.invoices.InvoiceService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class InvoiceSDJPaService implements InvoiceService {
    private InvoiceRepository invoiceRepository;

    public InvoiceSDJPaService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public Set<Invoice> findAll() {
        Set<Invoice> invoices = new HashSet<>();
        invoiceRepository.findAll().forEach(invoices::add);
        return invoices;
    }

    @Override
    public Invoice findByID(Long aLong) {
        return invoiceRepository.findById(aLong).get();
    }

    @Override
    public Invoice add(Invoice object) {
        return invoiceRepository.save(object);
    }

    @Override
    public void delete(Invoice object) {
        invoiceRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        invoiceRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(Invoice object) {

    }
}
