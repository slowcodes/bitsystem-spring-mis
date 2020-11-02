package ng.com.bitsystems.mis.converters.reward.loyalty;

import ng.com.bitsystems.mis.command.rewards.loyalties.LoyaltyGainsCommand;
import ng.com.bitsystems.mis.models.rewards.loyalties.PatientsLoyaltyGains;
import org.springframework.core.convert.converter.Converter;

public class LoyaltyGainCommandToLoyaltyGain implements Converter<LoyaltyGainsCommand, PatientsLoyaltyGains> {
    @Override
    public PatientsLoyaltyGains convert(LoyaltyGainsCommand source) {
        return null;
    }
}
