package ng.com.bitsystems.mis.converters.reward.loyalty;

import ng.com.bitsystems.mis.command.rewards.loyalties.LoyaltyGainsCommand;
import ng.com.bitsystems.mis.models.rewards.loyalties.PatientsLoyaltyGains;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LoyaltyGainToLoyaltyGainCommand implements Converter<PatientsLoyaltyGains, LoyaltyGainsCommand> {
    @Override
    public LoyaltyGainsCommand convert(PatientsLoyaltyGains source) {
        return null;
    }
}
