package ng.com.bitsystems.mis.services.springdatajpa.invoices;

import ng.com.bitsystems.mis.models.invoice.LaboratoryInvoiceDetails;
import ng.com.bitsystems.mis.repositories.invoices.LaboratoryInvoiceDetailsRepository;

import java.util.HashSet;
import java.util.Set;

public class LaboratoryInvoiceDetailsService implements ng.com.bitsystems.mis.services.invoices.LaboratoryInvoiceDetailsService {
    private LaboratoryInvoiceDetailsRepository laboratoryInvoiceDetailsRepository;

    public LaboratoryInvoiceDetailsService(LaboratoryInvoiceDetailsRepository laboratoryInvoiceDetailsRepository) {
        this.laboratoryInvoiceDetailsRepository = laboratoryInvoiceDetailsRepository;
    }

    @Override
    public Set<LaboratoryInvoiceDetails> findAll() {
        Set<LaboratoryInvoiceDetails> laboratoryInvoiceDetails = new HashSet<>();
        laboratoryInvoiceDetailsRepository.findAll().forEach(laboratoryInvoiceDetails::add);
        return laboratoryInvoiceDetails;
    }

    @Override
    public LaboratoryInvoiceDetails findByID(Long aLong) {
        return laboratoryInvoiceDetailsRepository.findById(aLong).get();
    }

    @Override
    public LaboratoryInvoiceDetails add(LaboratoryInvoiceDetails object) {
        return laboratoryInvoiceDetailsRepository.save(object);
    }

    @Override
    public void delete(LaboratoryInvoiceDetails object) {
        laboratoryInvoiceDetailsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        laboratoryInvoiceDetailsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(LaboratoryInvoiceDetails object) {

    }
}
