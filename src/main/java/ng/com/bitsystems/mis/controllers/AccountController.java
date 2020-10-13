package ng.com.bitsystems.mis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

    @RequestMapping("/accounts")
    public String index(){

        return "";
    }

    @RequestMapping("/accounts/expense-book-manager")
    public String expenseManager(){

        return "";
    }

    @RequestMapping("/accounts/payments")
    public String payments(){

        return "";
    }

    @RequestMapping("/accounts/payments/laboratory/blood-bank")
    public String bloodBankPayment(){
        return "";
    }

    @RequestMapping("/accounts/payments/companies")
    public String companyPayments(){
        return "";
    }

    @RequestMapping("/accounts/payments/laboratory")
    public String laboratoryPayments(){
        return "";
    }

    @RequestMapping("/accounts/payments/pharmacy")
    public String pharmacyPayments(){
        return "";
    }

    @RequestMapping("/accounts/payments/other-services")
    public String otherServicePayment(){
        return "";
    }

    @RequestMapping("/accounts/payments/vaccination")
    public String vaccinationPayment(){
        return "";
    }

    @RequestMapping("/accounts/payment/process-payments")
    public String processPayments(){
        return "";
    }

    @RequestMapping("/accounts/insurance")
    public String insurance(){
        return "insurance.html";
    }

    @RequestMapping("/accounts/insurance/add")
    public String addInsurance(){
        return "addInsurance.html";
    }

    @RequestMapping("/accounts/insurance/update")
    public String updateInsurance(){
        return "updateInsurance.html";
    }

    @RequestMapping("/accounts/insurance/transactions")
    public String insuranceTransactions(){
        return "";
    }

    @RequestMapping("/accounts/insurance/transactions/pharmacy")
    public String insuredPharmacyTransactions(){
        return "";
    }

    @RequestMapping("/accounts/insurance/transactions/laboratories")
    public String insuredLaboratoryTransactions(){
        return "";
    }

    @RequestMapping("/accounts/insurance/transactions/consultations")
    public String insuredConsultations(){
        return "";
    }

    @RequestMapping("/accounts/insurance/transactions/other-services")
    public String insuredOtherServices(){
        return "";
    }

    @RequestMapping("/accounts/insurance/programs")
    public String insurancePrograms(){
        return "";
    }

    @RequestMapping("/accounts/reports/income-statement")
    public String incomeStatement(){
        return "";
    }

    @RequestMapping("/accounts/reports/pl")
    public String profitAndLossAccount(){
        return "";
    }

    @RequestMapping("/accounts/pricing")
    public String pricing(){
        return "";
    }

    @RequestMapping("/accounts/pricing/rate-types")
    public String rateTypes(){
        return "";
    }

    @RequestMapping("/accounts/pricing/sales")
    public String salesPricingCode(){
        return "";
    }

    @RequestMapping("/accounts/pricing/services")
    public String servicePricingCode(){
        return "";
    }
}
