package ng.com.bitsystems.mis.converters.reward.loyalty;

import ng.com.bitsystems.mis.command.rewards.loyalties.LoyaltyActivityCommand;
import ng.com.bitsystems.mis.models.rewards.loyalties.PatientsLoyaltyActivites;
import org.springframework.core.convert.converter.Converter;

public class LoyaltyActivityCommandToLoyaltyActivity
implements Converter<LoyaltyActivityCommand, PatientsLoyaltyActivites> {
    @Override
    public PatientsLoyaltyActivites convert(LoyaltyActivityCommand source) {
        return null;
    }
}
