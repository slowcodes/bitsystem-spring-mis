package ng.com.bitsystems.mis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PharmacyController {
    @RequestMapping("/pharmacy")
    public String pharmacy(){

        return "pharmacy.html";
    }

    @RequestMapping("/pharmacy/management/categories")
    public String pharmCategoryManagement(){

        return "pharmCategoryManagement.html";
    }

    @RequestMapping("/pharmacy/management/products")
    public String productManagement(){
        return "pharmacy.html";
    }

    @RequestMapping("/pharmacy/supply")
    public String pharmSupply(){
        return "supply.html";
    }

    @RequestMapping("/pharmacy/supply/add")
    public String pharmSupplyAdd(){
        return "stock.html";
    }

    @RequestMapping("/pharmacy/supplies")
    public String pharmSuppliers(){
        return "suppliers.html";
    }

    @RequestMapping("/pharmacy/suppliers/add")
    public String addSuppliers(){
        return "addSuppliers";
    }

    @RequestMapping("/pharmacy/suppliers/update")
    public String updateSuppliers(){
        return "updateSuppliers";
    }

    @RequestMapping("/pharmacy/dispensary")
    public String dispensary(){
        return "dispensary.html";
    }
}
