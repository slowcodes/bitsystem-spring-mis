package ng.com.bitsystems.mis.services.springdatajpa.invoices;

import ng.com.bitsystems.mis.models.invoice.PharmacyInvoiceDetailsSale;
import ng.com.bitsystems.mis.repositories.invoices.PharmacySalesInvoiceDetailsRepository;
import ng.com.bitsystems.mis.services.invoices.PharmacySalesInvoiceDetailsService;

import java.util.HashSet;
import java.util.Set;

public class PharmacySalesInvoiceDetailsSDJPaService implements PharmacySalesInvoiceDetailsService {
    private PharmacySalesInvoiceDetailsRepository pharmacySalesInvoiceDetailsRepository;

    @Override
    public Set<PharmacyInvoiceDetailsSale> findAll() {
        Set<PharmacyInvoiceDetailsSale> pharmacyInvoiceDetailsSales = new HashSet<>();
        pharmacySalesInvoiceDetailsRepository.findAll().forEach(pharmacyInvoiceDetailsSales::add);
        return pharmacyInvoiceDetailsSales;
    }

    @Override
    public PharmacyInvoiceDetailsSale findByID(Long aLong) {
        return pharmacySalesInvoiceDetailsRepository.findById(aLong).get();
    }

    @Override
    public PharmacyInvoiceDetailsSale add(PharmacyInvoiceDetailsSale object) {
        return pharmacySalesInvoiceDetailsRepository.save(object);
    }

    @Override
    public void delete(PharmacyInvoiceDetailsSale object) {
        pharmacySalesInvoiceDetailsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        pharmacySalesInvoiceDetailsRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(PharmacyInvoiceDetailsSale object) {

    }
}
