package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.InternalOrganReviewCommand;
import ng.com.bitsystems.mis.models.consultation.Clerks;
import ng.com.bitsystems.mis.models.consultation.InternalOrganReview;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class InternalOrganReviewCommandToInternalOrganReview
implements Converter<InternalOrganReviewCommand, InternalOrganReview> {
    SymptomsDirectoryCommandToSymptomsDirectory symptomsDirectoryCommandToSymptomsDirectory;

    public InternalOrganReviewCommandToInternalOrganReview(SymptomsDirectoryCommandToSymptomsDirectory symptomsDirectoryCommandToSymptomsDirectory) {
        this.symptomsDirectoryCommandToSymptomsDirectory = symptomsDirectoryCommandToSymptomsDirectory;
    }

    @Override
    public InternalOrganReview convert(InternalOrganReviewCommand source) {

        if(source==null){
            return null;
        }

        final InternalOrganReview internalOrganReview=new InternalOrganReview();
        internalOrganReview.setId(source.getId());
        internalOrganReview.setReview(source.getReview());
        internalOrganReview.setState(source.getState());

        if(source.getClerksId()!=null){
            Clerks clerks = new Clerks();
            clerks.setId(source.getClerksId());
            internalOrganReview.setClerks(clerks);
            Clerks clerk = clerks.addInternalOrganReview(internalOrganReview);
        }

        return internalOrganReview;
    }
}
