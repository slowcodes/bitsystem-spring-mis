package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.InternalOrganReviewCommand;
import ng.com.bitsystems.mis.models.consultation.InternalOrganReview;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class InternalOrganReviewToInternalOrganReviewCommand
implements Converter<InternalOrganReview, InternalOrganReviewCommand> {
    @Override
    public InternalOrganReviewCommand convert(InternalOrganReview source) {
        if(source==null){
            return null;
        }
        final InternalOrganReviewCommand internalOrganReviewCommand=new InternalOrganReviewCommand();
        internalOrganReviewCommand.setId(source.getId());
        internalOrganReviewCommand.setReview(source.getReview());
        if(source.getClerks()!=null)
            internalOrganReviewCommand.setClerksId(source.getClerks().getId());
        internalOrganReviewCommand.setState(source.getState());
        return internalOrganReviewCommand;
    }
}
