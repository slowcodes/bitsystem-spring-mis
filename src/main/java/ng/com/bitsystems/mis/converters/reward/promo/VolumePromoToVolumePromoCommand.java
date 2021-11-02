package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.VolumeBasedPromosCommand;
import ng.com.bitsystems.mis.models.rewards.promos.VolumedBasedPromos;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class VolumePromoToVolumePromoCommand implements Converter<VolumedBasedPromos, VolumeBasedPromosCommand> {

    @Nullable
    @Override
    public VolumeBasedPromosCommand convert(VolumedBasedPromos source) {
        if(source==null)
            return null;

        VolumeBasedPromosCommand command = new VolumeBasedPromosCommand();

        command.setDateCreated(source.getDateCreated());
        command.setDescription(source.getDescription());
        command.setDiscount(source.getDiscount());
        command.setEndDay(source.getEndDay());
        command.setExclusivity(source.getExclusivity());
        command.setId(source.getId());
        command.setMinTxnTotal(source.getMinTxnTotal());
        command.setStartDay(source.getStartDay());
        command.setTitle(source.getTitle());

        if (source.getAppUsers()!=null){
            command.setUserId(source.getAppUsers().getId());
        }
        return command;
    }
}
