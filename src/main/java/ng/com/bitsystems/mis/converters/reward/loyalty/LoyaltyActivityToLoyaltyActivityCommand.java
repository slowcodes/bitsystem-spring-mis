package ng.com.bitsystems.mis.converters.reward.loyalty;

import ng.com.bitsystems.mis.command.rewards.loyalties.LoyaltyActivityCommand;
import ng.com.bitsystems.mis.models.rewards.loyalties.PatientsLoyaltyActivites;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LoyaltyActivityToLoyaltyActivityCommand implements
        Converter<PatientsLoyaltyActivites, LoyaltyActivityCommand> {
    @Override
    public LoyaltyActivityCommand convert(PatientsLoyaltyActivites source) {
        return null;
    }
}
