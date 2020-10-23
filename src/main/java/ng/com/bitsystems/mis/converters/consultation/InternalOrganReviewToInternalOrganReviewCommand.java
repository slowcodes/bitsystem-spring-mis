package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.InternalOrganReviewCommand;
import ng.com.bitsystems.mis.models.consultation.InternalOrganReview;
import org.springframework.core.convert.converter.Converter;

public class InternalOrganReviewToInternalOrganReviewCommand
implements Converter<InternalOrganReview, InternalOrganReviewCommand> {
    @Override
    public InternalOrganReviewCommand convert(InternalOrganReview source) {
        return null;
    }
}
