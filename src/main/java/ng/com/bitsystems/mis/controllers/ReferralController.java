package ng.com.bitsystems.mis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReferralController {

    @RequestMapping("/referrals")
    public String referrals(){
        return "referrals.html";
    }

    @RequestMapping("/referrals/add")
    public String addReferrals(){
        return "referrals.html";
    }

    @RequestMapping("/referrals/update")
    public String updateReferrals(){
        return "updateReferrals.html";
    }

    @RequestMapping("/referral/settlements/generate")
    public String generateReferralSettlement(){
        return "referralSettlement.html";
    }

    @RequestMapping("/referral/referrals")
    public String referralReferrals(){
        return "referralReferals.html";
    }

    @RequestMapping("/referral/settlements")
    public String settlements(){
        return "settlements.html";
    }

    @RequestMapping("/referral/referrals/update")
    public String updateReferralReferral(){

        return "referralReferralUpdate.html";
    }

    @RequestMapping()
    public String addReferraalReferral(){
        return "addReferraalReferral.html";
    }

}
