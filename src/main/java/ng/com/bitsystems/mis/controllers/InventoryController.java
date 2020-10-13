package ng.com.bitsystems.mis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inventory")
public class InventoryController {


    @RequestMapping({"/inventories","/"})
    public String inventories(){
        return "inventories.html";

    }

    @RequestMapping("/inventories/groups")
    public String groups(){
        return "inventoryGroups.html";
    }

    @RequestMapping("/inventories/per-transaction")
    public String inventoriesPerTransaction(){
        return  "invPerTransaction.html";
    }

    @RequestMapping("/in-stock")
    public String inStock(){
        return  "invInStock.html";
    }

    @RequestMapping("/requisitions")
    public String requisitions(){
        return "requisitions.html";
    }

    @RequestMapping("/requisitions/add")
    public String addRequisitions(){
        return "addRequisitions.html";
    }

    @RequestMapping("/approvals")
    public String approval(){
        return  "approval.html";
    }

    @RequestMapping("/issueOut")
    public String issueOut(){
        return  "issueOut.html";
    }
}
