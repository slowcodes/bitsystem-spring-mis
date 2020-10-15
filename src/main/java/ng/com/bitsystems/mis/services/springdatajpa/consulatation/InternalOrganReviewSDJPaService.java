package ng.com.bitsystems.mis.services.springdatajpa.consulatation;

import ng.com.bitsystems.mis.models.consultation.InternalOrganReview;
import ng.com.bitsystems.mis.repositories.consultations.InternalOrgansReviewRepository;
import ng.com.bitsystems.mis.services.consultations.InternalOrganReviewService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class InternalOrganReviewSDJPaService implements InternalOrganReviewService {
    private InternalOrgansReviewRepository internalOrgansReviewRepository;

    public InternalOrganReviewSDJPaService(InternalOrgansReviewRepository internalOrgansReviewRepository) {
        this.internalOrgansReviewRepository = internalOrgansReviewRepository;
    }

    @Override
    public Set<InternalOrganReview> findAll() {
        Set<InternalOrganReview> internalOrganReviews = new HashSet<>();
        internalOrgansReviewRepository.findAll().forEach(internalOrganReviews::add);
        return internalOrganReviews;
    }

    @Override
    public InternalOrganReview findByID(Long aLong) {
        return internalOrgansReviewRepository.findById(aLong).get();
    }

    @Override
    public InternalOrganReview add(InternalOrganReview object) {
        return internalOrgansReviewRepository.save(object);
    }

    @Override
    public void delete(InternalOrganReview object) {
        internalOrgansReviewRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        internalOrgansReviewRepository.deleteById(aLong);
    }

    @Override
    public void addCommand(InternalOrganReview object) {

    }
}
