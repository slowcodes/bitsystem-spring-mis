package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.VolumeBasedPromosCommand;
import ng.com.bitsystems.mis.models.rewards.promos.VolumedBasedPromos;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

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
            Users users = new Users();
            users.setId(source.getUserId());
            volumedBasedPromos.setUsers(users);
             users.addVolBasedPromo(volumedBasedPromos);
        }
        volumedBasedPromos.setId(source.getId());
        return volumedBasedPromos;
    }
}
