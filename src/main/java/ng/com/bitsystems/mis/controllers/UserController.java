package ng.com.bitsystems.mis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/users/account-holders")
    public String accountHolder(){
        //suspend or revoke
        //update or delete
        return "accountHolders.html";
    }

    @RequestMapping("/users/access/privileges")
    public String access_privilege(){
        return "accessPrivilege.html";
    }

    @RequestMapping("/users/access/logs")
    public String accessLogs(){
        return "accesslogs.html";
    }
}
