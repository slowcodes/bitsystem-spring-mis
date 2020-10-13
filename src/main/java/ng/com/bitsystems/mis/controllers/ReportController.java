package ng.com.bitsystems.mis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportController {
    @RequestMapping("/reports/quality-control")
    public String qualityControl(){
        return "";
    }


    @RequestMapping("/reports/transactions")
    public String transactions(){
        return "";
    }

    @RequestMapping("/reports/transactions/sales/all")
    public String salesTransactions(){
        return "";
    }

    @RequestMapping("/reports/transactions/sales/pharmacy")
    public String pharmSales(){
        return "";
    }

    @RequestMapping("/reports/transactions/services")
    public String services(){
        return "";
    }

    @RequestMapping("/reports/transactions/services/laboratory")
    public String labServices(){
        return "";
    }

    @RequestMapping("/reports/transactions/services/consultations")
    public String consultationServices(){
        return "";
    }

    @RequestMapping("/reports/transactions/services/registration")
    public String registrations(){
        return "";
    }

    @RequestMapping("/reports/transactions/services/treatments")
    public String otherServiceReports(){
        return "otherServiceReport.html";
    }

    @RequestMapping("/reports/transactions/services/vaccination")
    public String vaccinations(){
        return "vaccinations.html";
    }

    @RequestMapping("/reports/analytics")
    public String analytics(){
        return "analytics.html";
    }

    @RequestMapping("/reports/analytics/top-services")
    public String topServices(){
        return "topServices.html";
    }

    @RequestMapping("/reports/analytics/top-products")
    public String topProduct(){
        return "topProduct.html";
    }

    @RequestMapping("/reports/least-performing-products")
    public String leastProducts(){
        return "leastProducts.html";
    }

    @RequestMapping("/reports/least-performing-services")
    public String leastServices(){
        return "leastServices.html";
    }

    @RequestMapping("reports/rewards/recieved")
    public String rewardsRecived(){
        return "receivedReward.html";
    }

    @RequestMapping("reports/rewards/recieved/product-promo")
    public String productPromo(){
        return "recievedProductPromo.html";
    }

    @RequestMapping("reports/rewards/recieved/transaction-promo")
    public String transactionPromo(){
        return "transactionPromo.html";
    }
}
