package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.VolumeBasedPromosCommand;
import ng.com.bitsystems.mis.models.rewards.promos.VolumedBasedPromos;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class VolumePromoCommandToVolumePromo implements Converter<VolumeBasedPromosCommand, VolumedBasedPromos> {
    @Override
    public VolumedBasedPromos convert(VolumeBasedPromosCommand source) {
        if (source==null)
            return null;

        VolumedBasedPromos volumedBasedPromos= new VolumedBasedPromos();
        volumedBasedPromos.setDateCreated(source.getDateCreated());
        volumedBasedPromos.setDescription(source.getDescription());
        volumedBasedPromos.setDiscount(source.getDiscount());
        volumedBasedPromos.setEndDay(source.getEndDay());
        volumedBasedPromos.setStartDay(source.getStartDay());
        volumedBasedPromos.setDiscount(source.getDiscount());
        volumedBasedPromos.setExclusivity(source.getExclusivity());
        volumedBasedPromos.setMinTxnTotal(source.getMinTxnTotal());
        volumedBasedPromos.setTitle(source.getTitle());

        if(source.getUserId()==null){
            AppUsers appUsers = new AppUsers();
            appUsers.setId(source.getUserId());
            volumedBasedPromos.setAppUsers(appUsers);
             appUsers.addVolBasedPromo(volumedBasedPromos);
        }
        volumedBasedPromos.setId(source.getId());
        return volumedBasedPromos;
    }
}
