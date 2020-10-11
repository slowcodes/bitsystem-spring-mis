package ng.com.bitsystems.mis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceController {

    @RequestMapping("invoices/laboratory")
    public String labInvoice(){
        return "labInvoice.html";
    }

    @RequestMapping("invoices/laboratory/add")
    public String addLabInvoice(){

        return "addLabInvoice.html";
    }

    @RequestMapping("invoices/laboratory/update")
    public String updateLabInvoice(){

        return "addLabInvoice.html";
    }

    @RequestMapping("invoices/pharmacy")
    public String pharmInvoice(){

        return "pharmInvoice.html";
    }

    @RequestMapping("invoices/pharmacy/add")
    public String addPharmInvoice(){

        return  "addPharmInvoice.html";
    }

    @RequestMapping("invoices/pharmacy/update")
    public  String updatePharmInvoice(){

        return "addPharmInvoice.html";
    }


    @RequestMapping("invoices/other-services")
    public String otherServices(){

        return  "addOtherService.html";
    }

    @RequestMapping("invoices/other-services/add")
    public String addOtherServices(){

        return "addOtherServices.html";
    }

    @RequestMapping("invoices/other-services/update")
    public String updateOtherService(){

        return "addOtherServices.html";
    }
}
