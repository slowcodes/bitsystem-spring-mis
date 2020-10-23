package ng.com.bitsystems.mis.converters.reward.loyalty;

import ng.com.bitsystems.mis.command.rewards.loyalties.LoyaltyActivityCommand;
import ng.com.bitsystems.mis.models.rewards.loyalties.PatientsLoyaltyGains;
import org.springframework.core.convert.converter.Converter;

public class LoyaltyGainCommandToLoyaltyGain implements Converter<LoyaltyActivityCommand, PatientsLoyaltyGains> {
    @Override
    public PatientsLoyaltyGains convert(LoyaltyActivityCommand source) {
        return null;
    }
}
