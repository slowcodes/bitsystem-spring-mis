package ng.com.bitsystems.mis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RewardController {

    @RequestMapping ("/reward/loyalties")
    public String loyalties(){
        return "loyalties.html";
    }

    @RequestMapping ("/reward/loyalties/add")
    public String addLoyalties(){
        return "addLoyalties.html";
    }

    @RequestMapping ("/reward/loyalties/update")
    public String updateLoyalties(){
        return "updateLoyalties.html";
    }

    @RequestMapping("/rewards/loyalties/activities")
    public String activities(){
        return "loyaltiesActivities.html";
    }

    @RequestMapping("/rewards/loyalties/gains")
    public String loyaltyGains(){
        return "loyaltyGains.html";
    }

    @RequestMapping("/promotions")
    public String promotions(){
        return "promotions.html";
    }


    @RequestMapping("/promotions/add")
    public String addPromotions(){
        return "promotions.html";

        //Transaction Vol. Promotions
        //Product Based Promotions
    }

    @RequestMapping("/promotions/update")
    public String updatePromotions(){
        return "updatePromotions.html";
    }
}
